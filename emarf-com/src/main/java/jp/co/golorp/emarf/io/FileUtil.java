/*
Copyright 2022 golorp

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package jp.co.golorp.emarf.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.exception.SysError;

/**
 * ファイル操作ユーティリティ
 *
 * @author golorp
 */
public final class FileUtil {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(FileUtil.class);

    /** プライベートコンストラクタ */
    private FileUtil() {
    }

    /** コンテキストパス */
    private static String contextDir;

    /**
     * @return コンテキストパス
     */
    public static String getContextDir() {
        return contextDir;
    }

    /**
     * @param p コンテキストパス
     */
    public static void setContextDir(final String p) {
        FileUtil.contextDir = p;
    }

    /**
     * @param filePath ファイルパス
     * @return File ファイル実体
     */
    public static File get(final String filePath) {
        String pathname = contextDir + File.separator + filePath;
        pathname = pathname.replaceAll("[\\\\|\\/]+", "\\" + File.separator);
        LOG.debug("pathname: " + pathname);
        String dirname = pathname.replaceFirst("[^\\\\]+$", "");
        dirname = pathname.replaceFirst("[^\\/]+$", "");
        LOG.debug("dirname : " + dirname);
        try {
            Files.createDirectories(Paths.get(dirname));
        } catch (IOException e) {
            throw new SysError(e);
        }
        return new File(pathname);
    }

    /**
     * 指定した配下の全てを削除
     * @param file 削除するファイルかパス
     */
    public static void forceDelete(final File file) {
        File[] files = file.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isDirectory()) {
                    forceDelete(f);
                } else {
                    f.delete();
                }
            }
        }
        file.delete();
    }

    /**
     * 指定したパスを再作成
     * @param pathname 再作成するパス
     */
    public static void reMkDir(final String pathname) {
        File gridFolder = new File(pathname);
        if (gridFolder.exists()) {
            FileUtil.forceDelete(gridFolder);
        }
        gridFolder.mkdirs();
    }

    /**
     * ファイル出力
     * @param filePath 出力ファイルパス
     * @param s 出力文字列のリスト
     */
    public static void writeFile(final String filePath, final List<String> s) {
        FileWriter w = null;
        try {
            w = new FileWriter(new File(filePath));
            for (String line : s) {
                w.write(line + "\r\n");
            }
            w.flush();
        } catch (IOException e) {
            throw new SysError(e);
        } finally {
            try {
                w.close();
            } catch (IOException e) {
                throw new SysError(e);
            }
        }
    }

}

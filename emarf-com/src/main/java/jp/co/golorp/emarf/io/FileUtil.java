package jp.co.golorp.emarf.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import jp.co.golorp.emarf.exception.SysError;

public final class FileUtil {

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
     * @param p
     */
    public static void setContextDir(final String p) {
        FileUtil.contextDir = p;
    }

    /**
     * @param filePath
     * @return File
     */
    public static File get(final String filePath) {
        String pathname = contextDir + File.separator + filePath;
        pathname = pathname.replaceAll("[\\\\|\\/]+", "\\" + File.separator);
        try {
            Files.createDirectories(Paths.get(pathname.replaceFirst("[^\\\\]+$", "")));
        } catch (IOException e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        }
        return new File(pathname);
    }

    /**
     * @param file
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
     * @param pathname
     */
    public static void reMkDir(final String pathname) {
        File gridFolder = new File(pathname);
        if (gridFolder.exists()) {
            FileUtil.forceDelete(gridFolder);
        }
        gridFolder.mkdirs();
    }

    /**
     * @param filePath
     * @param s
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

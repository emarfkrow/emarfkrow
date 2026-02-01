# Quick Start

**Eclipse(Pleiades All in One)での開始方法について記載します。**

---

## リポジトリのクローン

emarfkrow本体とサンプルアプリケーションをcloneします。  
eclipse内のGUIで行っても問題ありません。

```
git clone https://github.com/emarfkrow/emarfkrow.git
git clone https://github.com/emarfkrow/sample.git
```

各リポジトリ内からプロジェクトをインポートします。

- emarf-com：システム共通
- emarf-job：バッチ共通
- emarf-web：ウェブ共通
- samplecom：サンプル共通（自動生成させるプロジェクト）
- samplejob：バッチサンプル
- sampleweb：ウェブサンプル

プロジェクトの依存関係は以下の通りになっています。

```
emarf-com
├ emarf-job ┐
└ emarf-web ┴ samplecom
                ├ samplejob
                └ sampleweb
```

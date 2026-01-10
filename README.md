# DB-First Web Application Generator

**DB設計から業務Webシステムを自動生成する  
再生成しても壊れない Java Servlet ベース OSS**

---

## What is this?

既存のデータベース定義（DDL）を起点に、  
検索画面・CRUD単票画面を含む業務Webアプリケーションを  
**自動生成**するフレームワークです。

生成後は継承によって安全にカスタマイズでき、  
DDL変更後も**再生成によるデグレは発生しません。**

---

## Features

- テーブルから CRUD 単票画面を自動生成
- ビューから検索画面を自動生成
- Java Servlet ベースの3階層構成
- 認証・認可機能を標準搭載
- トランザクション管理を標準搭載
- アノテーションによるバリデーション定義
- カスタムバリデーション対応
- DB方言はサブクラスで吸収
- **再生成してもカスタマイズコードは壊れません**

---

## Why this exists

多くの自動生成ツールは、  
「生成したコードを直接修正する」ことを前提にしています。

本OSSは、

- 自動生成コードは参照専用
- 実装は必ず継承クラスで行う

という設計を採用しています。

これにより、  
DDL変更後も安全に再生成できる仕組みを実現しています。

---

## Who should use this?

### 向いている人

- Java Servlet ベースの業務Webシステムを開発している
- DB設計を重視している
- CRUD実装や検索画面作成の工数を削減したい
- 自動生成後も手動でロジックを追加したい

### 向いていない人

- React / SPA 前提のフロントエンド開発
- ノーコード／ローコードツールを求める人
- DB設計ルールを設けたくない場合

---

## Architecture

    Database
      |
      v
    DDL
      |
      v
    Generated Project (read-only, auto-generated)
      |
      v  (extend)
    Application Project (custom implementation)

再生成しても **Application Project のコードは影響を受けません。**

---

## Get Started

- [Quick Start](docs/quickstart.md)
- [DB Design Guideline](docs/db-design-guideline.md)
- [Sample Application](samples/)

---

## License

This project is released as Open Source Software.

---

## Philosophy

本OSSは、自由度よりも

- 保守性
- 再生成耐性
- 業務システムの安定運用

を優先しています。

**DB設計を正として、安全に業務Webシステムを量産する**  
それが本OSSの思想です。

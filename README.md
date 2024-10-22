# Drone

## 開発環境

- Java 11
- Spring 2.7.15

### アプリ起動

```
$ docker-compose up
```

http://localhost:8080/ を開く


## デプロイ： ECS Fargate by App Runner の構築

App Runnerはフルマネージド型のコンテナアプリケーションサービスであり、簡単に ECS・Fargate で Web アプリを構築できる。
AWSの管理画面を開いて、App Runnerで「サービスの作成」をする。

**ソースおよびデプロイ**

1. 「ソースコードリポジトリ」を選択してGitHubと連携する
2. GitHub連携の「ソースディレクトリ」は「/dev」を指定する

**デプロイ設定**

1. 「自動」を選択する

**構築を設定**

1. ランタイムは「Corretto 11」を選択する
2. AppRunner 上ではビルドコマンドとスタートコマンドを設定する。

```
$ mvn clean package
$ java -Xms256m -jar target/dev-0.0.1.jar
```

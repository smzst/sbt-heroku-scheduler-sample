# sbt-heroku-scheduler-sample

SBT プロジェクトを Heroku Scheduler で動かしてみるためのサンプルコードです。

ユーザーが定義した任意のタイミング（分 / 時 / 日ごと）で `Hello, world!` を標準出力します。

## Usage

Heroku Scheduler のアドオンを追加し、アプリケーションのダッシュボードからタスクを登録してください。

登録するタスク名は `job` です。

手元で実行する場合は以下を実行してください。CLI で管理しているアプリケーションが 1 つの場合は関係ありませんが、
`YOUR_APP_NAME` は `heroku create` コマンドやブラウザから作成したアプリケーションの名前を指定してください。

```bash
$ heroku run job [--app <YOUR_APP_NAME>]
```
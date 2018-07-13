# kotlin-spring-vue
kotlin spring + vue.jsで作るWebアプリケーションです。友人と現在作成中です。

## アプリケーション説明
未定

## How to Build

**Back-end**

```
$  cd kotlin-back-end
$ ./gradlew bootRun
or
$ ./gradlew build
check http://localhost:9000

IntelliJで開く場合
IntelliJ の kotlin が更新されてることを確認 (IntelliJのpluginから確認)
/kotlin-back-end のディレクトリから開き import project でプロジェクトを開く
gradle をビルドして問題なければ、KotlinSpringVueApplication.kt をRunして実行

```


**Front-end**

```
$  cd vue-front-end
$  npm install
$  npm run dev
check http://localhost:8080
```


## TODO
### back-end
- 初期schema流し込み
- 固定portでの起動（application.ymlに設定）
- doma2でのORマッパー確認
- お試し的なCRUDの作成

### front-end
- axiosでのAPI疎通確認
- テーマカラー選定

## システム構成
### back-end
- Kotlin
- SpringBoot
- mysql
- doma2

### front-end
- vue.js
- axios
- vue-material

# ベースイメージ
FROM amazoncorretto:21-alpine AS builder

# 作業ディレクトリの設定
WORKDIR /app

# Gradle Wrapper とプロジェクトファイルをコピー
COPY gradlew .
COPY gradle/ ./gradle
COPY build.gradle.kts settings.gradle.kts ./
COPY src ./src

# 権限を付与して Gradle Wrapper を実行可能にする
RUN chmod +x ./gradlew

# ビルド
RUN ./gradlew build -x test

# 実行環境用イメージ
FROM amazoncorretto:21-alpine
WORKDIR /app

# ビルド成果物をコピー
COPY --from=builder /app/build/libs/*.jar app.jar

# アプリケーションの起動
ENTRYPOINT ["java", "-jar", "app.jar"]




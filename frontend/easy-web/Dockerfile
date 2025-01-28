# ベースイメージ
FROM node:18-alpine AS builder

# 作業ディレクトリの設定
WORKDIR /app

# 必要なファイルをコピーして依存関係をインストール
COPY package.json package-lock.json ./
RUN npm install

# アプリケーションソースをコピーしてビルド
COPY . .
RUN npm run build

# 実行環境用イメージ
FROM node:18-alpine

# 作業ディレクトリの設定
WORKDIR /app

# ビルド成果物をコピー
COPY --from=builder /app ./

# Next.js を起動
CMD ["npm", "run", "start"]


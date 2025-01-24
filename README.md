# SpringBoot-FileUpload
> 這是一個使用 SpringBoot 實作的 Base64 圖檔上傳範例
> 搭配 nginx 驗證上傳檔案之容量限制 `client_max_body_size`

### 建立 docker image
```bash
docker build --no-cache -f ./Dockerfile -t springboot-fileupload:v1 .
```

### 啟動 docker container
```bash
docker run -itd \
  --rm \
  --name springboot-fileupload \
  -p 18080:8080 \
  -v /Users/roger/Desktop/temp/:/app/uploaded_files/ \
  springboot-fileupload:v1
```

### 啟動 docker compose
```bash
docker compose -f ./docker-compose.yaml up -d
```

## nginx 設定
```nginx
client_max_body_size 10K; # 限制上傳文件大小 (預設 1M)
```
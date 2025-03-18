# Sử dụng node:18 làm base image
FROM node:18

# Tạo thư mục làm việc trong container
WORKDIR /app

# Sao chép package.json và cài đặt các phụ thuộc
COPY package*.json ./
RUN npm install

# Sao chép toàn bộ mã nguồn vào container
COPY . .

# Mở cổng 3000 để container có thể nhận yêu cầu
EXPOSE 3000

# Lệnh khởi động ứng dụng
CMD ["npm", "start"]

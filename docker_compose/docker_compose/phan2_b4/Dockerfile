# Sử dụng image Node.js chính thức
FROM node:18

# Đặt thư mục làm việc trong container
WORKDIR /app

# Sao chép package.json và cài đặt dependencies
COPY package.json ./
RUN npm install

# Sao chép toàn bộ code vào container
COPY . .

# Chạy ứng dụng Node.js
CMD ["npm", "start"]

# Expose cổng 3000
EXPOSE 3000

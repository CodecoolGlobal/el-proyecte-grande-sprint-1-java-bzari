FROM node:18-alpine3.16
WORKDIR /app

# add `/app/node_modules/.bin` to $PATH
ENV PATH /app/node_modules/.bin:$PATH

# install app dependencies
COPY package.json ./
COPY package-lock.json ./
RUN npm install react-scripts@5.0.1 -g
RUN npm install --force
COPY ./ ./

CMD ["npm", "start"]
EXPOSE 3000
mvn clean package
docker build -t terra-visio-app:terra-visio -f dockerize.dockerfile .
docker build -t terra-visio-database:terra-visio-db -f database.dockerfile .
sudo ufw allow 3000
docker-compose up


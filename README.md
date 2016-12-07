# SEP Request Change Collector

## Build

### Docker
```sh
mvn package
docker build -t sep-app .
docker run -p 4000:8080 -it sep-app
```
Then the app is running at `localhost:4000/sep-app`.
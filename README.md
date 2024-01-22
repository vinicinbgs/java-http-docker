# ☕ Java Http Server - Docker

### Build and Access
```sh
docker-compose up -d --build
curl http://localhost:8089
```

### Compile
```sh
javac *.java
```

### Generate .jar file
```sh
jar cfe my.jar com.main.Index com/main/Index.class pack/HttpReply.class
```

### Run .jar file
```sh
java -jar
```

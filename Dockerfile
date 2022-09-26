FROM amazoncorretto

COPY . .

RUN javac com/main/Index.java pack/HttpReply.java
RUN jar cfe my.jar com.main.Index com/main/Index.class pack/HttpReply.class

CMD ["java", "-jar", "my.jar"]
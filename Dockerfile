FROM openjdk:17-jdk-slim

WORKDIR /app

COPY . /app

RUN javac src/main/java/com/damien/*.java -d out

CMD ["java", "-cp", "out", "com.damien.App"]
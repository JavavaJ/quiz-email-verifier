FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/quiz-email-verifier.jar
COPY ${JAR_FILE} quiz-email-verifier.jar
ENTRYPOINT ["java", "-jar", "quiz-email-verifier.jar"]

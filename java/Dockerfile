FROM maven:3-openjdk-15
COPY ./pom.xml /java-kata/pom.xml
WORKDIR /java-kata
RUN mvn dependency:resolve

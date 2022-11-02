FROM openjdk:11
VOLUME /tmp
EXPOSE 8080
ADD ./target/salessans-0.0.1-SNAPSHOT.jar SalesSans.jar
ENTRYPOINT ["java","-jar","/SalesSans.jar"]
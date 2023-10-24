FROM openjdk:8

WORKDIR /usrapp/bin

ENV PORT 4567

COPY /target/classes /usrapp/bin/classes
COPY /target/dependency /usrapp/bin/dependency

COPY /src/main/resources /usrapp/bin/resources

CMD ["java","-cp","./classes:./dependency/*","org.example.CollatzService"]
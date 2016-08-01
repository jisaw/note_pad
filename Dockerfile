FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/note_pad.jar /note_pad/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/note_pad/app.jar"]

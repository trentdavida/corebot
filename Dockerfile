FROM java:8-jdk

MAINTAINER Pete Cornish <outofcoffee@gmail.com>

WORKDIR /build
ADD . ./
RUN ./gradlew installDist

RUN mkdir -p /opt/corebot /opt/corebot/config

RUN mv bot/build/install/bot /opt/corebot

CMD ["/opt/corebot/bot/bin/bot"]


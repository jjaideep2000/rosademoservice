FROM eclipse/ubuntu_jdk8
# maintainer
MAINTAINER "Jaideep Joshi <jaideep.joshi@ibm.com>"

RUN git clone https://github.com/jjaideep2000/calculator.git
WORKDIR "./calculator"
RUN mvn -f ./pom.xml clean package
RUN mvn spring-boot:run
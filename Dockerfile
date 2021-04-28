FROM eclipse/ubuntu_jdk8
# maintainer
MAINTAINER "Jaideep Joshi <jaideep.joshi@ibm.com>"

RUN git clone https://github.com/jjaideep2000/rosademoservice.git
WORKDIR "./rosademoservice/target"
ENTRYPOINT ["java","-jar","./rosademoservice-0.0.1-SNAPSHOT.jar"]

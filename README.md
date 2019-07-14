[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

# Producer and consumer

Producer and Consumer application using Apache Kafka as `Message Broker`.

## Message Broker

"A **message broker** (also known as an integration broker or interface engine) is an intermediary computer 
program module that translates a message from the formal messaging protocol of the sender to the formal messaging 
protocol of the receiver."


## Project's architeture

### 1 Queue

- **master branch**

![One queue](/img/one-queue.png)


### 2 Queues

- **two-queues branch**

![Two queues](/img/two-queues.png)


### Running

First of all, you should have a `Docker Kafka container` running: 

```
docker-compose up
```

After, set your java version to **10.x.x** and: 

```
./gradlew clean build bootrun
```

### Environment

- Java 10.0.2
- Gradle 4.7+
- Spring boot 2.0.3

### Kafka Docker

The Apache's Kafka docker configuration was taken in [this github.](https://github.com/wurstmeister/kafka-docker)

### References

- https://github.com/wurstmeister/kafka-docker
- https://kafka.apache.org
- https://en.wikipedia.org/wiki/Message_broker

### License
Apache License. [Click here for more information.](LICENSE)
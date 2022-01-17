This system is composed by 2 microservices and 1 proxy:

### Microservices:
### Buying:
This is a mock microservice with the responsibility of allowing the user to buy a vehicle,
in this case we have a controller named CarController which is a mock controller that returns
a text that says "You are looking for all available cars to buy".

this microservice is uploading on the port 8081

### Selling
This is a mock microservice with the responsibility of let the user sell a vehicle,
in this case we have a controller named TruckController which is a mock controller that returns
a that says "You are looking for all available trucks to sell".

this microservice is uploading on the port 8082

### Proxy
This is a Proxy that redirects the request to the correct port, this proxy is listening on the port 8080,
if you make a request to http://localhost:8080/buying/car it will redirect the request to 
http://localhost:8081/buying/car, if you make a request to http://localhost:8080/selling/truck it will redirect
the request to http://localhost:8082/selling/truck.

This proxy works as follows:

The proxy module is implemented a Spring Cloud gateway to redirect all the request that came through port 8080
this is implemented on SpringCloudConfig class which is a configuration class, every request made to /selling is redirected
to port 8081 and every request made to /bulling is redirected to port 8081.

In this project we have a Filter called LogFilter that is responsible for logging all request headers

## Dependencies:

If you want to run this application you must have the following installed:

- Java 17
- Gradle 7
- Docker

## Run with Docker-compose
To run the application you need to do the following steps:
- Click gradle task/build in each project
- Open a terminal, go to Docker folder and run the following command:

docker-compose up --build
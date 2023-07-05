# Ktor for KMM

-----

- **KMM**
  - Kotlin Multiplatform for mobile
- **Ktor**
  - Framework to build connected applications - web app, HTTP services, Mobile and browser app
- **Natty**
  - To run a Ktor server application, you need to create and configure a server first.
  - This server configuration includes an engine, host, port , SSL settings etc.
  - Natty is engine which we are using here.
  - Other engines Ktor supports are Jetty, Tomcat, CIO, ServletApplicationEngine
  - Natty use JVM platform and HTTP/2 protocol
  
### What this repo includes

-----

- Simple REST API With Ktor and show data in  Android App
- I used IntelliJ IDEA 2022.2.2 (Edu) for development
- Getting random Rabbit information in Json format
- Images are stored in the application itself

### Plugins added are

-----

- **Monitoring**
  - CallLogging : tor provides the capability to log application events using SLF4J library.
- **Routing**
  - Routing is the core Ktor plugin for handling incoming requests in a server application.
 
- **Serialization**
  - kotlinx.serialization : We use this.
  - Gson
  - Jackson

### API Calling

-----

- in cmd type "ipconfig" and copy the address of your Ethernet adapter: IPV4 Address

~~~
http://X.X.X.X:8080/randomrabbit

{
	"name": "Carl",
	"description": "A cute brown rabbit",
	"imageUrl": "http://X.X.X.X:8080/rabbits/1_rabbit.jpg"
}

~~~

### Reference

-----

#### Project setup and learnings
https://www.youtube.com/watch?v=c6I3Dw0xDlQ
#### Ktor
https://ktor.io/docs/welcome.html
#### KMM
https://kotlinlang.org/docs/multiplatform-mobile-getting-started.html

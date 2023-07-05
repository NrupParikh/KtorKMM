# KtorKMM
 
- Simple REST API With Ktor and show data in  Android App
- I used IntelliJ IDEA 2022.2.2 (Edu) for development
- Getting random Rabbit information in Json format
- Images are stored in the application itself

### Plugins added are
- **Monitoring**
  - CallLogging : tor provides the capability to log application events using SLF4J library.
- **Routing**
  - Routing is the core Ktor plugin for handling incoming requests in a server application.
 
- **Serialization**
  - kotlinx.serialization : We use this.
  - Gson
  - Jackson

### API Calling

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
https://www.youtube.com/watch?v=c6I3Dw0xDlQ

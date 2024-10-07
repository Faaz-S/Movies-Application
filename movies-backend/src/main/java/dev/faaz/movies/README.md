pom.xml is used to store the dependencies of the project.
Usually we don't keep the username and password etc. in the properties file as it is confidential. To fix this we keep 
that info in a .env file. I have not done it for simplicity in this project.

****  @RestController  ****

Key Features of @RestController
Combination of @Controller and @ResponseBody:

When you annotate a class with @RestController, it implicitly includes the @Controller and @ResponseBody annotations.
This means that the methods in the class return data directly to the client rather than returning a view name, which is common in traditional web applications.
Response Handling:

By default, the return type of the methods in a @RestController is converted to JSON (or XML, if configured) and sent back to the client in the HTTP response body.
This makes it easier to build RESTful APIs that communicate with clients using JSON data.
Simplifies API Development:

It simplifies the development of RESTful services by removing the need to annotate each method with @ResponseBody.
Developers can focus on creating endpoints that directly handle HTTP requests and responses without additional boilerplate code.


There are 2 types of data in this project: Movies and Reviews

I used Postman to test if the API was working as desired.
# Resource-server

I create this project based on this web site [Click here](https://blog.marcosbarbero.com/centralized-authorization-jwt-spring-boot2/).
I just removed uneccessary code and configuration. You can take a look on that website to read the theory.

## Installation

Clone this project and run it. Resource server just need public key in resourtces folder. 

Prerequisites:

- Java8 or greater
- Eclipse or similar
- A computer :D
- Time

## Usage

After run this project you can hit it with the following url: 

```bash
http://127.0.0.1:8100/resource-server/details
```
This server is running in port 8100, you can change it in application.properties file.
```
server.port=8100
server.servlet.contextPath=/resource-server
```

See the images resource-server-1.png to understand hhow to hit the server using Postman. You can find the images in resource folder. The resource server is going to print the token information.
Does not contains a custom API to consume, is just a simple example to verify the token created by `authorization-server`.

## Configuration

First run `Authorization-server` and get a token, then use that token in `Autorization` property in headers.

## JKS File

This server is going to use is going to use the public key to validate the token. You can find the public key in resources folder. 
```
public-jwt.key
```
The token is created by `authorization-server` using jks file, this file is in resources folder. Find this project to understand more. I have two versions of Authorization-server, one version uses H2 database and the second version uses MySQL.

You can find in my space related projects. You can find in one of my projects an example of how to create jks file and public key.

Enjoy it!!!!

# miceroservices-using-spring-cloud-spring-boot

 * Here Create 2 microservices
 
* Register microservice in Eureka Service Discovery
 
* integrate Spring Cloud Gateway for routing user request

* Integrate Hystrix identify failure for downstream services

* Spring cloud config server using Git to Centralize configuration across application


````
URL : http://localhost:9005/order/bookOrder
HTTP Method : POST
````
json Request:

````
{
	"order":{
		"id":103,
		"name":"Mobile",
		"qty":1,
		"price":8000
		
	},
	"payment":{}
}
````
json Response:

````
{
    "order": {
        "id": 26,
        "name": "ear-phone",
        "qty": 5,
        "price": 4000
    },
    "amount": 4000,
    "transactionId": "9a021fa6-2061-4332-bdb7-b1358b3430c2",
    "message": "payment processing successful and order placed"
}
````


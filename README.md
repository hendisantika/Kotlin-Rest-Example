# Kotlin-Rest-Example

How to run this repo?

`mvn clean install spring-boot:run`

Test the API in your command line

Add New User
```$xslt
curl -i -H "Accept: application/json" -H "Content-Type: application/json" -X POST -d '{"name":"sasuke", "age" : 25}' http://localhost:8080/users/add

```

Get All User
```
curl -i -H "Accept: application/json" -H "Content-Type: application/json" -X GET http://localhost:8080/users/all
```

Find User by name
```$xslt
curl -i -H "Accept: application/json" -H "Content-Type: application/json" -X GET http://localhost:8080/users/find?name=sasuke
```

Or you can you user POSTMAN
Get All User API : localhost:8080/users/all
Method : GET

```$xslt
[
  {
    "name": "Hendi Santika",
    "age": 22,
    "id": 1
  },
  {
    "name": "Uzumaki Naruto",
    "age": 24,
    "id": 2
  },
  {
    "name": "Uchiha madara",
    "age": 125,
    "id": 3
  }
]
```


Add New User API : localhost:8080/users/add
Method : POST

```$xslt
{
    "name": "madara",
    "age": 125
}
```

FInd User by Name API : localhost:8080/users/find?name=madara
Method : POST

```$xslt
[
    { "name":"obito",
      "age":25,
      "id":3
     }
]
```




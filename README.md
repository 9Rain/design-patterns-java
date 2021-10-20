# Design Patterns Implementation in Java

Simple project built for the implementation of the Facade, Strategy and Singleton design patterns, in Java, using Spring Boot.

The project is divided into 2 parts, a "microservice" with a CRUD of Pokémon and another, which given the type of Pokémon, returns its strengths and weaknesses.

## Stack

- Spring Web
- Spring Data JPA
- H2 Database
- OpenFeign
- Java 11
- Gradle

## Running the project

Run the following terminal command in each project's main folders:

```shell script
./gradlew bootRun
```

## Endpoints

For Pokémon management:

```
POST http://localhost:8081/api/v1/pokemon
```

```
GET http://localhost:8081/api/v1/pokemon
```

```
GET http://localhost:8081/api/v1/pokemon/:id
```

```
PUT http://localhost:8081/api/v1/pokemon/:id
```

```
DELETE http://localhost:8081/api/v1/pokemon/:id
```

For strengths and weaknesses check:

```
GET http://localhost:8082/api/v1/:typeName/strength
```

```
GET http://localhost:8082/api/v1/:typeName/weakness
```
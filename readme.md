
# Todo App Backend

Backend for a todo list application

## Authors

- [@SvenGlauser](https://www.github.com/svenglauser)

## Deploy application

### Build

#### Build with Maven 

`mvn clean package`

### Deploy to docker

#### Docker create image 

`docker build -t todo-backend .`

#### Docker compose image with postgresql 

`docker compose up`

## API Reference

### Get users

```http
GET /todo/v1/users
```

#### recupererUsers()

Return a list of all users

### Post user

```http
POST /todo/v1/users
```

| Parameter     | Type   | Description                  |
|:--------------|:-------|:-----------------------------|
| `RequestBody` | `user` | **Required**. User to create |

#### creerUser()

Return the created user

### Put user

```http
PUT /todo/v1/users
```

| Parameter     | Type   | Description                  |
|:--------------|:-------|:-----------------------------|
| `RequestBody` | `user` | **Required**. User to modify |

#### modifierUser()

Return the modified user

### Get progression

```http
GET /todo/v1/progression
```

#### recupererProgressions()

Return a list of all progression

### Post progression

```http
POST /todo/v1/progression
```

| Parameter     | Type     | Description                    |
|:--------------|:---------|:-------------------------------|
| `RequestBody` | `progression` | **Required**. Progression to create |

#### creerProgression()

Return the created progression

### Put progression

```http
PUT /todo/v1/progression
```

| Parameter     | Type     | Description                    |
|:--------------|:---------|:-------------------------------|
| `RequestBody` | `progression` | **Required**. Progression to modify |

#### modifierProgression()

Return the modified progression

### Get taches

```http
GET /todo/v1/taches
```

#### recupererTaches()

Return a list of all taches

### Post tache

```http
POST /todo/v1/taches
```

| Parameter     | Type   | Description                  |
|:--------------|:-------|:-----------------------------|
| `RequestBody` | `tache` | **Required**. Tache to create |

#### creerTache()

Return the created tache

### Put tache

```http
PUT /todo/v1/taches
```

| Parameter     | Type   | Description                  |
|:--------------|:-------|:-----------------------------|
| `RequestBody` | `tache` | **Required**. Tache to modify |

#### modifierTache()

Return the modified tache

## Tech Stack

**Server:** Spring Boot, Spring Boot Security, Lombok, Liquibase

## Source

Use [readme.so](https://readme.so/editor) to generate this readme file

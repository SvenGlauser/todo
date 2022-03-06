
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

### Get status

```http
GET /todo/v1/status
```

#### recupererStatus()

Return a list of all status

### Post status

```http
POST /todo/v1/status
```

| Parameter     | Type     | Description                    |
|:--------------|:---------|:-------------------------------|
| `RequestBody` | `status` | **Required**. Status to create |

#### creerStatus()

Return the created status

### Put status

```http
PUT /todo/v1/status
```

| Parameter     | Type     | Description                    |
|:--------------|:---------|:-------------------------------|
| `RequestBody` | `status` | **Required**. Status to modify |

#### modifierStatus()

Return the modified status

### Get tasks

```http
GET /todo/v1/tasks
```

#### recupererTasks()

Return a list of all tasks

### Post task

```http
POST /todo/v1/tasks
```

| Parameter     | Type   | Description                  |
|:--------------|:-------|:-----------------------------|
| `RequestBody` | `task` | **Required**. Task to create |

#### creerTask()

Return the created task

### Put task

```http
PUT /todo/v1/tasks
```

| Parameter     | Type   | Description                  |
|:--------------|:-------|:-----------------------------|
| `RequestBody` | `task` | **Required**. Task to modify |

#### modifierTask()

Return the modified task

## Tech Stack

**Server:** Spring Boot, Spring Boot Security, Lombok, Liquibase

## Source

Use [readme.so](https://readme.so/editor) to generate this readme file

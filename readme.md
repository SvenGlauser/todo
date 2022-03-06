
# Todo App Backend

Backend for a todo list application


## Authors

- [@SvenGlauser](https://www.github.com/svenglauser)


## API Reference

### Get users

```http
GET /todo/v1/users
```

#### getUsers()

Return a list of all users

### Post user

```http
POST /todo/v1/users
```

| Parameter     | Type   | Description                  |
|:--------------|:-------|:-----------------------------|
| `RequestBody` | `user` | **Required**. User to create |

#### createUser()

Return the created user

### Get status

```http
GET /todo/v1/status
```

#### getStatus()

Return a list of all status

### Post status

```http
PSOT /todo/v1/status
```

| Parameter     | Type     | Description                    |
|:--------------|:---------|:-------------------------------|
| `RequestBody` | `status` | **Required**. Status to create |

#### createStatus()

Return the created status

### Get tasks

```http
GET /todo/v1/tasks
```

#### getStatus()

Return a list of all tasks

### Post task

```http
PSOT /todo/v1/tasks
```

| Parameter     | Type   | Description                  |
|:--------------|:-------|:-----------------------------|
| `RequestBody` | `task` | **Required**. Task to create |

#### createStatus()

Return the created task


## Tech Stack

**Server:** Spring Boot, Spring Boot Security, Lombok, Liquibase


## Source

Use [readme.so]("https://readme.so/editor") to generate this readme file
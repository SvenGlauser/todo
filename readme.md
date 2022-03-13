
# Todo App Backend

Backend for a todo list application

## Authors

- [@SvenGlauser](https://www.github.com/svenGlauser)

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

### Get utilisateurs

```http
GET /todo/v1/utilisateurs
```

#### recupererUtilisateurs()

Return a list of all utilisateurs

### Post utilisateur

```http
POST /todo/v1/utilisateurs
```

| Parameter     | Type   | Description                  |
|:--------------|:-------|:-----------------------------|
| `RequestBody` | `utilisateur` | **Required**. Utilisateur to create |

#### creerUtilisateur()

Return the created utilisateur

### Put utilisateur

```http
PUT /todo/v1/utilisateurs
```

| Parameter     | Type   | Description                  |
|:--------------|:-------|:-----------------------------|
| `RequestBody` | `utilisateur` | **Required**. Utilisateur to modify |

#### modifierUtilisateur()

Return the modified utilisateur

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

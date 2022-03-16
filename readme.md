
# analytics App Backend

Backend for a analytics list application

## Authors

- [@SvenGlauser](https://www.github.com/svenGlauser)

## Deploy application

### Build

#### Build with Maven 

`mvn clean package`

### Deploy to docker

#### Docker create image 

`docker build -t analytics-backend .`

#### Docker compose image with postgresql 

`docker compose up`

## API Reference

### Get utilisateurs

```http
GET /analytics/v1/utilisateurs
```

#### recupererUtilisateurs()

Return a list of all utilisateurs

### Post utilisateur

```http
POST /analytics/v1/utilisateurs
```

| Parameter     | Type   | Description                  |
|:--------------|:-------|:-----------------------------|
| `RequestBody` | `utilisateur` | **Required**. Utilisateur to create |

#### creerUtilisateur()

Return the created utilisateur

### Put utilisateur

```http
PUT /analytics/v1/utilisateurs
```

| Parameter     | Type   | Description                  |
|:--------------|:-------|:-----------------------------|
| `RequestBody` | `utilisateur` | **Required**. Utilisateur to modify |

#### modifierUtilisateur()

Return the modified utilisateur

### Get enregistrement

```http
GET /analytics/v1/enregistrement
```

#### recupererEnregistrements()

Return a list of all enregistrement

### Post enregistrement

```http
POST /analytics/v1/enregistrement
```

| Parameter     | Type     | Description                    |
|:--------------|:---------|:-------------------------------|
| `RequestBody` | `enregistrement` | **Required**. Enregistrement to create |

#### creerEnregistrement()

Return the created enregistrement

### Put enregistrement

```http
PUT /analytics/v1/enregistrement
```

| Parameter     | Type     | Description                    |
|:--------------|:---------|:-------------------------------|
| `RequestBody` | `enregistrement` | **Required**. Enregistrement to modify |

#### modifierEnregistrement()

Return the modified enregistrement

### Get actions

```http
GET /analytics/v1/actions
```

#### recupererActions()

Return a list of all actions

### Post action

```http
POST /analytics/v1/actions
```

| Parameter     | Type   | Description                  |
|:--------------|:-------|:-----------------------------|
| `RequestBody` | `action` | **Required**. Action to create |

#### creerAction()

Return the created action

### Put action

```http
PUT /analytics/v1/actions
```

| Parameter     | Type   | Description                  |
|:--------------|:-------|:-----------------------------|
| `RequestBody` | `action` | **Required**. Action to modify |

#### modifierAction()

Return the modified action

## Tech Stack

**Server:** Spring Boot, Spring Boot Security, Lombok, Liquibase

## Source

Use [readme.so](https://readme.so/editor) to generate this readme file

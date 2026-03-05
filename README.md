# ForoHub API - Challenge Alura

API REST desarrollada con **Spring Boot 3** para la gestión de tópicos de un foro.
Este proyecto fue realizado como parte del **Challenge Back-End de Alura Latam (Oracle Next Education)**.

La aplicación permite autenticar usuarios mediante **JWT (JSON Web Token)** y realizar operaciones CRUD sobre los tópicos del foro.

---

# Tecnologías utilizadas

* Java 17
* Spring Boot 3
* Spring Security
* JWT (JSON Web Token)
* Spring Data JPA
* Hibernate
* Flyway
* MySQL
* Maven
* Insomnia (para pruebas de la API)

---

# Autenticación

La API utiliza autenticación basada en **JWT**.

Primero se debe obtener un token mediante el endpoint `/login`.
Luego ese token debe enviarse en las demás solicitudes mediante el header:

```
Authorization: Bearer TOKEN
```

---

# Endpoints

## Login

**POST** `/login`

Body:

```json
{
  "login": "usuario",
  "clave": "password"
}
```

Respuesta:

```json
{
  "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9..."
}
```

---

# Crear tópico

**POST** `/topicos`

Header requerido:

```
Authorization: Bearer TOKEN
```

Body:

```json
{
  "titulo": "Error al configurar Spring Security",
  "mensaje": "Estoy teniendo problemas al configurar autenticación JWT en mi proyecto Spring Boot. ¿Alguien podría orientarme?",
  "autor": "Usuario",
  "curso": "Spring Boot"
}
```

Respuesta:

```
201 Created
```

---

# Listar tópicos

**GET** `/topicos`

Respuesta:

```json
[
  {
    "id": 1,
    "titulo": "Error al configurar Spring Security",
    "mensaje": "Estoy teniendo problemas al configurar autenticación JWT en mi proyecto Spring Boot.",
    "autor": "Usuario",
    "curso": "Spring Boot"
  }
]
```

---

# Actualizar tópico

**PUT** `/topicos/{id}`

Body:

```json
{
  "titulo": "Configuración de JWT en Spring Boot",
  "mensaje": "He avanzado en la configuración pero aún tengo dudas sobre los filtros de seguridad.",
  "autor": "Usuario",
  "curso": "Spring Boot"
}
```

---

# Eliminar tópico

**DELETE** `/topicos/{id}`

Respuesta:

```
204 No Content
```

---

# Seguridad

La API está protegida mediante **Spring Security** y **JWT**.

Flujo de autenticación:

1. El usuario envía sus credenciales a `/login`.
2. El servidor valida las credenciales.
3. Se genera un **token JWT**.
4. El cliente utiliza ese token para acceder a los endpoints protegidos.

---

# Autor

Proyecto desarrollado por **Bárbara Jopia Castro**
Programa **Oracle Next Education + Alura Latam**

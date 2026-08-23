<div align="center">

# ForoHub API 💬

**API REST para la gestión de tópicos de un foro, con autenticación JWT y persistencia en MySQL.**

![Java](https://img.shields.io/badge/Java-17-ED8B00?style=flat-square&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.x-6DB33F?style=flat-square&logo=springboot&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-Database-4479A1?style=flat-square&logo=mysql&logoColor=white)
![JWT](https://img.shields.io/badge/Auth-JWT-000000?style=flat-square&logo=jsonwebtokens&logoColor=white)

</div>

## Sobre el proyecto

ForoHub es una API REST desarrollada como parte del **Challenge Back-End de Alura Latam / Oracle Next Education**. El proyecto permite autenticar usuarios y administrar tópicos mediante endpoints protegidos, aplicando conceptos de seguridad, persistencia, validación y migraciones de base de datos.

## Funcionalidades

- Autenticación de usuarios mediante **JSON Web Token (JWT)**.
- Creación de tópicos.
- Listado de tópicos.
- Actualización de tópicos existentes.
- Eliminación de tópicos.
- Protección de endpoints con **Spring Security**.
- Persistencia mediante **Spring Data JPA / Hibernate**.
- Migraciones de base de datos con **Flyway**.

## Tecnologías

`Java 17` · `Spring Boot` · `Spring Security` · `Spring Data JPA` · `Hibernate` · `Flyway` · `MySQL` · `JWT` · `Maven`

## Endpoints principales

| Método | Endpoint | Descripción |
|---|---|---|
| `POST` | `/login` | Autenticar usuario y obtener token JWT |
| `POST` | `/topicos` | Crear un tópico |
| `GET` | `/topicos` | Listar tópicos |
| `PUT` | `/topicos/{id}` | Actualizar un tópico |
| `DELETE` | `/topicos/{id}` | Eliminar un tópico |

Los endpoints protegidos requieren el token en el encabezado:

```http
Authorization: Bearer TOKEN
```

## Configuración local

El proyecto utiliza variables de entorno para evitar almacenar credenciales y secretos en el repositorio:

```text
DB_URL=jdbc:mysql://localhost:3306/forohub_api
DB_USERNAME=tu_usuario
DB_PASSWORD=tu_password
JWT_SECRET=un_secreto_seguro
JWT_EXPIRATION=2
```

Después de configurar MySQL y las variables de entorno, el proyecto puede ejecutarse con Maven o desde el IDE.

## Qué demuestra este proyecto

- Diseño y consumo de una **API REST**.
- Autenticación y autorización con **JWT + Spring Security**.
- Modelado y persistencia de datos con JPA.
- Gestión de esquema mediante migraciones.
- Separación de responsabilidades en una aplicación backend.
- Manejo seguro de configuración sensible mediante variables de entorno.

## Contexto

Proyecto formativo desarrollado durante el programa **Oracle Next Education + Alura Latam** y conservado como parte de mi evolución en desarrollo backend.

---

<div align="center">

Desarrollado por **Bárbara Jopia Castro** · `BarbiDev`

</div>

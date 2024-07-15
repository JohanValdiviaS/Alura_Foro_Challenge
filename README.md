# Foro Alura API

![Imagen](badge-literalura.png)

API RESTful para el Foro Alura, permitiendo a los usuarios gestionar tópicos, respuestas, cursos y usuarios.

## Funcionalidades

La API permite realizar las siguientes operaciones:

- Autenticación de usuarios para gestionar recursos.
- Operaciones CRUD (Crear, Leer, Actualizar, Eliminar) para:
  - Tópicos
  - Respuestas
  - Cursos
  - Usuarios

## Tecnologías Utilizadas

- Java
- Spring Boot
- MySQL
- Maven

## Configuración del Proyecto

### Requisitos

- JDK 11 o superior
- Maven
- MySQL

### Configuración de la Base de Datos

1. Crea una base de datos MySQL local.
2. Configura las credenciales de acceso en `application.properties`.

### Configuración de Spring Boot

El proyecto utiliza Spring Boot para la configuración. Asegúrate de tener configurado correctamente Maven y las dependencias en tu entorno de desarrollo.

### Ejecución

1. Clona este repositorio.
2. Importa el proyecto en tu IDE como un proyecto Maven.
3. Configura tu base de datos y ajusta las configuraciones necesarias en `application.properties`.
4. Ejecuta la aplicación desde tu IDE o mediante `mvn spring-boot:run`.

### Uso de la API

Una vez que la aplicación esté en ejecución, puedes acceder a la API utilizando herramientas como Postman o desde tu navegador web:

- `GET /api/topics`: Obtener todos los tópicos.
- `GET /api/topics/{id}`: Obtener un tópico específico por su ID.
- `POST /api/topics`: Crear un nuevo tópico.
- `PUT /api/topics/{id}`: Actualizar un tópico existente por su ID.
- `DELETE /api/topics/{id}`: Eliminar un tópico por su ID.

Repite los mismos pasos para respuestas, cursos y usuarios ajustando los endpoints correspondientes.

## Contribución

Las contribuciones son bienvenidas. Si deseas mejorar este proyecto, sigue estos pasos:

1. Haz un fork del proyecto.
2. Crea una nueva rama (`git checkout -b feature/feature-name`).
3. Realiza tus cambios y haz commit de ellos (`git commit -am 'Add new feature'`).
4. Haz push a la rama creada (`git push origin feature/feature-name`).
5. Crea un nuevo Pull Request.

## Licencia

Este proyecto está bajo la Licencia MIT. Consulta el archivo LICENSE para más detalles.

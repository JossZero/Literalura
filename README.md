Catálogo de Libros

Este proyecto es una aplicación para gestionar un catálogo de libros usando Spring Boot y PostgreSQL.

Requisitos

- Java JDK 17 o superior
- Maven 4 o superior
- PostgreSQL 16 o superior

Configuración del Entorno

1. Instalar PostgreSQL:
   - Descarga e instala PostgreSQL 
   - Crea una base de datos con el siguiente comando SQL:
     CREATE DATABASE catalogo_libros;

2. Configurar Conexión en Spring Boot:
   - Abre `src/main/resources/application.properties` y agrega la siguiente configuración:
     spring.datasource.username=tu_usuario
     spring.datasource.password=tu_contraseña
     spring.datasource.driver-class-name=org.postgresql.Driver

     spring.jpa.hibernate.ddl-auto=update
     spring.jpa.show-sql=true
     spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect

Configuración del Proyecto

1. Dependencias:
   - Asegúrate de que tu `pom.xml` contenga estas dependencias:
     <dependencies>
       <dependency>
         <groupId>org.springframework.boot</groupId>
         <artifactId>spring-boot-starter-data-jpa</artifactId>
       </dependency>
       <dependency>
         <groupId>org.springframework.boot</groupId>
         <artifactId>spring-boot-starter-web</artifactId>
       </dependency>
       <dependency>
         <groupId>org.postgresql</groupId>
         <artifactId>postgresql</artifactId>
         <scope>runtime</scope>
       </dependency>
       <dependency>
         <groupId>com.fasterxml.jackson.core</groupId>
         <artifactId>jackson-databind</artifactId>
         <version>2.16.0</version>
       </dependency>
       <dependency>
         <groupId>org.apache.httpcomponents.client5</groupId>
         <artifactId>httpclient5</artifactId>
         <version>5.2</version>
       </dependency>
     </dependencies>

Ejecución

1. Asegúrate de que PostgreSQL esté en ejecución.
2. Ejecuta los siguientes comandos para construir y ejecutar la aplicación:
   mvn clean install
   mvn spring-boot:run

Funcionalidades

- Buscar un libro por título
- Listar todos los libros
- Listar libros por idioma
- Listar autores
- Listar autores vivos en un año determinado


          

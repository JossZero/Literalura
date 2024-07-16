# Catálogo de Libros

Este proyecto es una aplicación de catálogo de libros construida con Spring Boot. Permite interactuar con una API de libros y almacenar la información en una base de datos PostgreSQL.

## Requisitos

Antes de comenzar, asegúrate de tener instalados los siguientes programas:

- **Java JDK**: Versión 17 o superior. Puedes descargarlo desde [aquí](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html).
- **Maven**: Versión 4 o superior. Puedes descargarlo desde [aquí](https://maven.apache.org/download.cgi).
- **PostgreSQL**: Versión 16 o superior. Puedes descargarlo desde [aquí](https://www.postgresql.org/download/).

## Configuración del Entorno

1. **Instalar PostgreSQL**:
   - Descarga e instala PostgreSQL desde el [sitio web oficial](https://www.postgresql.org/download/).
   - Crea una base de datos para el proyecto usando el siguiente comando SQL:
     ```sql
     CREATE DATABASE catalogo_libros;
     ```

2. **Configurar el Archivo `application.properties`**:
   - Abre el archivo `src/main/resources/application.properties` y configura los detalles de conexión a tu base de datos PostgreSQL:
     ```properties
     spring.datasource.url=jdbc:postgresql://localhost:5432/catalogo_libros
     spring.datasource.username=tu_usuario
     spring.datasource.password=tu_contraseña
     spring.datasource.driver-class-name=org.postgresql.Driver

     spring.jpa.hibernate.ddl-auto=update
     spring.jpa.show-sql=true
     spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
     ```

## Configuración del Proyecto

1. **Agregar Dependencias**:
   - Asegúrate de que tu archivo `pom.xml` tenga las siguientes dependencias:

     ```xml
     <?xml version="1.0" encoding="UTF-8"?>
     <project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
       <modelVersion>4.0.0</modelVersion>
       <parent>
         <groupId>org.springframework.boot</groupId>
         <artifactId>spring-boot-starter-parent</artifactId>
         <version>3.2.7</version>
         <relativePath/> <!-- lookup parent from repository -->
       </parent>
       <groupId>com.lietaratura</groupId>
       <artifactId>Catalogo</artifactId>
       <version>0.0.1-SNAPSHOT</version>
       <name>Catalogo</name>
       <description>Demo project for Spring Boot</description>
       <url/>
       <licenses>
         <license/>
       </licenses>
       <developers>
         <developer/>
       </developers>
       <scm>
         <connection/>
         <developerConnection/>
         <tag/>
         <url/>
       </scm>
       <properties>
         <java.version>17</java.version>
       </properties>
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
           <groupId>org.springframework.boot</groupId>
           <artifactId>spring-boot-starter-test</artifactId>
           <scope>test</scope>
         </dependency>
         <dependency>
          

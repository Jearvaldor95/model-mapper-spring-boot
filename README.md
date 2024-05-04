# DEPENDENCIAS DEL PROYECTO

# Para la persistencia de datos
* JPA
 
         <dependency><groupId>org.springframework.boot</groupId><artifactId>spring-boot-starter-data-jpa</artifactId></dependency>
 

# Para el amacenamiento de datos 
* H2 database

         <dependency><groupId>com.h2database</groupId><artifactId>h2</artifactId></dependency>

# Para la crear los mapper
* MapStrut

         <!-- https://mvnrepository.com/artifact/org.mapstruct/mapstruct -->
        <dependency>
            <groupId>org.mapstruct</groupId>
            <artifactId>mapstruct</artifactId>
            <version>1.5.5.Final</version>
        </dependency>
        <!-- https://mvnrepository.com/artifact/org.mapstruct/mapstruct-processor -->
        <dependency>
            <groupId>org.mapstruct</groupId>
            <artifactId>mapstruct-processor</artifactId>
            <version>1.5.5.Final</version>
        </dependency>

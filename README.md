# Proyecto de Portfolio: Backend

**Link frontend:**

El siguiente proyecto corresponde al backend de un Portfolio personal. Está hecho con Spring Boot (Java) siguiendo los
lineamientos y condiciones del programa nacional Argentina Programa, llevado a cabo por el INTI (Instituto Nacional de Tecnología Industrial).

Se utilizó MySQL para el guardado y flujo de datos.

## Contenido

El proyecto consta de un CRUD con el agregado de JWT y Spring Security para el inicio de sesión y manipulación de datos. En el sistema de usuarios se pueden encontrar
dos roles con distintos permisos:

```
ROLE_USER, ROLE_ADMIN
```
En este proyecto se utiliza únicamente **ROLE_ADMIN**, pero está pensada la posibilidad de que en un futuro se extienda y se puedan registrar usuarios sin permisos de modificación,
pero que puedan realizar ciertas funcionalidades.

Al igual que su complementario frontend en Angular, el CRUD está focalizado en 5 componentes:

```
AboutUs  
Experience  
Projects  
Skills  
Login  
```
Los cuales se encuentran divididos en cada paquete de Java de forma ordenada para la manipulación ágil de datos.

## Instalación

Una vez clonado este repositorio, deberás modificar los siguientes archivos:

# Trabajo Practico N°7

## Requerimento utilizado
Para realizar los tests se utiliza el requerimento `US002 - Eliminar del carrto` en este se debe probar comprobar que se pueda eliminar un articulo del carrito pero este no sea eliminado de la base de datos, por lo que posterior a eliminarlo se comprueba que siga estando en la pagina de inicio.

## Test en Selenium
En el repositorio encontrara un archivo llamado `IngSoftTP7CP-US002.side` en este se encuentra el script de selenium que se utiliza para realizar el test en la herramienta. 
Para ejecutar el test debe tener la extención de Selenium instalada en su navegador de preferencia (chrome o firefox). Una vez instalada clone el repositorio y inicie la extencion de selenium. en esta debe abrir el archivo `IngSoftTP7CP-US002.side` que esta dentro de la carpeta del repositorio. 

Una vez abierto podra visualizar el script de selenium. Presione ejecutar para correr el test. 

## Test de Java
Dentro del repositorio tambien se encuentra un projecto Java el cual utiliza Selenium Web Driver para ejecutar los tests.

### Prerequisitos
Para poder ejecutar este test debe contar con lo siguiente:
* Java - Version 11
* Un IDE que le permita vizualizar y ejecutar el proyecto
* Maven

### Configuracion Inicial
Para ejecutar selenium web driver necesita tener el driver de chrome correspondiente a su version de navegador. Dentro del en la carpeta `bin` se encuentra el driver de chrome correspondiente a la versión `94.04606.61` si tiene otra version debe descargar la correspondiente a su navegador chrome y reemplazarlo en la carpeta bin.

Una vez tenga el driver correspondiente debe verificar que la direccion de este es correcta. Para esto dirijase dentro del proyecto a `src/tes/java/SeleniumConfig.java` y en este archivo debe modificar la siguiente linea con el directorio del driver correspondiente.

`System.setProperty("webdriver.chrome.driver","DIRECTORIO DEL DRIVER");`

### Ejecucion
Para ejecutar el test debe ejecutar el archivo `src/tes/java/CPUS002Test.java` el cual contiene el respectivo test. 

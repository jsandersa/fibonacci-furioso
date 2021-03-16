# Tarea 1

### El presente proyecto implementa un servicio para calcular el número fibonacci de un número dado

El proyecto está implementado con Spring Boot, formato Maven, con lenguaje Java.

Para utilizarlo ocupe en su navegador el enlace parecido a:

http://localhost:8080/fibonacci/calculate/N

Donde N es la entrada que se utiliza para calcular el numero de fibonacci correspondiente.

Es posible que sea necesario ajustar el puerto 8080 a otro según su entorno de ejecución.

Para descargar el código:

    git clone https://github.com/jsandersa/fibonacci-furioso.git

Para levantar servicio ocupar comando (adentro de la carpeta principal del proyecto):

En linux:
  
    ./mvnw spring-boot:run
    
y para invocar el servicio en otro terminal de la misma maquina ejecutar u ocupar un navegador gráfico:

    curl http://localhost:8080/api/v1/fibonacci/calculate/N

En windows para levantar el servicio:
    
    mvnw spring-boot:run

Para probar ocupar un navegador gráfico.

_**OJO: Para operar correctamente el servicio requiere presencia de java 8.**_

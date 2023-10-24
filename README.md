# Parcial 2

Aplicación web para investigar la conjetura de Collatz, hace uso de las tecnologías
Maven, Git, Github, Spark, Java, HTML5 y JavaScript

# Arquitectura

- Cliente asíncrono que usa HTML5 y JavaScript, el cliente recibe un número y muestra la secuencia
de Collatz generada a partir de ese número
- Servicio REST que se encarga de la construción de la secuencia de Collatz, el servicio recibe el número inicial
en la variable del query con nombre "value"

# Instalación

Para clonar el proyecto, use el siguiente comando:

```
git clone https://github.com/miguelsalamanca007/parcial2AREP.git
```

Para compilar el proyecto use el siguient comando:

```
mvn clean install
```

Para ejecutar el proyecto, ejecute el siguiente comando:


Windows:
```
java -cp "target/classes;target/dependency/*" org.example.CollatzService
```

Mac o distribuciones de Linux:
```
java -cp "target/classes:target/dependency/*" org.example.CollatzService
```


# Ejecutarlo en AWS

para ejecutarlo en AWS, asegurese de tener Docker instalado y que el Docker deamon esté ejecutandose, además de que el grupo de seguridad asociado a la instancia EC2 debe permitir el puerto 4567 de entrada, luego, ejecute el siguiente comando:

```
docker run -d -p 4567:4567 --name collatzservice miguels007/collatzimage
```

Ahora puede ver el servicio en funcionamiento en su Web Browser favorito en la siguiente URL:
```
http://{nombreDNSdelainstancia}:4567/index.html
```

# Prueba de funcionamiento (en local)

Las siguientes capturas de pantalla son pruebas de funcionamiento de la aplicación

Para el número 14:
![img](/images/pruebaFuncionamiento1.png)

Para el número 13
![img](/images/pruebaFuncionamiento2.png)

Para el número 37
![img](/images/pruebaFuncionamiento3.png)

# URL del video

En la siguiente URL se encuentra el video que prueba el funcionamiento de la aplicación web desplegada en AWS

https://youtu.be/w9hSrDE6LdA




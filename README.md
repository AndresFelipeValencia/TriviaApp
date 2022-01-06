# TriviaApp

## Descripción: La App es creada es un juego de pregunta y respuesta, con una unica opcion valida, a
medida que se avanza en los niveles se acumulan los puntos.

### Objetos: los objetos se modelan en un paquete llamado modelo.

#### Fuente de datos: es donde se almacena la información, que estará viva mientras la aplicación
esté viva, playerDataSource está configurado para devolver la lista de jugadores, con su nombre y
sus puntos, el questionDataSource se establece para la creación de las listas de preguntas y sus
opciones de respuesta, establecido por categoría y nivel.

##### Vistas: se crean diferentes vistas para las acciones del juego correspondientes, como la vista
inicial, la vista de preguntas con opciones de respuesta, la vista de juego final, la vista de juego
perdido y la vista de juego ganado.

###### Sistemas de puntos: Los puntos estan establecidos por nivel, en el nivel 1, se otorga 1 punto
por pregunta correcta, en el nivel 2, se otorgan 2 puntos por pregunta correcta, en el nivel 3 se
otorgan 3 puntos por pregunta correcta, a si sucesivamente, los puntos son acumulables a
medida que se avanza.

####### Cómo ejecutar el código: Para compilar el código, debe usar Android Studio, conectado a un
teléfono celular, para poder visualizar la aplicación que crea el código, para sus respectivas pruebas.



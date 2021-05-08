#Nombre del caso de uso: Generar Recorrido.

## Descripción: El sistema automáticamente a una hora especifica en los días laborales, crea un listado con cada uno de los empleados indicando que domicilio tendrán que ir a buscar los materiales reciclables y a qué hora tienen que estar allá.

##Actor Primario: Reloj.

##Trigger: El caso de uso inicia en un día laboral a las 8am. creando el listado de recorrido.

##Curso básico: 1. El caso de uso comienza cuando son las 8am. de un día laboral
                2. El sistema inicia el algoritmo para generar el listado.
                3. [INCLUDE] Acceder Recorrido.
                4. El algoritmo crea el listado de recorrido.
                5. Automáticamente al crear el listado, el listado es enviado al correo de la secretaria.
                6. El sistema recibe la confirmación mediante la secretaria que el listado de recorrido llego correctamente.
                7. El caso de uso finaliza.

## Postcondición: 1. El sistema es notificado que la secretaria recibió el listado de recorrido.

## Suposiciones: 1. El email es el que está registrado en su cuenta.

##Casos de uso incluidos: 1. Acceder Recorrido.

##Finalizacion de caso de uso: 1. Se desarrollo correctamente.
                               2. La secretaria no confirma la llegada del listado. 

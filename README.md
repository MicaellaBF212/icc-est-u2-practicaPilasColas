# Practica 03 - Ejercicios de logica con estructuras lineales: pilas y colas

*Estudiantes:* Micaella Bustos, Axel Gonzalez y Santiago Satama 

---

## Descripcion General del Proyecto

Este proyecto implementa tres ejercicios de logica utilizando estructuras lineales en Java (pilas y colas). El codigo esta organizado en paquetes según la estructura requerida por la practica.


---

## Ejercicio 01: Validacion de Signos

### Explicacion
En este ejercicio se creó una clase llamada SignValidator usando una pila con ArrayDeque. Su función es revisar si una cadena tiene los signos () [] {} correctamente abiertos y cerrados. Si todos los signos están en el orden correcto el método devuelve true y si existe algún error devuelve false.
### Codigo
![alt text](image.png)

### Salida de Consola

---

## Ejercicio 02: Ordenar Stack 

### Explicacion

Se crea un stack auxiliar aux sacando cada elemento del stack original y se guarda en "tope". Si el tope de aux es mayor que "tope" se lo regresa al stack original para recolocarlo despues. Cuando ya no hay nada mayor en aux se mete "tope" en aux quedando aux ordenado de menor abajo a mayor arriba. Al final se invierte aux de regreso al stack original lo que invierte el orden dejando el menor en el tope como se ve en la salida [5, 4, 2, 1] con tope 1.

### Codigo
![alt text](image-1.png)

### Salida de Consola


## Ejercicio 03: Palindromo usando colas

### Explicacion
En este ejercicio se creó una clase llamada QueuePalindrome usando una cola con ArrayDeque. Su función es revisar si una palabra es un palindromo como en la anterior. Se encarga de recorrer el texto caracter por coaracter tambien se pidio que si se usa una frase se pueda ignorar espacios y por eso se construyen dos cadenas: una en orden normal y otra en orden invertido. Si ambas cadenas son iguales el metodo devuelve true y si son diferentes devuelve false.


### Codigo
![alt text](image-2.png)

### Salida de Consola
# SOLUTION
Adriana Maria Velásquez Medina

## **1. Implementando**

![image](https://user-images.githubusercontent.com/79488147/115906572-4dc26080-a42d-11eb-9e1a-3fdaff52ea81.png)

## **2. Diseñando**
![image](https://github.com/adrianaveme/Parcial-II---A.Velasquez/blob/master/diagrams/Secuencia1.png)
![image](https://github.com/adrianaveme/Parcial-II---A.Velasquez/blob/master/diagrams/Secuencia2.png)
## **3. Extendiendo**


**De los diseños resultantes del punto I y II, ¿Qué debe cambiar? ¿Qué no debe cambiar?. Justifique su respuesta.**


Cambia el diseño del punto 1 porque la duración de una actividad ahora no es solo sus steps y sus questions si no que ahora se calcula la duración de todas sus dependencias y se le suma la duración de la actividad. 

Del punto 2 no habría que cambiar nada porque el método getDuration() de actividad ha cambiado para incluir la duración de las dependencias. Aunque el metodo se comporte diferente, el sintetizador llama a el método get activities duration que llama a la duración de una actividad.

**Teniendo en cuenta los cambios necesarios ¿Que fue bueno y que fue malo de su diseño?**





## **4. Conceptos**
---

1. ¿Cuáles son las acciones los tres momentos importantes de las excepciones? ¿Cuál es el objetivo de cada una? ¿Cómo se implementa en Java cada acción?.

    Son 3 los momentos clace de las excepciones:

    1. LANZAR

    `Throw: ` Algo ocurrió y se quiere informar de dicho suceso. Se lanza una excepción.

    Para implementarlo se utiliza la palabra clave throw y se pone una condicione en la cual se la lanzara la excepción


    2. PROPAGAR

    `Propagate:` Propagar una excepcion significa que hay un metodo que sabe que puede surgir una excepcion pero no puede controlar esa excepción para hacer algo con ella.Da la responsabilidad a alguien para arreglar lo que falló.

    Para implementarlo se utiliza la palabra clave throws  


    3. CAPTURAR

    `Catch:` Se hace resonsable del falló.

    Para implementarlo se utiliza la palabra clave catch. Habrá tantos catchs como excepciones que el método lanza. A su vez suele acompañarse con un try donde se pone todo el codigo que posiblemente pueda arrojar una excepción

 
    

---

2. ¿Qué es sobre-escritura de métodos? ¿Por qué aplicarla? ¿Cómo impedir que se sobre-escriba un método?.

    La sobre-escritura de métodos en java es utilizar utilizar métodos previamente expuestos en nuestro codigo en varios lugares del mismo dónde se requiera una implementación distinta. Se aplica para hacer nuestros proyectos en java más conciso de esta forma un mismo método puede tomar distintas formas depende de lo que se requiera y no hay necesidad de ser redundantes. Para impedir que se sobre escriba un método se pueden incluir la palabra clave final.

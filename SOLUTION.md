# SOLUTION
Adriana Maria Velásquez Medina

## **1. Implementando**

## **2. Diseñando**

## **3. Extendiendo**

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

    La sobre-escritura de métodos en java es utilizar utilizar métodos previamente expuestos en nuestro codigo en varios lugares del mismo dónde se requiera una implementación distinta. Se aplica para hacer nuestros proyectos en java más conciso de esta forma un mismo método puede tomar distintas formas depende de lo que se requiera y no hay necesidad de ser redundantes. Para impedir que se sobre escriba un método se pueden incluir las palabras clave final o static.

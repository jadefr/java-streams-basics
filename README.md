# java-streams-basics

Estudo sobre Java 8 Stream.

Criou-se a classe *Person*, com os atributos *name*, *age* e *gender*, este último sendo um objeto da classe (enum) *Gender*.

A classe *Info* apresenta diversos métodos sobre uma lista de *Person*, permeados de **lambda expressions**.


# Tech Stack

* Java 8

# Classes

* Gender.java
* Person.java
* Info.java
* Main.java

# Métodos da classe Info.java

Todos os métodos manipulam uma lista de *Person*.

Os métodos em negrito fazem parte da API Stream, do Java 8.

## getFemales()

Vale-se do método **filter()** para retornar apenas objetos da lista cujo atributo gender é FEMALE.

## getAscendingAges()

Utiliza o método **sorted()** para retornar a lista ascendentemente ordenada.

## getDescendingAges()

Aplica o método **reversed()** ao método **sorted()** para retornar a lista descendentemente ordenada.

## allMatch()

Utiliza o método **allMatch()** para comparar se as idades de todos os objetos da lista são maiores que 10 (valor escolhido). Retorna um boolean.

## anyMatch()

Utiliza o método **anylMatch()** para comparar se algum objeto da lista apresenta o atributo _idade_ maior que 100 (valor escolhido). Retorna um boolean.

## noneMatch()

Utiliza o método **noneMatch()** para comparar se nenhum objeto da lista apresenta o atributo nome igual a "Aliocha" (nome escolhido).


Utiliza o método **anyMatch()**

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

Vale-se do método **filter()** para retornar apenas objetos da lista cujo atributo _gender_ é FEMALE.

## getAscendingAges()

Utiliza o método **sorted()** para retornar a lista ascendentemente ordenada.

## getDescendingAges()

Aplica o método **reversed()** ao método **sorted()** para retornar a lista descendentemente ordenada.

## allMatch()

Utiliza o método **allMatch()** para comparar se as idades de todos os objetos da lista são maiores que 10 (valor escolhido). Retorna um boolean.

## anyMatch()

Utiliza o método **anyMatch()** para comparar se algum objeto da lista apresenta o atributo _age_ maior que 100 (valor escolhido). Retorna um boolean.

## noneMatch()

Utiliza o método **noneMatch()** para comparar se nenhum objeto da lista apresenta o atributo _name_ igual a "Aliocha" (nome escolhido).


## maxValue()

Utiliza o método **max()** para retornar o objeto da lista que apresenta o atributo _age_ de maior valor.

## minValue()

Utiliza o método **min()** para retornar o objeto da lista que apresenta o atributo _age_ de menor valor.

## groupByGender()

Utiliza o método **groupingBy()** para agrupar os objetos, de acordo com o atributo _gender_, em um Map<Gender, List<Person>>.
  
## oldestFemale()

Utiliza os métodos **filter()**, **max()** e **map(Person::getName)** para retornar o nome do objeto de atributo _gender_ FEMALE cujo atributo _age_ é o maior da categoria.


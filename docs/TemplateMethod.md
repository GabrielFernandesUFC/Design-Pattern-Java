# Template Method

Esse padrão define o esqueleto de um algoritmo em uma superclasse, mas permite que as subclasses redefinam certos passos do algoritmo sem alterar a estrutura geral. Pense nele como uma "receita de bolo" genérica. A receita diz "misture os ingredientes", "leve ao forno" e "decore", mas os ingredientes e a decoração podem variar dependendo se você está fazendo um bolo de chocolate ou um bolo de cenoura.


Esse padrão monta o esqueleto de um algoritmo de forma abstrata, e deixasse para que suas classes concretas realizem as devidas implementações.

O Template Method utiliza a classe abstrata base, que vai encapsular o template de algoritmo em um método, para que as classes concretas possam herdar desta classe e realizar a implementação de determinados passos deste algoritmo.


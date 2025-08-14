# Singleton

O padrão de projeto singleton garante que uma classe tenha apenas uma instância e fornece um ponto global de acesso a essa instância.

Evita a criação de múltiplas instâncias de um mesmo objeto, o que pode levar a inconsistências ou problemas de gerenciamento.

Case: Conexão com o banco de dados:

Criar uma nova conexão com o banco de dados é uma operação lenta e custosa. Se cada requisição web criar e fechar a conexão, o desempenho do seu sistema será seriamente prejudicado. Um pool resolve isso mantendo um conjunto de conexões abertas e prontas para uso.

Para isso, é interessante que exista apenas um único pool de conexões para todo sistema. O padrão singleton é a solução natural para garantir essa unicidade.

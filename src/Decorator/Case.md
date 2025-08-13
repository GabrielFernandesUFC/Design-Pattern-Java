O Problema de Negócio: Processamento de Dados
Imagine que você está desenvolvendo um sistema para processar um fluxo de dados (como texto de um arquivo ou dados de uma API). O fluxo de processamento pode variar, e você precisa aplicar diferentes transformações aos dados antes de usá-los, como:

Compactar os dados.

Criptografar os dados.

Codificar os dados em Base64.

A ordem e a combinação dessas operações podem mudar. Por exemplo, em um caso, você pode querer apenas criptografar. Em outro, pode precisar compactar e depois criptografar. Uma solução sem o Decorator levaria à criação de muitas subclasses (ProcessadorCompactado, ProcessadorCriptografadoCompactado, etc.), o que, como já vimos, é insustentável.

A Solução com o Padrão Decorator
O Decorator permite que você crie um objeto de processamento de dados e, em tempo de execução, adicione camadas de funcionalidade, como criptografia ou compactação, sem ter que criar novas classes para cada combinação.
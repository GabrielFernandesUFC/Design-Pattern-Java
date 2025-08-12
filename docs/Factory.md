# Padrão de Projeto: Factory

Factory Method: é o padrão que nos permite criar objetos sem que a gente precise sabe a classe exata do objeto que está sendo criado.

A ideia é delegar a responsibilidade de criação para as subclasses.

Exemplo com Problema de Negócio:

Imagine que você está desenvolvendo um sistema para calcular frete para uma loja online. A regra de negócio é a seguinte:

* O frete para entrega de correios é calculado de uma forma

* O frete para entrega de uma transportadora particular é outra forma

* No futuro, você pode adicionar uma nova modalidade de frete

```java
public class CalculadoraFrete {
    public double calcular(String tipoEntrega, double peso, double distancia) {
        if ("correios".equals(tipoEntrega)) {
            return peso * 0.5 + distancia * 0.1;
        } else if ("transportadora".equals(tipoEntrega)) {
            return peso * 0.8 + distancia * 0.2;
        }
        throw new IllegalArgumentException("Tipo de entrega inválido.");
    }
}
```

O problema do código acima é que ele fere um dos princípios do SOLID (OCP). Se você precisa adicionar uma nova modalidade de frete, irá precisar alterar a classe CalculadoraFrete. Isso deixa o código mais difícil de manter, testar e expandir.

## Solução com Factory Method

Esse padrão resolve delegando a responsabilidade de criar o objeto de frete para subclasses, eliminando o if-else.

```java
public interface Frete {
    double calcularFrete(double peso, double distancia);
}
```

Assim, todas as modalidades de frete terão que implementar essa interface.

```java
public class FreteCorreios implements Frete {
    @Override
    public double calcularFrete(double peso, double distancia) {
        System.out.Println("Calcular o frete dos correios");
        return peso * 0.5 + distancia * 0.1;
    }
}

public class FreteTransportadora implements Frete {
    @Override
    public double calcularFrete(double peso, double distancia) {
        System.out.Println("Calcular o frete de transportadora");
        return peso * 0.8 + distancia * 0.2;
    }
}
```

Criar Fábrica de frete

```java
public class FabricaFrete {
    public static Frete criarFrete(String tipo) {
        if ("correios".equals(tipo)) {
            return new FreteCorreios();
        } else if ("transportadora".equals(tipo)) {
            return new FreteTransportadora();
        } else {
            throw new IllegalArgumentException("Tipo de frete inválido: " + tipo);
        }
    }
}
```
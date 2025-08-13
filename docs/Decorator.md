# Decorator

O padrão decorator permite adicionar novas funcionalidades a um objeto existente, sem alterar sua estrutura. A vantagem é que você pode fazer isso de forma dinâmica em tempo de execução!

Case com Regras de Negócio

Imagine que você está desenvolvendo um sistema de vendas de cafá, a regra de negócio é que o cliente pode escolher um café base e adicionar vários ingredientes extras, como leite, chantilly e chocolate. O preço final do café é a soma do preço base e de todos extras.

Uma abordagem sem um padrão de projeto poderia ser a seguinte:

```java
public class CafeComLeite extends CafeExpresso { /* ... */ }
public class CafeComChantilly extends CafeExpresso { /* ... */ }
public class CafeComLeiteComChantilly extends CafeExpresso { /* ... */ }
// E para cada nova combinação, uma nova subclasse.
```

O problema desse código é a explosão de classes. Se você tiver 4 tipos de café e 3 extras, você precisaroa de 4 * 2³ = 32 subclasses para cobrir todas as combinações. Isso viola o princípio Aberto/Fechado (OCP).

O padrão decorator permite que você "empilhe" funcionalidades em um objeto de forma dinâmica. A ideia é ter um objeto base e decorá-lo com outros objetos com outras funcionalidades.

```java
// Interface comum
public interface Cafe {
    double getPreco();
    String getDescricao();
}
```

```java
// Componente concreto
public class CafeExpresso implements Cafe {
    @Override
    public double getPreco() {
        return 5.0;
    }

    @Override
    public String getDescricao() {
        return "Café expresso";
    } 
}
```

```java
public abstract class CafeDecorator implements Cafe {
    public CafeDecorator(Cafe cafeDecorado) {
        this.cafeDecorado = cafeDecorado;
    }

    @Override
    public double getPreco() {
        return cafeDecorado.getPreco();
    }

    @Override
    public String getDescricao() {
        return cafeDecorado.getDescricao();
    }
}
```

```java
public class LeiteDecorator extends CafeDecorator {
    public LeiteDecorator(Cafe cafeDecorado) {
        super(cafeDecorado);
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 2.0;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", com Leite";
    }
}

public class ChantillyDecorator extends CafeDecorator {
    public ChantillyDecorator(Cafe cafeDecorado) {
        super(cafeDecorado);
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 1.5;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", com Chantilly";
    }
}
```

```java
public class Cafeteria {
    public static void main(String[] args) {
        // Um café expresso simples
        Cafe meuCafe = new CafeExpresso();
        System.out.println(meuCafe.getDescricao() + " | Preço: R$" + meuCafe.getPreco());

        // Um café com leite
        meuCafe = new LeiteDecorator(meuCafe);
        System.out.println(meuCafe.getDescricao() + " | Preço: R$" + meuCafe.getPreco());

        // Agora, o mesmo café com leite e chantilly
        meuCafe = new ChantillyDecorator(meuCafe);
        System.out.println(meuCafe.getDescricao() + " | Preço: R$" + meuCafe.getPreco());
        
        // E, para finalizar, um novo café do zero com chantilly e leite
        Cafe novoCafe = new ChantillyDecorator(new LeiteDecorator(new CafeExpresso()));
        System.out.println(novoCafe.getDescricao() + " | Preço: R$" + novoCafe.getPreco());
    }
}
```

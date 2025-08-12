# Padrão de Projeto: Abstrtact Factory

Abstract Factory: é o padrão criacional que permite que você produza famílias de objetos relacionados sem ter que especificar suas classes concretas.

Problema de Neǵocio:

Você está desenvolvendo um sistema de renderização de interfaces de usuário (UI) para um software multi-plataforma. Seu software precisa ter a capacidade de rodar em Windows e MacOS, e a interface se adaptar ao S.O em que está sendo executada.

No futuro vicê quer adicionar formas de rendererização para Linux e para Web.

```java
// O cliente da nossa UI
public class Aplicacao {
    public void criarUI(String sistemaOperacional) {
        Botao botao;
        if ("Windows".equals(sistemaOperacional)) {
            botao = new BotaoWindows();
        } else {
            botao = new BotaoMac();
        }
        botao.renderizar();

        // E a mesma coisa para o menu...
        Menu menu;
        if ("Windows".equals(sistemaOperacional)) {
            menu = new MenuWindows();
        } else {
            menu = new MenuMac();
        }
        menu.renderizar();
    }
}
```

O problema no código acima: o if-else se repete por toda a aplicação e, se você adicionar um novo s.o, terá que alterar várias partes do código.

Solução com AbstractFactory

Resolve o problema criando Fábrica de Fábricas (Uma fábrica abstrata que cria famílias de objetos). Ele garante que os componentes criados (botões e menus) sejam sempre compatíveis e pertençam à mesma família do estilo (Windows ou Mac)

```java
public interface Botao {
    void renderizar();
}
```

```java
public interface Menu {
    void renderizar();
}
```

```java
// Botões concretos
public class BotaoWindows implements Botao {
    @Override
    public void renderizar() {
        System.out.println("Renderizando Botão do Windows.");
    }
}

public class BotaoMac implements Botao {
    @Override
    public void renderizar() {
        System.out.println("Renderizando Botão do Mac.");
    }
}

// Menus concretos
public class MenuWindows implements Menu {
    @Override
    public void renderizar() {
        System.out.println("Renderizando Menu do Windows.");
    }
}

public class MenuMac implements Menu {
    @Override
    public void renderizar() {
        System.out.println("Renderizando Menu do Mac.");
    }
}
```

Criando a interface de Fábrica Abstrata

```java
public interface FabricaUI {
    Botao criarBotao();
    Menu criarMenu();
}
```

Criar as classes concretas de fábricas

```java
public class FabricaUIWindows implements FabricaUI {
    @Override
    public Botao criarBotao() {
        return new BotaoWindows();
    }

    @Override
    public Menu criarMenu() {
        return new MenuWindows();
    }
}

public class FabricaUIMac implements FabricaUI {
    @Override
    public Botao criarBotao() {
        return new BotaoMac();
    }

    @Override
    public Botao Menu() {
        return new MenuMac();
    }
}
```
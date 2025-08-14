package Observer;

import java.util.ArrayList;
import java.util.List;

public class Acao {
    private String nome;
    private double preco;
    private List<Observer> observadores = new ArrayList<>();

    public Acao(String nome, double preco, List<Observer> observadores) {
        this.nome = nome;
        this.preco = preco;
        this.observadores = observadores;
    }

    public Acao(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }


    public void registrar(Observer observer) {
        observadores.add(observer);
    }

    public void desresgistrar(Observer observer) {
        observadores.remove(observer);
    }

    public void notificarObservadores() {
        for (Observer obs : observadores) {
            obs.atualizar(this.nome, this.preco);
        }
    }

    public void setPreco(double novoPreco) {
        if (this.preco != novoPreco) {
            this.preco = novoPreco;
            System.out.println("O preço da " + this.nome + " mudou para R$" + novoPreco);
            notificarObservadores();
        }
    }
}

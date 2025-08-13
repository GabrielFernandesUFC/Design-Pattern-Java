package Decorator;

import Decorator.decorator.implementation.CompressionDecorator;
import Decorator.implementation.FileDataSource;

public class ProcessadorDeDados {
    public static void main(String[] args) {
        FileDataSource dadosSimples = new FileDataSource("data.txt");
        dadosSimples.writeData("Dados importantes");
        System.out.println(dadosSimples.readData());
        System.out.println("--------------------");

        CompressionDecorator dadosCompletos = new CompressionDecorator(
                                        new CompressionDecorator(
                                            new FileDataSource("dados_seguros.txt")
                                        )
                                     );
        
        dadosCompletos.writeData("Dados super importantes!");
        System.out.println(dadosCompletos.readData());
        System.out.println("--------------------");
    }
}

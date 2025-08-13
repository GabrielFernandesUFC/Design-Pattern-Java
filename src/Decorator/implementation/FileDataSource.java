package Decorator.implementation;

import Decorator.interfaces.DataSource;

public class FileDataSource implements DataSource {
    private String fileName;

    public FileDataSource(String filename) {
        this.fileName = filename;
    }

    @Override
    public void writeData(String data) {
        System.out.println("Escrevendo dados simples no arquivo: " + fileName);
    }

    @Override
    public String readData() {
        System.out.println("Lendo dados simples do arquivo: " + fileName);
        return "Dados lidos do arquivo";
    }
}

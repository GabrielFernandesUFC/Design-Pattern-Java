package Decorator.decorator.implementation;

import Decorator.decorator.DataSourceDecorator;
import Decorator.interfaces.DataSource;

public class CompressionDecorator extends DataSourceDecorator {
    public CompressionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        String compressedData = "dados_compactados(" + data + ")";
        System.out.println("Compactando dados");
        super.writeData(compressedData);
    }

    @Override
    public String readData() {
        String readData = super.readData();
        String decompressedData = "dados_descompactados(" + readData + ")";
        System.out.println("Descompactando dados...");
        return decompressedData;
    }
}

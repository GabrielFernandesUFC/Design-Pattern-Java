package Decorator.decorator.implementation;

import Decorator.decorator.DataSourceDecorator;
import Decorator.interfaces.DataSource;

public class EncryptionDecorator extends DataSourceDecorator {

    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    
    @Override
    public void writeData(String data) {
        String encryptedData = "dados_criptografados(" + data + ")";
        System.out.println("Criptografando dados...");
        super.writeData(encryptedData);
    }

    @Override
    public String readData() {
        String readData = super.readData();
        String decryptedData = "dados_decriptografados(" + readData + ")";
        System.out.println("Decriptografando dados...");
        return decryptedData;
    }
}

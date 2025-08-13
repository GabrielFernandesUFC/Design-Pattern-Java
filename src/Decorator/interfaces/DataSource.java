package Decorator.interfaces;

// Interface do nosso componente que irá ser decorado
public interface DataSource {
    void writeData(String data);
    String readData();
}

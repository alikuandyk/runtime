package lesson26.homework;

public class VegetableBox<K, T extends Cabbage> {
    private K key;
    private T obj;

    public VegetableBox(K key, T obj) {
        this.key = key;
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
}

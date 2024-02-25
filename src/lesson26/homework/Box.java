package lesson26.homework;

public class Box<K, T extends Fruit>{
    private K key;
    private T obj;

    public Box(K key, T obj) {
        this.key = key;
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
}

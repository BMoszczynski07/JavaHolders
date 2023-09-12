public class GenericHolder<T> {
    private T type;

    public GenericHolder(T obj) {
        type = obj;
    }

    public T getObj() {
        return type;
    }

    public void setObj(T obj) {
        type = obj;
    }
}

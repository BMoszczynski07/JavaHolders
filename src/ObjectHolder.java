public class ObjectHolder {
    private Object type;

    public ObjectHolder(Object obj) {
        type = obj;
    }

    public Object getObj() {
        return type;
    }

    public void setObj(Object obj) {
        type = obj;
    }
}

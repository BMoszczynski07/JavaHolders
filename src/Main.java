public class Main {
    public static void main(String[] args) {
        GenericHolder NumberHolder = new GenericHolder(42);

        System.out.println(NumberHolder.getObj());

        NumberHolder.setObj(384);
        System.out.println(NumberHolder.getObj());

        NumberHolder.setObj("Hello World!");
        System.out.println(NumberHolder.getObj());

        NumberHolder.setObj("42");
        System.out.println((int)NumberHolder.getObj() + 1);

        ObjectHolder objHolder = new ObjectHolder("lorem ipsum");
        System.out.println(objHolder.getObj());
    }
}
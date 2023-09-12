public class Main {
    public static void main(String[] args) {
//        GenericHolder NumberHolder = new GenericHolder(42);
//
//        System.out.println(NumberHolder.getObj());
//
//        NumberHolder.setObj(384);
//        System.out.println(NumberHolder.getObj());
//
//        NumberHolder.setObj("Hello World!");
//        System.out.println(NumberHolder.getObj());
//
//        NumberHolder.setObj("42");
//        System.out.println((int)NumberHolder.getObj() + 1);
//
//        ObjectHolder objHolder = new ObjectHolder("lorem ipsum");
//        System.out.println(objHolder.getObj());

        Compare MyComparator = new Compare();
        MyComparator.compareValues(new Car("BMW", 100.1d, 100, 100), new Car("AUDI", 100d, 100, 100));
        MyComparator.compareValues(new Car("BMW", 100, 101, 100), new Car("AUDI", 100, 100, 100));
        MyComparator.compareValues(new Car("BMW", 100, 100, 999), new Car("AUDI", 100, 101, 100));
        MyComparator.compareValues(new Car("BMW", 100.1f, 100, (byte)101), new Car("AUDI", 100.1f, 100, (byte)100));
    }
}
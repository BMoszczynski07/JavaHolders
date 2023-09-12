public class Compare<T extends Comparable> {
    public void compareValues(T a, T b) {
        if (a.compareTo(b) > 0) {
            System.out.printf("%s jest wieksze od %s", a, b);
        } else if (a.compareTo(b) < 0) {
            System.out.printf("%s jest mniejsze od %s", a, b);
        } else {
            System.out.printf("%s == %s", a, b);
        }
    }
}

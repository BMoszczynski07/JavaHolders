public class Car implements Comparable {
    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public String carBrand;
    public double a, b, c;

    public Car(String carBrand, double a, double b, double c) {
        this.carBrand = carBrand;
        this.a = a;
        this.b = b;
        this.c = c;
    }
}

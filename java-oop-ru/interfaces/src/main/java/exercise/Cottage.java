package exercise;

// BEGIN
public class Cottage implements Home {
    private double area;
    private int floorCount;

    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    public double getArea() {
        return area;
    }
    @Override
    public int compareTo(Home o) {
        if(this.area < o.getArea()) return -1;
        else if(this.area > o.getArea()) return 1;
        else return 0;
    }
    public String toString() {
        return String.format("%d этажный коттедж площадью %s метров", floorCount, getArea());
    }
}
// END

package exercise;

// BEGIN
public class Segment {
    private Point begin;
    private Point end;

    public Segment(Point point1, Point point2) {
        begin = point1;
        end = point2;
    }
    public Point getMidPoint() {
        int x = (begin.getX() + end.getX())/2;
        int y = (begin.getY() + end.getY())/2;
        return new Point(x, y);
    }
    public Point getBeginPoint() {
        return begin;
    }
    public Point getEndPoint() {
        return end;
    }
}
// END

package mr223_assign3;

public class Point {
    private int Point1;
    private int Point2;

    public Point() {
    }

    public Point(int F, int E) {
        this.Point1 = F;
        this.Point2 = E;
    }


    public int getPoint1() {
        return Point1;
    }

    public int getPoint2() {
        return Point2;
    }

    public void setPoint2(int theE) {
        if (theE > 0) {
            Point2 = theE;
        } else {
            Point2 = 0;
        }
    }

    public void move(int x, int y) {
        Point1 += x;
        Point2 += y;
    }

    public void moveToXY(int x, int y) {
        Point1 = x;
        Point2= y;
    }
    public void setPoint1(int theF, int theE) {
        if (theF > 0) {
            Point1= theF;
        } else {
            Point1 = 0;
        }
    }


    public boolean isEqualTo(Point p2) {

        return (Point1 == p2.Point1 && Point2 == p2.Point2);
    }

    public double distanceTo(Point p2) {
        return (Math.sqrt(Math.pow(Point1 - p2.Point1, 2) + Math.pow(Point2 - p2.Point2, 2)));
    }

    public String toString() {
        return ("(" + Point1 + "," + Point2 + ")");
    }
}


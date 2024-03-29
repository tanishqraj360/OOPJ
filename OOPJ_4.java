// A class called MyPoint, which models a 2D point with x and y coordinates, is designed as follows:
//    ◦ Two instance variables x (int) and y (int).
//    ◦ A default (or "no-arg") constructor that construct a point at the default location of (0, 0).
//    ◦ A overloaded constructor that constructs a point with the given x and y coordinates.
//    ◦ A method setXY() to set both x and y.
//    ◦ A method getXY() which returns the x and y in a 2-element int array.
//    ◦ A toString() method that returns a string description of the instance in the format "(x, y)".
//    ◦ A method called distance(int x, int y) that returns the distance from this point to another point at the given (x, y) coordinates
//    ◦ An overloaded distance(MyPoint another) that returns the distance from this point to the given MyPoint instance (called another)
//    ◦ Another overloaded distance() method that returns the distance from this point to the origin (0,0)
//    Develop the code for the class MyPoint. Also develop a JAVA program (called TestMyPoint) to test all the methods defined in the class.

class MyPoint {
    int x;
    int y;

    MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int[] getXY() {
        return new int[] { x, y };
    }

    public String toString() {
        return (x + " and " + y);
    }

    public double distance(int x, int y) {
        double x_distance = this.x - x;
        double y_distance = this.y - y;

        return Math.sqrt((x_distance * x_distance) + (y_distance * y_distance));
    }

    public double distance(MyPoint another) {
        return distance(another.x, another.y);
    }

    public double distance() {
        return distance(0, 0);
    }

    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(3, 5);
        MyPoint p2 = new MyPoint(7, 8);

        System.out.println("Point 1: " + p1.toString());
        System.out.println("Point 2: " + p2.toString());

        System.out.println("Distance between Point 1 and (0,0): " + p1.distance());
        System.out.println("Distance between Point 1 and Point 2: " + p1.distance(p2));

        p1.setXY(1, 2);
        System.out.println("New Coordinates for Point 1: " + p1.toString());

        int[] coordinates = p2.getXY();
        System.out.println("Coordinates of Point 2: " + coordinates[0] + " and " + coordinates[1]);

        System.out.println("Distance between Point 1 and (0,0): " + p1.distance());
        System.out.println("Distance between Point 1 and Point 2: " + p1.distance(p2));
    }
}
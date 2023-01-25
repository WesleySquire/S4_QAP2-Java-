package CircleClass;

public class TestMyCircle {

    public static void main(String[] args) {
        // Creating point 1 and point 2 circles
        MyCircle P1 = new MyCircle(10, 10, 5);
        MyCircle P2 = new MyCircle(5, 5, 6);

        System.out.println();

        System.out.println("Point 1 : Coordinates are " + P1.getCenter());
        System.out.println("Point 2 : Coordinates are " + P2.getCenter());
        System.out.println();

        System.out.println("First Circle : Center Coordinates are " + P1.getCenter()
                + " Radius : " + P1.getRadius());
        System.out.println("Second Circle : Center Coordinates are " + P2.getCenter()
                + " Radius : " + P2.getRadius());
        System.out.println();

        // Getting area of both circles
        System.out.println("Area of First Circle = " + P1.getArea());
        System.out.println("Area of Second Circle = " + P2.getArea());
        System.out.println();

        // Getting distance between both circles
        System.out.println("The distance between two circles is " + P1.distance(P2));
        System.out.println();

        System.out.println("Set Circle 1 Center to P2");
        // Setting the center point 1 to point 2's center
        P1.setCenter(P2);
        System.out.println("First Circle : Center Coordinates are " + P1.getCenter()
                + " Radius : " + P1.getRadius());
        System.out.println("Second Circle : Center Coordinates are " + P2.getCenter()
                + " Radius : " + P2.getRadius());
        System.out.println("The new distance between two circles is " +
                P1.distance(P2));
        System.out.println();

        System.out.println("Set Circle 1 Center to (5,10) and Circle 2 to (25,10)");
        P1.setCenterXY(5, 10);
        P2.setCenterXY(25, 10);
        System.out.println("First Circle : Center Coordinates are " + P1.getCenter() + " Radius : " + P1.getRadius());
        System.out.println("Second Circle : Center Coordinates are " + P2.getCenter() + " Radius : " + P2.getRadius());
        System.out.println("The final distance between two circles is " + P1.distance(P2));
        System.out.println();
    }
}

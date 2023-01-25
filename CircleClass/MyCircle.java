package CircleClass;

public class MyCircle {
  private int radius;
  private MyPoint center;

  public MyCircle() {
    // Using MyPoint.java
    // Default Circle
    this.center = new MyPoint(0, 0);
    this.radius = 1;
  }

  public MyCircle(int x, int y, int radius) {
    this.center = new MyPoint(x, y);
    this.radius = radius;
  }

  // Copy constructor for center
  public MyCircle(MyPoint center, int radius) {
    this.radius = radius;
    this.center = center;
  }

  public int getRadius() {
    return this.radius;
  }

  public MyPoint getCenter() {
    return this.center;
  }

  public int getCenterX() {
    return this.center.getX();
  }

  public int getCenterY() {
    return this.center.getY();
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }

  public void setCenterX(int x) {
    this.center.setX(x);
  }

  public void setCenterY(int y) {
    this.center.setY(y);
  }

  public void setCenterXY(int x, int y) {
    this.center.setXY(x, y);
  }

  public void setCenter(MyCircle another) {
    // this.center = another.center;
    // This line of code was causing me glitches through the test. So I created a
    // copy constructor inside MyPoint.java
    this.center.copyXY(another.center);
  }

  public double distance(MyCircle another) {
    return (this.center.distance(another.center));
  };

  public double getArea() {
    int r = this.radius;
    double pi = 3.14;
    // area = pi(r^2)
    return (pi * (r * r));
  }

  public double getCircumference() {
    int r = this.radius;
    double pi = 3.14;
    // cir = 2(pi r)
    return (2 * (pi * r));
  }

  public String toString() {
    // toString() => "MyCircle[radius=r,center=(x,y)]"
    return ("MyCircle[radius=" + this.radius + ",center=" + this.center + "]");
  }
}

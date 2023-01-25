package CircleClass;

public class MyPoint {
  private int x = 0;
  private int y = 0;

  public MyPoint() {
    this.x = 0;
    this.y = 0;
  }

  public MyPoint(int x, int y) {
    this.x = x;
    this.y = y;
  }

  // Copy Class I made
  public void copyXY(MyPoint another) {
    // This points x/y = another my points x/y
    this.x = another.x;
    this.y = another.y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public void setXY(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public void setX(int x) {
    this.x = x;
  }

  public void setY(int y) {
    this.y = y;
  }

  @Override
  public String toString() {
    // New format for required output
    return ("(" + this.x + "," + this.y + ")");
  }

  public double distance(int x, int y) {
    // Difference between x's is the first x - given x's
    int xDiff = this.x - x;
    int yDiff = this.y - y;
    // Return answer
    return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
  }

  public double distance(MyPoint otherPoint) {
    // Difference between x's is the first x - other points x's
    int xDiff = this.x - otherPoint.x;
    int yDiff = this.y - otherPoint.y;
    // Return answer
    return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
  }

  public double distance() {
    // Basic distance if nothing is inputed
    int xDiff = this.x - 0;
    int yDiff = this.y - 0;
    return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
  }
}

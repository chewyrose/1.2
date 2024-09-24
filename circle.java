public class circle {
    private double radius;
    private String color;
    public circle() {
        this.radius = 1.4 ;
        color = "red";
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String newcolor) {
        this.color = color;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

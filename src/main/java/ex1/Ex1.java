package ex1;

public class Ex1 {
    private float radius;

    public Ex1(float givenRadius) {
        this.radius = givenRadius;
    }

    public float calcCirc() {
        float pi = 3.14F;
        return 2 * pi * this.radius;
    }

    public float calcCircMath() {
        return 2 * (float) Math.PI * this.radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return this.radius;
    }

    @Override
    public String toString() {
        return "Ex1{" +
                "radius=" + radius +
                '}';
    }
}

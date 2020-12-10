public enum Planet {
    EARTH(6.3),
    VENUS(6.05),
    MERCURY(2.4);

    private final double radius;

    Planet(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}

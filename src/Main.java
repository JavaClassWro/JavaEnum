public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Java Enum!");
        Planet planet_m = Planet.MERCURY;
        System.out.println("Ord number of "+planet_m.name()+" is "+planet_m.ordinal());
        Planet planet_e = Planet.valueOf("EARTH");
        if (planet_m.getRadius() > planet_e.getRadius()) {
            System.out.println(planet_m.name()+" is bigger than "+planet_e.name());
        } else {
            System.out.println(planet_e.name()+" is bigger than "+planet_m.name());
        }
    }
}

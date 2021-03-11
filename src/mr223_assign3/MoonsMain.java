package mr223_assign3;

public class MoonsMain {

        public static void main(String[] args) {

            Planet Solar = new Planet();
            Solar.setName("Mars");
            Moon moon1 = new Moon(), moon2 = new Moon();
            moon1.setName("\"Phobos\"");
            moon2.setName("\"Deimos\"");

            Solar.addMoon(moon1);
            Solar.addMoon(moon2);
            System.out.print("Moons of " + Solar.getName() + ": ");
            for (Moon Pl : Solar.getMoons()) {
                System.out.print("\n\t" + Pl.getName());
            }
        }
    }

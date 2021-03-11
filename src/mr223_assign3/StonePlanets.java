package mr223_assign3;

public class StonePlanets {
    public static void main(String[] args) {

        Planet[] arrayOfplanets = new Planet[4];

        Planet Mer = new Planet();
        Mer.setName("Mercury");
        Mer.setAphelion(0.47);
        Mer.setPerihelion(0.31);
        Mer.setNoOfMoons(0);
        arrayOfplanets[0] = Mer;

        Planet Ven = new Planet();
        Ven.setName("Venus");
        Ven.setAphelion(0.72);
        Ven.setPerihelion(0.72);
        Ven.setNoOfMoons(0);
        arrayOfplanets[1] = Ven;

        Planet Ear = new Planet();
        Ear.setName("Earth");
        Ear.setAphelion(1.0);
        Ear.setPerihelion(0.99);
        Ear.setNoOfMoons(1);
        Moon moon = new Moon();
        moon.setName("The Moon");
        Ear.addMoon(moon);
        arrayOfplanets[2] = Ear;

        Planet Mar = new Planet();
        Mar.setName("Mars");
        Mar.setAphelion(1.666);
        Mar.setPerihelion(1.382);
        Mar.setNoOfMoons(2);
        Moon moon1 = new Moon();
        moon1.setName("Phobos");
        Mar.addMoon(moon1);
        Moon moon2 = new Moon();
        moon2.setName("Deimos");
        Mar.addMoon(moon2);
        arrayOfplanets[3] = Mar;

        for (int i = 0; i < arrayOfplanets.length; i++) {
            System.out.println("Planet " + arrayOfplanets[i].getName() + " has aphelion "
                    + arrayOfplanets[i].getAphelion() + " AU, perihelion " + arrayOfplanets[i].getPerihlion()
                    + " AU and " + arrayOfplanets[i].getNoOfMoons() + " moons.");
            for (int j = 0; j < arrayOfplanets[i].getNoOfMoons(); j++) {
                Moon[] moons = arrayOfplanets[i].getMoons();
                System.out.println("\t" + moons[j].getName());

            }
        }

    }

}


package mr223_assign3;

public class MarsMain {
    public static void main(String[] args) {
        Planet Mars = new Planet();
        Mars.setName("\"Mars\"");
        Mars.setPositionFromSun(4);
        Mars.setNoOfMoons(2);
        Mars.setAphelion(1.666);
        Mars.setPerihelion(1.382);
        System.out.println(Mars.getName() + ": " + "\n Postion: " + Mars.getPositionFromSun() + "\n Moons: "
                + Mars.getNoOfMoons() + "\n Aphelion: " + Mars.getAphelion() + "\n preihelion: " + Mars.getPerihlion());

    }

}

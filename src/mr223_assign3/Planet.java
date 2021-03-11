package mr223_assign3;

import java.util.ArrayList;
    public class Planet {

        private String name;
        private int positionFromSun;
        private int noOfMoons;
        private double aphelion;
        private double perihelion;
        private ArrayList<Moon> moons = new ArrayList<>();

        public Planet () {

        }
        public Planet(String name, int positionFromSun, int noOfMoons, double aphelion, double perihelion) {
            this.name = name;
            this.positionFromSun = positionFromSun;
            this.noOfMoons = noOfMoons;
            this.aphelion = aphelion;
            this.perihelion = perihelion;
        }
        public String getName() {

            if(name.equals("")) {
                return "Unknown Palnet";
            }
            else {
                return name;
            }
        }
        public void setName(String theName) {
            name = theName;

        }
        public int getPositionFromSun() {

            return positionFromSun;
        }
        public void setPositionFromSun(int thePositionFromSun) {
            if (thePositionFromSun>=1 && thePositionFromSun<=9) {
                positionFromSun = thePositionFromSun;
            }
            else {
                positionFromSun =0;
            }
        }
        public int getNoOfMoons() {

            return noOfMoons;
        }
        public void setNoOfMoons(int theNoOfMoons) {
            if (theNoOfMoons>0 && theNoOfMoons<100) {
                noOfMoons = theNoOfMoons;
            }
            else {
                noOfMoons =0;
            }
        }
        public double getAphelion() {

            return aphelion;
        }
        public void setAphelion(double theAphelion) {
            if (theAphelion>0 && theAphelion<50) {
                aphelion = theAphelion;
            }
            else {
                aphelion =0;
            }

        }
        public double getPerihlion() {

            return perihelion;
        }
        public void setPerihelion(double thePerihelion) {
            if (thePerihelion>0 && thePerihelion<30) {
                perihelion = thePerihelion;
            }
            else {
                perihelion =0;
            }
        }
        public void addMoon(Moon newMoon) {
            moons.add(newMoon);
        }


        public Moon[] getMoons () {
            Moon[] Earth = new Moon[moons.size()];
            for (int i = 0; i<moons.size(); i++) {
                Earth [i]= new Moon(moons.get(i).getName(),moons.get(i).getDiameter());
            }
            return Earth;

        }
    }




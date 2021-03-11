package mr223_assign3;

public class Moon {
        private String name;
        private int diameter;

        public Moon () {

        }

        public Moon(String name, int diameter) {
            this.name = name;
            this.diameter = diameter;

        }

        public String getName() {
            if(name.equals("")) {
                return "\"Unknown Moon\"";
            }
            else {
                return name;
            }

        }

        public void setName(String name) {

            if(name.equals("")) {
                this.name = "Unknown Moon";
            }
            else {
                this.name = name;
            }

        }

        public int getDiameter() {
            return diameter;
        }

        public void setDiameter(int diameter) {
            if (diameter>0){
                this.diameter = diameter;
            }
            else {
                diameter = 0;
            }
        }

    }


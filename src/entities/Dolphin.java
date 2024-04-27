package entities;

public class Dolphin extends Aquatic{
package entities;

    public class Dolphin extends Aquatic{
        //var
        private float swimmingSpeed;

        //Constructeur
        public Dolphin(){}
        public Dolphin(String fam, String na, int ag, boolean mammal, String habitat, float swimmingSpeed){
            super(fam, na, ag, mammal, habitat);
            this.swimmingSpeed = swimmingSpeed;
        }

        //methodes

        @Override
        public void swim() {
            System.out.println("This dolphin is swimming.");
        }

        //toSring
        @Override
        public String toString() {
            return "Dolphin = [family : "+ this.family + ",\n" +
                    "name : "+ this.name + ",\n" +
                    "age : "+ this.age + ",\n" +
                    "mammal : "+ this.mammal + ",\n" +
                    "habitat : "+ this.habitat + ",\n" +
                    "Speed : "+ this.swimmingSpeed + "]"
                    ;
        }
    }

}

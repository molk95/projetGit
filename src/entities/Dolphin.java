package entities;

public class Dolphin extends Aquatic{
package entities;

    public class Dolphin extends Aquatic{


        private float swimmingSpeed;
        private  float a ;

       


        private float swimmingSpeed;


      
        public Dolphin(){}
        public Dolphin(String fam, String na, int ag, boolean mammal, String habitat, float swimmingSpeed){
            super(fam, na, ag, mammal, habitat);
            this.swimmingSpeed = swimmingSpeed;
        }



        @Override
        public void swim() {
            System.out.println("This dolphin is swimming.");
        }


        @Override
        public String toString() {
            return "Dolphin = [family : "+ this.family + ",\n" +
                    "name : "+ this.name + ",\n" +
                    "age : "+ this.age + ",\n" +
                    "habitat : "+ this.habitat + ",\n" +
                    "Speed : "+ this.swimmingSpeed + "]"
                    ;
        }
    }

}

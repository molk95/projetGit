package entities;

public class Aquatic extends Animal {
    protected String habitat;

    public Aquatic() {
    }

    public Aquatic(String fam, String na, int ag, boolean mammal, String habitat) {
        super(fam, na, ag, mammal);
        this.habitat = habitat;
    }

    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }

    public String toString() {
        return "AQUATIC = [family : " + this.family + ",\nname : " + this.name + ",\nage : " + this.age + ",\nmammal : " + this.mammal + ",\nhabitat : " + this.habitat + "]";
    }
}

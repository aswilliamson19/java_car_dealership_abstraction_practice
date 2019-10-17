package people;

public abstract class Person {

    private String name;
    private int strength;

    public Person(String name) {
        this.name = name;
        this.strength = strength;
        setStrength();
    }

    public String getName() {
        return name;
    }

    public void setStrength() {
        int rand = (int)(Math.random() * 10) + 1;
        this.strength = rand;
    }

    public int getStrength(){
        return this.strength;
    }
}

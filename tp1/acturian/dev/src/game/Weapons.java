package game;

public class Weapons {
    private Weapons(String name, int power) {
        this.power = power;
        this.name = name;
    }

    public static Weapons createWeapon(String name, int power){
        return new Weapons(name, power);
    }

    public int getPower() {
        return power;
    }



    private int power;
    public String name;

}

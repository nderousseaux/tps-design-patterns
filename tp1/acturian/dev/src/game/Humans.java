package game;

import java.util.ArrayList;

public class Humans extends Creatures {
    private int strengh = 20;
    private ArrayList<Weapons> weapons;

    private Humans(){
    }

    public ArrayList<Weapons> getWeapons() {
        return this.weapons;
    }

    public void addWeapon(Weapons weapon) {
        this.weapons.add(weapon);
    }

    public void deleteWeapon(Weapons weapon){
        this.weapons.remove(weapon);
    }

    public static Humans createHuman(){
        return new Humans();
    }
}

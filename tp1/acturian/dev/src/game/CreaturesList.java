package game;

import java.util.ArrayList;

public class CreaturesList {
    private static ArrayList<Creatures> creaturesList;

    public static ArrayList<Creatures> getAll() {
        return creaturesList;
    }

    public static Creatures get(int index) {
        return creaturesList.get(index);
    }

    public static void add(Creatures creatures) {
        creaturesList.add(creatures);
    }

    public static void remove(int index) {
        creaturesList.remove(index);
    }

    public static void createHuman(){
        creaturesList.add(Humans.createHuman());
    }
    public static void createActurian(int strengh){
        creaturesList.add(Acturians.createActurian(strengh));
    }
}

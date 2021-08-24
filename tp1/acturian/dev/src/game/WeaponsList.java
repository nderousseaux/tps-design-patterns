package game;

import java.util.ArrayList;

public class WeaponsList {
    private static ArrayList<Weapons> weaponList;

    public static void createWeapon(String name, int power){
        weaponList.add(Weapons.createWeapon(name, power));
    }


}

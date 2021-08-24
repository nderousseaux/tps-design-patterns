package Controler;

import game.*;

public class ActurusGame {

    public void fight(Creatures striker, Creatures victim){
        if(striker.getClass() == victim.getClass()){
            throw new IllegalArgumentException("Les deux combatants de la même espèce");
        }
        else if(striker.getLife()<=0){
            throw new IllegalArgumentException("L'attanquant est mort");
        }
        else if(victim.getLife()<=0){
            throw new IllegalArgumentException("La victime est déjà morte");
        }
        else{
            int strengh = striker.getStrengh();
            if(striker.getClass().getName() == "Humans"){
                for (Weapons weapon:((Humans)striker).getWeapons()) {
                    strengh+=weapon.getPower();
                }
            }
            victim.setLife(victim.getLife()-strengh);

        }


    }

    public void createHuman(){
        CreaturesList.createHuman();
    }

    public void createActurian(int strengh){
        CreaturesList.createActurian(strengh);
    }

    public void createWeapon(String name, int power){
        WeaponsList.createWeapon(name, power);
    }

    public void giveWeapon(Weapons weapon, Humans humans){
        humans.addWeapon(weapon);
    }

    public void deleteWeapon(Humans humans, Weapons weapon){
        humans.deleteWeapon(weapon);
    }

}

package game;

public class Acturians extends Creatures {

    private Acturians(int strengh) {
        super.strengh = strengh;
    }

    public static Acturians createActurian(int strengh){
        return new Acturians(strengh);
    }
}

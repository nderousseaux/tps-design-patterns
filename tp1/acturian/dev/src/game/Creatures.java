package game;

public abstract class Creatures {
    int strengh;
    private int life = 200;
    String name;

    public int getStrengh() {
        return this.strengh;
    }

    public void setStrengh(int strengh) {
        this.strengh = strengh;
    }

    public int getLife() {
        return this.life;
    }

    public void setLife(int life) {
        this.life = life;
    }
}

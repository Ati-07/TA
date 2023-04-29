public class Enemy {

    protected String name;
    protected int hp;
    protected int damage;
    protected int legSize;

public Enemy(){}

    public Enemy(String name, int hp, int damage, int legSize){
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.legSize = legSize;


    }


    public boolean is_alive(){
        return (this.hp > 0);
    }

    public String toString(){
        return String.format("%s \n=====\n %s \nvalue= %d \n", this.name, this.hp, this.damage, this.legSize);
    }
}

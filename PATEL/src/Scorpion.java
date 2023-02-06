public class Scorpion extends Enemy{
    String name;
    protected int hp;
    protected int damage;
    protected int speed;
    protected String poisonous;
    public Scorpion(String name, int hp, int damage, int speed, String poisonous){
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.speed = speed;
        this.poisonous = poisonous;

    }
    public String toString(){
        return String.format("%s \n=====\nHp = %s \nDamage = %d \nSpeed = %d \nPoisonous =%s \n",
                this.name, this.hp, this.damage, this.speed, this.poisonous);
    }

}

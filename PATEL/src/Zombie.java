public class Zombie extends Enemy{
    String name;
    protected int hp;
    protected int damage;
    protected int speed;
    protected String head;

    public Zombie(String name, int hp, int damage, int speed, String head){
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.speed = speed;
        this.head = head;
    }
    public String toString(){
        return String.format("%s \n=====\nHp = %s \nDamage = %d \nSpeed = %s \nHead = %s \n",
                this.name, this.hp, this.damage, this.speed, this.head);
    }



}

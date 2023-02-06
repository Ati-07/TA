public class Dog extends Enemy{
    String name;
    protected int hp;
    protected int damage;
    protected int bite;
    protected String friendly;
    public Dog(String name, int hp, int damage, int bite, String friendly){
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.bite = bite;
        this.friendly = friendly;

    }
    public String toString(){
        return String.format("%s \n=====\nHp = %s \nDamage = %d \nBite =%s \nfriendly = %s \n",
                this.name, this.hp, this.damage, this.bite, this.friendly);
    }
}
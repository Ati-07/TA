public class Ogre extends Enemy {
    String name;
    protected int hp;
    protected int damage;
    protected int bodyFat;
    protected String speed;


    public Ogre(String name, int hp, int damage, int bodyFat, String speed) {

        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.bodyFat = bodyFat;
        this.speed = speed;
    }

    public String toString() {
        return String.format("%s \n=====\nHp = %s \nDamage = %d \nbodyfat = %s \nspeed =%s \n",
                this.name, this.hp, this.damage, this.bodyFat, this.speed);
    }
}





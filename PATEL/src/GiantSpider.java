public class GiantSpider extends Enemy {
    String name;
    protected int hp;
    protected int damage;
    protected String legSize;

    public GiantSpider(String name, int hp, int damage, String legSize) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.legSize = legSize;

    }

    public String toString() {
        return String.format("%s \n=====\nHp = %s \nDamage = %d \nlegSize = %s \n",
                this.name, this.hp, this.damage, this.legSize);
    }
}
public class Main {
    public static void main(String[] args) {

        Gold goldbar = new Gold(50);

        Weapon weapon = new Weapon("Hard weapon",
                "Hard 1 weapon",
                10, 50);
        weapon.setDamage(40);
       int dvalue = weapon.getDamage();

        Weapon sword = new Weapon("Laser Sword",
                "A Sword with Laser",
                15, 35);
        sword.setDamage(30);
        int damagevalue = sword.getDamage();

        Weapon pillow = new Weapon("Soft Pillow",
                "Soft pillow with cotton",
                1, 1);
        pillow.setDamage(5);
        int damagevalue1 = pillow.getDamage();

        Weapon mace = new Weapon("Mace",
                "Heavier then a sword",
                15, 40);
        mace.setDamage(40);
        int damagevalue2 = mace.getDamage();

        Weapon arrow = new Weapon("Arrow",
                "sharp like a spike",
                30, 50);
        arrow.setDamage(40);
        int damagevalue3 = arrow.getDamage();


        System.out.println(goldbar);
        System.out.println(sword);
        System.out.println(pillow);
        System.out.println(mace);
        System.out.println(arrow);
    }
}
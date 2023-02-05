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

        Pillow softpillow = new Pillow();

         Mace sharpmace = new Mace();

        Weapon arrow = new Weapon("Arrow",
                "sharp like a spike",
                30, 50);
        arrow.setDamage(40);
        int damagevalue3 = arrow.getDamage();

        Enemy greenOgre = new Enemy("greenOrge",
                20, 15);

        Enemy redOrge = new Enemy("redOrge",
                30, 40);

        Enemy slowZombie = new Enemy("SlowZombie",
                15, 20);

        Enemy fastZombie = new Enemy("fastZombie",
                30, 45);

        Enemy GiantSpider = new Enemy("GiantSpider",
                25,35);

        Enemy spotDog = new Enemy("spotDog",
                15, 25);

        Enemy Scorpion = new Enemy("Green Scorpion",
                30, 45);

        System.out.println(goldbar);
        System.out.println(sword);
        System.out.println(softpillow);
        System.out.println(sharpmace);
        System.out.println(arrow);
        System.out.println(greenOgre);
        System.out.println(redOrge);
        System.out.println(slowZombie);
        System.out.println(fastZombie);
        System.out.println(GiantSpider);
        System.out.println(spotDog);
        System.out.println(Scorpion);
    }
}
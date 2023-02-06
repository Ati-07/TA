import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Gold goldbar = new Gold(50);

        Weapon weapon = new Weapon("Hard weapon",
                "Hard 1 weapon",
                10, 50);

        weapon.setDamage(40);
       int dvalue = weapon.getDamage();

         Sword HeavySword = new Sword();
        HeavySword.setDamage(30);
        int damagevalue = HeavySword.getDamage();

        Pillow softpillow = new Pillow();

         Mace sharpmace = new Mace();


         Arrow SharpArrow= new Arrow("Arrow",
                "sharp like a spike",
                30, 50);
        SharpArrow.setDamage(40);
        int damagevalue3 = SharpArrow.getDamage();

        Ogre greenOgre = new Ogre("greenOgre", 20, 35,
                80, "20");

        Ogre redOrge = new Ogre("redOgre", 20, 35,
                50, "30");

        Zombie slowZombie = new Zombie("slowZombie", 25,
                30, 40, "With Head");

        Zombie fastZombie = new Zombie("fastZombie", 30,
                45, 90, "With out Head");

        Enemy GiantSpider = new GiantSpider("GiantSpider", 35,
                40, "Huge lags");

        Enemy spotDog = new Dog("spotDog", 20, 35,
                30, "Sweet");

        Scorpion BlackScorpion = new Scorpion("BlackScorpion",15,
                40, 35, "Very Poisonous" );

        System.out.println(goldbar);
        System.out.println(HeavySword);
        System.out.println(softpillow);
        System.out.println(sharpmace);
        System.out.println(SharpArrow);
        System.out.println(greenOgre);
        System.out.println(redOrge);
        System.out.println(slowZombie);
        System.out.println(fastZombie);
        System.out.println(GiantSpider);
        System.out.println(spotDog);
        System.out.println(BlackScorpion);
    }
}
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

        Enemy enemy = new Enemy("Dangers thing",20, 30);

        


        System.out.println(goldbar);
        System.out.println(sword);
        System.out.println(softpillow);
        System.out.println(sharpmace);
        System.out.println(arrow);
    }
}
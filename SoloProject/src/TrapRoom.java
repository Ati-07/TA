public class TrapRoom extends EnemyRoom{
    Trap enemy;

    public TrapRoom(int x, int y, Trap enemy){
        super(x, y, enemy);
        this.enemy = enemy;
    }
    public String intro_text(){
        if (enemy.is_alive()){
            return " A Giant Cyclops comes out, the whole ground shivers at its movement as it approaches you!!!";
        }else{
            return "The corps of a dead Ogre rots on the ground.";
        }
    }
}

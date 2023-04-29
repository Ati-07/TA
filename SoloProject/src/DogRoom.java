public class DogRoom extends EnemyRoom{

    Dog enemy;
    public DogRoom(int x, int y, Dog enemy){
        super(x, y, enemy);
        this.enemy = enemy;
    }

    public String intro_text(){
        if (enemy.is_alive()){
            return "You enter a dark and musty room, and suddenly a Dog jumps from the shadows to attack you!";
        }else{
            return "The carcass of a Dog lies crumpled in the corner of the room.";
        }
    }

}
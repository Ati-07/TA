public class TreasureRoom extends LootRoom {
    public TreasureRoom(int x, int y, Compass compass){
        super(x, y,compass);
    }
    public String intro_text(){
        if(pickedItem == false)
            return String.format("You Notice you get one Compass on the floor. it's help you to navigate map.");
        else
            return "";
    }
}
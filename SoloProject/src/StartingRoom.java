public class StartingRoom extends MapTile {
    public StartingRoom(int x,int y){
        super(x, y);
    }

    public String intro_text() {
        return "\n You find yourself in a massive Square filed with a map on the wall.\nMap help you out to escape from this maze";
    }
    public void modify_player(Player player){

    }
}
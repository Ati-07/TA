public class EmptyPath extends MapTile {
    private String desc;

    public EmptyPath(int x, int y) {
        super(x, y);
        desc = "Empty room with creaking floorboards, rusty walls and feels presence of natural entities";
    }

    @Override
    public String intro_text() {
        return desc;
    }
    @Override
    public void modify_player(Player player){

    }
}
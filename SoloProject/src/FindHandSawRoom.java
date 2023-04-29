public class FindHandSawRoom extends LootRoom{
    public FindHandSawRoom (int x, int y, HandSaw handSaw){
        super(x, y, handSaw);
    }
    public String intro_text(){
        if(pickedItem == false)
            return String.format("You got one HandSaw for killing Enemy");
        else
            return "";
    }
}
public class FindGunRoom extends LootRoom{
    public FindGunRoom (int x, int y, Gun gun){
        super(x, y, gun);
    }
    public String intro_text(){
        if(pickedItem == false)
            return String.format("You got one Gun for killing Enemy");
        else
            return "";
    }
}
import java.awt.Point;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


public class World {
    public static String[][] _world;
    static Point Starting_Position = new Point(0, 0);
    public static ArrayList<MapTile> history = new ArrayList<MapTile>();

    public void load_tiles() {

        List<String> rows = new ArrayList<String>();
        try {
            BufferedReader f = new BufferedReader(new FileReader("src/map.txt")); // Buffer Class
            String row;
            while ((row = f.readLine()) != null) {                                       // f - Object
                rows.add(row);
            }
            f.close();
            int x_max = rows.get(0).split("\t").length;   // finding number of cols // split find the character
            _world = new String[rows.size()][x_max];
            String[] cols;
            String tile_name;
            for (int y = 0; y < rows.size(); y++) {
                cols = rows.get(y).split("\t");
                for (int x = 0; x < cols.length; x++) {           // Counter control loop
                    tile_name = cols[x];
                    if (tile_name.equals("StartingRoom")) {
                        Starting_Position.x = y;
                        Starting_Position.y = x;
                    }
                    _world[y][x] = tile_name.equals(" ") ? null : tile_name;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static MapTile tile_exists(int x, int y) {
        MapTile mt = null;

        //Todo : verify the x and y exist in the world
        if ((x >= 0 && x < _world.length) && (y >= 0 && y < _world[0].length)
                && _world[x][y] != null) {
            switch (_world[x][y]) {
                case "StartingRoom":
                    mt = new StartingRoom(x, y);
                    mt = checkRoomExists(mt);
                    break;

                case "Dog":
                    mt = new DogRoom(x, y, new Dog(25,45));
                    mt = checkRoomExists(mt);
                    break;

                case "TreasureRoom":
                    mt = new TreasureRoom(x, y, new Compass(2));
                    mt = checkRoomExists(mt);
                    break;

                case "EmptyPath":
                    mt = new EmptyPath(x, y);
                    break;
                case "FindHandSawRoom":
                    mt = new FindHandSawRoom(x, y,new HandSaw());
                    mt = checkRoomExists(mt);
                    break;

                case "FindGunRoom":
                    mt = new FindGunRoom(x,y,new Gun());
                    mt = checkRoomExists(mt);
                    break;

                case "TrapRoom":
                    mt = new TrapRoom(x, y, new Trap("Very Sarp","Easy to fit one human in it."));
                    mt = checkRoomExists(mt);
                    break;

                case "ExitRoom":
                    mt = new ExitRoom(x, y);
                    break;


            }
        }
        return mt;

    }
    private static MapTile checkRoomExists(MapTile mt) {
        if (history.indexOf(mt) != -1) {
            mt = history.get(history.indexOf(mt));
        }else {
            history.add(mt);
        }
        return mt;
    }
}


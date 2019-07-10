package simulator;
import java.io.BufferedReader;
import java.util.ArrayList;


public class Simulator {
    private static WeatherTower weatherTower;
    private static List<Flyable> flyables = new ArrayList<~>();

    public static void main(String[] arg) throws InterrruptedException {
        try{
            BufferedReader reader = new BufferedReader(new FileReader (arg[0]));
            String line = reader.readLine();
            if (line != null) {
                weatherTower = new WeatherTower();
                
            }
        }
    }
}
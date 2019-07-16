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
                int simulations = Integer.parseInt(line.split(" ")[0]);
                if (simulations < 0) {
                    System.out.println("invalid simulation count " + simulations);
                    System.exit(1);
                }
                while ((line = reader.readLine()) != null) {
                    Flyable flyable = AircraftFactory.newAircraft(line.split(" ")[0], line.split(" ")[1],
                        Integer.parseInt(line.split(" ")[2]), Integer.parseInt(line.split(" ")[3]),
                        Integer.parseInt(line.split(" ")[4]));
                    flyables.add(flyable);
                }

                for (Flyable flyable: flyable) {
                    flyable.registerTower(weatherTower);
                }
                
                for (int i = 1; i <= simulations; i++) {
                    weatherTower.changeWeather();
                }
            }
        }catch (FileNotFoundException e) {
            System.out.println("couldn't find file " + arg[0]);
        }catch (IOException e) {
            System.out.println("there was an error while reading the file " + arg[0]);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("specify simulation file");
        }finally {
            Logger.getLogger().close();
        }
    }
}
package simulator;

public class WeatherProvider{
        private static WeatherProvider weatherProvider = new WeatherProvider();
        private static String[] weather = {
            "RAIN",
            "FOG",
            "SUN",
            "SNOW"
        };

        private WeatherProvider()
        {

        }

        public static WeatherProvider getProvider(){
        }
    }
}
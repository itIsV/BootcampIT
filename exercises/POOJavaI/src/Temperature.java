public class Temperature {

    public static void main(String[] args) {
        String[] cities = {"Londres", "Madrid", "Nueva York", "Buenos Aires", "Asunción", "São Paulo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"};
        int[][] temperatures = {{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};
        int min_value = Integer.MIN_VALUE;
        int max_value = Integer.MAX_VALUE;
        String highest_temperature_city = "";
        String lower_temperature_city = "";
        int min_temperature_index = 0;
        int max_temperature_index = 1;

        for (int index = 0; index < cities.length; index += 1) {
            int city_max_temperature = temperatures[index][max_temperature_index];
            int city_min_temperature = temperatures[index][min_temperature_index];


            if( city_max_temperature > min_value) {
                highest_temperature_city = "the hottest city is " + cities[index];
                min_value = city_max_temperature;
            }
            if( city_min_temperature < max_value) {
                lower_temperature_city = "the coldest city is " + cities[index];
                max_value = city_max_temperature;
            }
        }
        System.out.println(highest_temperature_city);
        System.out.println(lower_temperature_city);
    }
}

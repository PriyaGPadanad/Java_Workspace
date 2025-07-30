public class Earth {
    String continent;
    String climate; 
    double radius; // in kilometers
    double population; // in billions

    public static void main(String[] args) {
        Earth earth1 = new Earth();
        earth1.continent = "North America";
        earth1.climate = "Temperate";
        earth1.radius = 6371.0;
        earth1.population = 0.59; 

        Earth earth2 = new Earth();
        earth2.continent = "South America";
        earth2.climate = "Tropical";
        earth2.radius = 6371.0;
        earth2.population = 0.43;

        Earth earth3 = new Earth();
        earth3.continent = "Europe";
        earth3.climate = "Temperate";
        earth3.radius = 6371.0;
        earth3.population = 0.75;

        Earth earth4 = new Earth();
        earth4.continent = "Africa";
        earth4.climate = "Tropical";
        earth4.radius = 6371.0;
        earth4.population = 1.34;

        Earth earth5 = new Earth();
        earth5.continent = "Asia";
        earth5.climate = "Varied";
        earth5.radius = 6371.0;
        earth5.population = 4.64;

        Earth earth6 = new Earth();
        earth6.continent = "Australia";
        earth6.climate = "Varied";
        earth6.radius = 6371.0;
        earth6.population = 0.043;

        Earth earth7 = new Earth();
        earth7.continent = "Antarctica";
        earth7.climate = "Polar";
        earth7.radius = 6371.0;
        earth7.population = 0.000004;

        Earth earth8 = new Earth();
        earth8.continent = "North America";
        earth8.climate = "Varied";
        earth8.radius = 6371.0;
        earth8.population = 0.59;

        Earth earth9 = new Earth();
        earth9.continent = "Asia";
        earth9.climate = "Tropical";
        earth9.radius = 6371.0;
        earth9.population = 4.64;

        Earth earth10 = new Earth();
        earth10.continent = "Europe";
        earth10.climate = "Maritime";
        earth10.radius = 6371.0;
        earth10.population = 0.75;

        System.out.println("earth1 continent:" + earth1.continent);
        System.out.println("earth1 climate:" + earth1.climate);
        System.out.println("earth1 radius:" + earth1.radius);
        System.out.println("earth1 population:" + earth1.population);

        System.out.println("earth2 continent:" + earth2.continent);
        System.out.println("earth2 climate:" + earth2.climate);
        System.out.println("earth2 radius:" + earth2.radius);
        System.out.println("earth2 population:" + earth2.population);

        System.out.println("earth3 continent:" + earth3.continent);
        System.out.println("earth3 climate:" + earth3.climate);
        System.out.println("earth3 radius:" + earth3.radius);
        System.out.println("earth3 population:" + earth3.population);

        System.out.println("earth4 continent:" + earth4.continent);
        System.out.println("earth4 climate:" + earth4.climate);
        System.out.println("earth4 radius:" + earth4.radius);
        System.out.println("earth4 population:" + earth4.population);

        System.out.println("earth5 continent:" + earth5.continent);
        System.out.println("earth5 climate:" + earth5.climate);
        System.out.println("earth5 radius:" + earth5.radius);
        System.out.println("earth5 population:" + earth5.population);

        System.out.println("earth6 continent:" + earth6.continent);
        System.out.println("earth6 climate:" + earth6.climate);
        System.out.println("earth6 radius:" + earth6.radius);
        System.out.println("earth6 population:" + earth6.population);

        System.out.println("earth7 continent:" + earth7.continent);
        System.out.println("earth7 climate:" + earth7.climate);
        System.out.println("earth7 radius:" + earth7.radius);
        System.out.println("earth7 population:" + earth7.population);

        System.out.println("earth8 continent:" + earth8.continent);
        System.out.println("earth8 climate:" + earth8.climate);
        System.out.println("earth8 radius:" + earth8.radius);
        System.out.println("earth8 population:" + earth8.population);

        System.out.println("earth9 continent:" + earth9.continent);
        System.out.println("earth9 climate:" + earth9.climate);
        System.out.println("earth9 radius:" + earth9.radius);
        System.out.println("earth9 population:" + earth9.population);

        System.out.println("earth10 continent:" + earth10.continent);
        System.out.println("earth10 climate:" + earth10.climate);
        System.out.println("earth10 radius:" + earth10.radius);
        System.out.println("earth10 population:" + earth10.population);
    }
}
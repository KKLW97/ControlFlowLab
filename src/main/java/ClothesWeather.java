import java.util.Scanner;

public class ClothesWeather {
    public static void main(String[] args) {

//        BOUNCER PATTERN - checks, individual checks, they're not linked, they don't rely on each other
        Scanner reader = new Scanner(System.in);

        System.out.println("Please describe the weather (e.g. sunny, rainy, snow)");
        String weather = reader.nextLine();

        System.out.println("Please enter the temperature in Celsius");
        int temperature = reader.nextInt();

        if(weather.toLowerCase().equals("sunny") && temperature > 8){
            System.out.println("Short sleeve and shorts");
        }
        if(weather.toLowerCase().equals("sunny") && temperature < 8){
            System.out.println("Sunglasses and a thin coat");
        }
    }
}

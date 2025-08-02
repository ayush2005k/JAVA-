import java.util.Scanner;
import java.lang.Math;

public class TemperatureConverter { 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int S = sc.nextInt();
        int E = sc.nextInt();
        int W = sc.nextInt();

        sc.close();

        int currentFahrenheit = S;
        while (currentFahrenheit <= E) {
            double celsius = (currentFahrenheit - 32) * 5.0 / 9.0;
            
            int convertedCelsius;

            if (celsius >= 0) {
                convertedCelsius = (int) Math.floor(celsius);
            } else {
                convertedCelsius = (int) Math.ceil(celsius);
            }
            
            System.out.println(currentFahrenheit + "\t" + convertedCelsius);
            
            currentFahrenheit += W;
        }
    }

}

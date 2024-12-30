
import java.util.Scanner;

/**
 *
 * @author Precious
 */
public class TemperatureConveter {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        
        System.out.println("Temperature Conversion Program");
        System.out.println("------------");
        
        System.out.print("Enter temperature value");
        double temperature= scanner.nextDouble();
        
        System.out.println("Select origginal unit");
        System.out.println("1. Celsius(C)");
        System.out.println("2. Fahrenheit(F)");
        System.out.println("3. Kelvin(K)");
        
        int choice=scanner.nextInt();
        
        switch (choice){
            case 1:
                convertFromCelsius(temperature);
                break;
                
            case 2:
                convertFromFahrenheit(temperature);
                break;
                
            case  3:
                convertFromKelvin(temperature);
                break;
            default:
                System.out.println("Invaild choice");
        }
    }
private static void convertFromCelsius(double celsius){
    double fahrenheit=(celsius * 9/5) +32;
    
    double kelvin= celsius + 273.15;
    
    System.out.printf("%.2f°C=%.2f°F=%.2fK%n",celsius,fahrenheit,kelvin);
}
private static void convertFromFahrenheit(double fahrenheit){
    double celsius=(fahrenheit-32)* 5/9;
    
    double kelvin=(fahrenheit-32) *5/9 +273.15;
    
    System.out.printf("%.2f°F=%.2f°C=%.2fK%n",fahrenheit,celsius,kelvin);
}
private static void convertFromKelvin(double kelvin){
    double celsius= kelvin- 273.15;
    
    double fahrenheit=(kelvin -273.15) *9/5 +32;
    
   System.out.printf("%.2fK=%.2f°C=%.2f°F%n",kelvin,fahrenheit,celsius);
    
}    
}

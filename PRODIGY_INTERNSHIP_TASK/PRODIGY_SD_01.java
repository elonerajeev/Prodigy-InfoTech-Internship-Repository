import java.util.Scanner;

public class PRODIGY_SD_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter temperature value: ");
        double temperature = scanner.nextDouble();

        // Prompt user for the original unit of measurement
        System.out.print("Enter original unit (C for Celsius, F for Fahrenheit, K for Kelvin): ");
        char originalUnit = scanner.next().charAt(0);

        // Convert temperature and display results
        convertAndDisplay(temperature, originalUnit);

        scanner.close();
    }

    // Function to convert and display temperatures
    private static void convertAndDisplay(double temperature, char originalUnit) {
        double celsius, fahrenheit, kelvin;

        // Convert to Celsius for calculation
        switch (originalUnit) {
            case 'F':
                celsius = (temperature - 32) * 5 / 9;
                break;
            case 'K':
                celsius = temperature - 273.15;
                break;
            default:
                celsius = temperature;
        }

        // Convert to Fahrenheit
        fahrenheit = (celsius * 9 / 5) + 32;

        // Convert to Kelvin
        kelvin = celsius + 273.15;

        // Display results
        System.out.println("Converted Temperatures:");
        System.out.println("Celsius: " + celsius);
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Kelvin: " + kelvin);
    }
}

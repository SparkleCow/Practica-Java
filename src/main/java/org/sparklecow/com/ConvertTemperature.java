package org.sparklecow.com;

/*Convert temperature between degrees Celsius and Fahrenheit*/
public class ConvertTemperature {
    // Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Fahrenheit a Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}

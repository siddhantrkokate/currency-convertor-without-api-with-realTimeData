// Tnis is the main file through this user can execute the programs.

// For running this import and in same folder which this file is presend open cmd.

// Run these two commands: 
// 1: javac -cp ".;jsoup-1.19.1.jar" RunThis.java
// 2: java -cp ".;jsoup-1.19.1.jar" RunThis

// functions List:

// convertCurrency() - it returns a double type value as an response (work in runtime)

// convertCurrency(Currency Code Of Currency Want To Convert, Currency Code of Currency in which you want to convert) -
// ^ works in compile time

// convertCurrencyWithFormatting() - In runtime but shows an output on console

// convertCurrencyWithFormatting(urrency Code Of Currency Want To Convert, Currency Code of Currency in which you want to convert) - 
// ^ work in compile time

public class RunThis{

    public static void main(String[] args) {

        // Make object of this
        CurrecncyConvertor object = new CurrecncyConvertor();
        object.convertCurrencyWithFormatting();
        
    }

}
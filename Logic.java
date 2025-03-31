// This will contain the functions and logic of the project

import java.util.*;

// input
class InputHandlers{

    // Array of currency codes which is used forvalidating inputed code
    String currencyCode[] = {"AED", "AFN", "ALL", "AMD", "ANG", "AOA", "ARS", "AUD", "AWG", "AZN","BAM", "BBD", "BDT", "BGN", "BHD", "BIF", "BMD", "BND", "BOB", "BRL","BSD", "BTN", "BWP", "BYN", "BZD", "CAD", "CDF", "CHF", "CLP", "CNY","COP", "CRC", "CUP", "CVE", "CZK", "DJF", "DKK", "DOP", "DZD", "EGP","ERN", "ETB", "EUR", "FJD", "FKP", "FOK", "GBP", "GEL", "GGP", "GHS","GIP", "GMD", "GNF", "GTQ", "GYD", "HKD", "HNL", "HRK", "HTG", "HUF","IDR", "ILS", "IMP", "INR", "IQD", "IRR", "ISK", "JEP", "JMD", "JOD","JPY", "KES", "KGS", "KHR", "KID", "KMF", "KRW", "KWD", "KYD", "KZT","LAK", "LBP", "LKR", "LRD", "LSL", "LYD", "MAD", "MDL", "MGA", "MKD", "MMK", "MNT", "MOP", "MRU", "MUR", "MVR", "MWK", "MXN", "MYR", "MZN", "NAD", "NGN", "NIO", "NOK", "NPR", "NZD", "OMR", "PAB", "PEN", "PGK","PHP", "PKR", "PLN", "PYG", "QAR", "RON", "RSD", "RUB", "RWF", "SAR","SBD", "SCR", "SDG", "SEK", "SGD", "SHP", "SLE", "SOS", "SRD", "SSP","STN", "SYP", "SZL", "THB", "TJS", "TMT", "TND", "TOP", "TRY", "TTD", "TVD", "TWD", "TZS", "UAH", "UGX", "USD", "UYU", "UZS", "VES", "VND","VUV", "WST", "XAF", "XCD", "XDR", "XOF", "XPF", "YER", "ZAR", "ZMW", "ZWL"};

    // take input
    // take till currency code is not correct
    String[] codeInputer(){
        
        // Scanner class object
        Scanner input = new Scanner(System.in);

        // pointer to validate or run a loop till inputs are not valid
        boolean check1 = false;
        boolean check2 = false;

        String res[] = new String[2];

        // run a loop
        while((!check1) || (!check2)){
            if(!check1){
                System.out.print("Enter the code of currency you want to convert: ");
                res[0] = input.next().toUpperCase();
                check1 = validate(res[0]) ? true : false;
                if(!check1){
                    System.out.println("Wrong Input! Please enter correct currency code.\n");
                }
            }
            if(!check2){
                System.out.print("Enter now code of currency in which you want to convert: ");
                res[1] = input.next().toUpperCase();
                check2 = validate(res[1]) ? true : false;
                if(!check2){
                    System.out.println("Wrong Input! Please enter correct currency code.\n");
                }
            }
        }

        return res;
    }

    // function to validate currency codes
    boolean validate(String code){
        for(int i = 0; i<currencyCode.length; i++){
            if(code.equals(currencyCode[i])){
                return true;
            }
        }
        return false;
    }
 
}

public class RealJsoup extends InputHandlers{
    
}

public class Logic extends RealJsoup{

public static void main(String[] args){
    Logic obj = new Logic();
    String arr[] = obj.codeInputer();
    System.out.print(arr[0] + " " + arr[1]);
}

}
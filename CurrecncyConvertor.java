// This will contain the functions and logic of the project

import java.util.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

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
            while(!check1){
                System.out.print("Enter the code of currency you want to convert: ");
                res[0] = input.next().toUpperCase();
                check1 = validate(res[0]) ? true : false;
                if(!check1){
                    System.out.println("Wrong Input! Please enter correct currency code.\n");
                }
            }
            while(!check2){
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

class RealJsoup extends InputHandlers{


    // formatting url
    String formatURL(String code1, String code2){
        String url = "https://www.xe.com/currencyconverter/convert/?Amount=1&From=" + code1 + "&To=" + code2;
        return url;
    }


    // strint to double convertor
    double convertFromString(String text){
        String newNum = "";
        for(int i = 0; i<text.length(); i++){
            if(text.charAt(i)=='.' || text.charAt(i)>='0' && text.charAt(i)<='9'){
                newNum += text.charAt(i);
            }
        }
        double converted = Double.parseDouble(newNum);
        return converted;
    }


    // to convert the one currency with another
    double currencyCovertor(String convertFrom, String convertIn){

        try{

            // url former
            String url = formatURL(convertFrom,convertIn);

            // to get access of page (url) to connect and get
            Document doc = Jsoup.connect(url).get();

            Elements elementFounded = doc.select(".sc-294d8168-1");
            String response = "";

            if (elementFounded != null) {
                response = elementFounded.text();
            } else {
                System.out.println("No element found");
            }

            return convertFromString(response);
        }catch(Exception e){
            System.out.print(e);
        }

        return 0.0;

    }

}

public class CurrecncyConvertor extends RealJsoup{

    // function: for runtime input
    double convertCurrency(){
        String inputs[] = codeInputer();
        return currencyCovertor(input[0],input[1]);
    }


    // function: for compile time input
    double convertCurrency(String convertFrom, String convertTo){
        if(!validate(convertFrom)){
            System.out.println("InputExceptionOccured: Wrong Currency Code Inputed!");
            return 0.0;
        }
        if(!validate(convertTo)){
            System.out.println("InputExceptionOccured: Wrong Currency Code Inputed!");
            return 0.0;
        }
        return currencyCovertor(convertFrom,convertTo);
    }


    // print with runtime inputs
    void convertCurrencyWithFormatting(){
        double val = convertCurrency();
        System.out.println("After conversion the conversion amount you will get for 1 coin or note is : " + val);
    }

    // print with compile time inputs
    void convertCurrencyWithFormatting(String convertFrom, String convertTo){
        double val = convertCurrency(convertFrom, convertTo);
        System.out.println("After conversion the conversion amount you will get for 1 coin or note is : " + val);
    }

}
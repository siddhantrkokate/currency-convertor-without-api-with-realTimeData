# Currency Converter

## Overview
This Java-based currency converter allows users to convert one currency to another using real-time exchange rates. It uses `Jsoup` for web scraping to fetch current exchange rates from online sources.

## Features
- Convert currency in real-time (`convertCurrency()`).
- Compile-time conversion with specified currency codes (`convertCurrency(fromCurrency, toCurrency)`).
- Formatted output conversion in runtime (`convertCurrencyWithFormatting()`).
- Compile-time formatted output conversion (`convertCurrencyWithFormatting(fromCurrency, toCurrency)`).
- Supports all government-approved currencies worldwide.

## Requirements
- Java Development Kit (JDK) installed.
- `Jsoup` library (Version: 1.19.1) placed in the same directory as the Java files.

## Setup Guide
### Step 1: Download `Jsoup`
1. Download `jsoup-1.19.1.jar` from the official site: [https://jsoup.org/download](https://jsoup.org/download)
2. Place `jsoup-1.19.1.jar` in the same directory as `RunThis.java`.

### Step 2: Compile the Java Program
Open Command Prompt (CMD) and navigate to the project directory where `RunThis.java` is located. Run the following command:

`javac -cp ".;jsoup-1.19.1.jar" RunThis.java`

### Step 3: Run the Program
After compilation, execute the following command to run the program:

`java -cp ".;jsoup-1.19.1.jar" RunThis.`

### 4. The conversion result is displayed on the console.

## Example Usage
`Enter the currency code you want to convert from: USD
Enter the currency code you want to convert to: INR
Current exchange rate: 1 USD = 85.1 INR`

## Notes
- Ensure you have an active internet connection to fetch exchange rates.
- Currency rates are scraped in real-time and may vary.
- If you encounter an error, check that `jsoup-1.19.1.jar` is correctly placed in the same directory.
- Make sure you are using a supported currency code; otherwise, the program will return an error.
- Running the program in an IDE? Add `jsoup-1.19.1.jar` to the classpath in your IDE settings.

## License
This project is open-source and available for educational and personal use only.  
Feel free to modify and distribute it, but please give proper credit.  
Commercial use is not permitted without permission.



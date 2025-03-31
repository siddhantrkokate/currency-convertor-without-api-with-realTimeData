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

```sh
javac -cp ".;jsoup-1.19.1.jar" RunThis.java```

### Step 3: Run the Program
After compilation, execute the following command to run the program:

```sh
java -cp ".;jsoup-1.19.1.jar" RunThis.```

Step 3: Run the Program

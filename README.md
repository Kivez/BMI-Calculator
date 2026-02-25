# BMI-Calculator

A Java program that calculates BMI based on height (meters) and weight (kilograms), determining the specific weight adjustment needed to reach a normal BMI range.

##  Features
* **Input Validation:** Uses `scanner.hasNextDouble()` to prevent program crashes if the user enters non-numeric data.
* **Personalized Targets:** Calculates exactly how many kilograms a user needs to gain or lose based on their height.
* **Detailed Status Mapping:** Categorizes results into six levels, from "Extremely Underweight" to "Extremely Obese."
* **Precision Output:** Formats results to two decimal places for accuracy.

##  How it Works
The program follows the standard BMI calculation:
$BMI = weight / height^2$

It then calculates the "Normal" weight thresholds for your specific height:
* **Lower Threshold:** 18.5 * height^2
* **Upper Threshold:** 25.0 * height^2

##  Example Output
```text
Please enter your height in meters : 1.75
Please enter your weight in kilograms : 85
Your BMI is 27.76
You are overweight, you need to lose 8.44 kgs

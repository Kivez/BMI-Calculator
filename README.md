# BMI-Calculator

A Java-based utility that calculates a user's **Body Mass Index (BMI)** and provides specific feedback on the weight adjustment needed to reach a healthy range.

## 🚀 Features
* **Input Validation:** Uses `scanner.hasNextDouble()` to prevent program crashes if the user enters non-numeric data.
* **Personalized Targets:** Calculates exactly how many kilograms a user needs to gain or lose based on their height.
* **Detailed Status Mapping:** Categorizes results into six levels, from "Extremely Underweight" to "Extremely Obese."
* **Precision Output:** Formats results to two decimal places for accuracy.

## 🛠️ How it Works
The program follows the standard BMI calculation:
$BMI = weight / height^2$

It then calculates the "Normal" weight thresholds for your specific height:
* **Lower Threshold:** 18.5 * height^2
* **Upper Threshold:** 25.0 * height^2

## 📖 Example Output
Please enter your height in m : 1.75
Please enter your weight in kg : 85
Your BMI is 27.76
You are overweight, you need to lose 8.44 kgs

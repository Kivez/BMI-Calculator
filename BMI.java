import java.util.Scanner;
public class BMI {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            double height, weight;
            System.out.print("Please enter your height in meters : ");
            if (scanner.hasNextDouble()) {
                height = scanner.nextDouble();
            } else {
                System.out.println("Invalid. Please enter your height (number)");
                return;
            }

            System.out.print("Please enter your weight in kilograms : ");
            if (scanner.hasNextDouble()) {
                weight = scanner.nextDouble();
            } else {
                System.out.println("Invalid. Please enter your weight (number)");
                return;
            }
            
            double bmi = weight/Math.pow(height, 2);
            double lowNormal = 18.5 * Math.pow(height, 2);
            double highNormal = 25 * Math.pow(height, 2);
            double lose_Gain;
            String status = "";
            if (bmi < 15) {
                status = "You are extremely underweight, you need to gain ";
                lose_Gain = lowNormal - weight;
            } else if (bmi >= 15 && bmi < 18.5) {
                status = "You are underweight, you need to gain ";
                lose_Gain = lowNormal - weight;
            } else if (bmi >= 18.5 && bmi <= 25) {
                status = "Your weight is normal";
                System.out.printf("Your BMI is %.2f\n", bmi);
                System.out.println("Your weight is normal");
                return;
            } else if (bmi > 25 && bmi <= 30) {
                status = "You are overweight, you need to lose ";
                lose_Gain = weight - highNormal;
            } else if (bmi > 30 && bmi <= 35) {
                status = "You are obese, you need to lose ";
                lose_Gain = weight - highNormal;
            } else {
                status = "You are extremely obese, you need to lose ";
                lose_Gain = weight - highNormal;
            }
            System.out.printf("Your BMI is %.2f\n", bmi);
            System.out.printf(status + "%.2f kgs", lose_Gain);
        }   
    }
}

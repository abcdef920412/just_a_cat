package ntou.cs.java2023;
import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args){
        int BMI,weight,height;
        String state="c";
        Scanner input =new Scanner(System.in);
        System.out.printf("welcome to the BMI (Body Mass Index) calculator%n");
        System.out.printf("Please enter your weight (kilogram): ");
        weight=input.nextDouble();
        System.out.printf("Please enter your height (centimeters): ");
        height=input.nextDouble();
        height=height/100;
        BMI=weight/(height*height);
        if(BMI<18.5){
           state="Underweight";
        }else if(BMI>=18.5&&BMI<24.9){
            state="Normal";
        }else if(BMI>=25&&BMI<=29.9){
            state="Overweight";
        }else if(BMI>=30){
            state="Obese";
        }
         System.out.printf("Your BMI is %.1f ",BMI);
         System.out.printf("(%s)%n",state);
    }
}
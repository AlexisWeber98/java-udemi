import java.util.Scanner;

public class HealthAndFitnessChallenge {

public static void main(String[] args ) {
 
    
    Scanner console = new Scanner(System.in);
    System.out.println(" ------------------------ Health and Fitness Challenge ------------------------");
    final var DAILY_PASS = 10000;
    final double CALORIES_BURNED_PER_STEP = 0.04;

    // la meta alcanzada se cumple si la cantidad de pasos dados >= los pasos diarios

    System.out.println(" --------- Welcome to the Health and Fitness Challenge!, What is your name ? ---------");

    String name = console.nextLine();

    System.out.println(" --------- Hi " + name + "! Let's see if you can reach your daily step goal of " + DAILY_PASS + " steps! ---------");

    System.out.println(" --------- How many steps have you taken today? ---------");

    int stepsTaken = console.nextInt();

    console.close();

    String result = (stepsTaken >= DAILY_PASS) ? "Congratulations! You've reached your daily step goal!" : "Keep going! You're on your way to reaching your daily step goal.";

    System.out.println(result);

    System.out.println(" --------- You have burned approximately " + (stepsTaken * CALORIES_BURNED_PER_STEP) + " calories today! ---------");


  }
}

import java.util.Scanner;

public class MainClass {
public static void main(String[] args) {
        String str = "unknown";

        System.out.println("This is a just a joke and not meant to be taken seriously. Don't listen to what some random program has to say!");

        Scanner scan = new Scanner(System.in);
        System.out.println("How many pounds do you weigh?");
        int weight = scan.nextInt();
        System.out.println("You are " + weight + " pounds");
        if (weight >= 300) {
            System.out.println("You are obese!");
            str = "Obese";
        }
        else if (weight <= 100) {
        System.out.println("You are skinny!");
        str = "Skinny";

        } else { 
            System.out.println("You are around average!");
            str = "Average";
            System.out.println("So you are " + weight + " pounds and you are " + str);
    }
    scan.close();
  }
}
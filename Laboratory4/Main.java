package Laboratory4;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner InCMD = new Scanner(System.in);
        System.out.println("\t\tLaboratory work №4");
        int answer,task;
        boolean work = true,exit = true, suit;
        do {
            do{
                System.out.print("Enter the task number(1-7): ");
                while (!InCMD.hasNextInt()) {
                    System.out.println("Invalid input");
                    InCMD.next();
                    System.out.print("Enter the task number(1-7): ");
                }
                task = InCMD.nextInt();
                switch (task) {
                    case 1 -> {
                        Tasks.one();
                        suit = false;
                    }
                    case 2 -> {
                        Tasks.two();
                        suit = false;
                    }
                    case 3 -> {
                        Tasks.three();
                        suit = false;
                    }
                    case 4 -> {
                        Tasks.four();
                        suit = false;
                    }
                    case 5 -> {
                        Tasks.five();
                        suit = false;
                    }
                    case 6 -> {
                        Tasks.six();
                        suit = false;
                    }
                    case 7 -> {
                        Tasks.seven();
                        suit = false;
                    }


                    default -> {
                        System.out.println("Please enter only 1 - 7!");
                        suit = true;
                    }
                }
            }while (suit);
            do{
                System.out.print("Do we continue? 0 - no, 1 - yes: ");
                while (!InCMD.hasNextInt()) {
                    System.out.println("Please enter only 0 or 1!");
                    InCMD.next();
                    System.out.print("Do we continue? 0 - no, 1 - yes: ");
                }
                answer = InCMD.nextInt();
                if (answer == 0) {
                    exit = false;
                    work = false;
                    System.out.print("Goodbye!");
                }else if (answer == 1)
                    exit = false;
                else System.out.println("Please enter only 0 or 1!");

            }while(exit);
        }while(work);
        InCMD.close();
    }
}

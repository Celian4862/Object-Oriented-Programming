import java.util.InputMismatchException;
import java.util.Scanner;

public class MyFirstProject {
    public static void main(String[] args) {
        MyTime t = new MyTime();
        Scanner input = new Scanner(System.in);
        boolean not_end = true;
        do {
            try {
                System.out.print("\nWhat would you like to do?\n 1. Display time\n 2. Set time\n 3. Advance time by seconds\n 4. Tick by seconds\n 5. Tick by minutes\n 6. Tick by hours\n 7. End\nEnter here: ");
                int choice = input.nextInt();
                
                switch (choice) {
                    case 1:
                        System.out.println("\n" + t);
                        break;
                    case 2:
                        System.out.print("Enter how many hours: ");
                        int time = input.nextInt();
                        t.setHours(time);
                        System.out.print("Enter how many minutes: ");
                        time = input.nextInt();
                        t.setMinutes(time);
                        System.out.print("Enter how many seconds: ");
                        time = input.nextInt();
                        t.setSeconds(time);
                        break;
                    case 3:
                        System.out.print("Enter by how many seconds to advance the time: ");
                        int seconds = input.nextInt();
                        t.advanceTime(seconds);
                        break;
                    case 4:
                        t.tickBySecond();
                        break;
                    case 5:
                        t.tickByMinute();
                        break;
                    case 6:
                        t.tickByHours();
                        break;
                    case 7:
                        not_end = false;
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("\nInvalid input.");
                input.next();
            }
        } while (not_end);
        input.close();
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        StepTracker stepTracker = new StepTracker();

        Scanner scanner = new Scanner(System.in);
        Menu.printMenu();
        int userInput = scanner.nextInt();

        while (userInput != 0) {
            // обаботка разных случаев
            if (userInput == 1) {
                System.out.println("введите месяц (1-12)");
                int month = scanner.nextInt();
                System.out.println("введите день (1-30)");
                int day = scanner.nextInt();
                System.out.println("введите количество шагов");
                int steps = scanner.nextInt();
                stepTracker.addSteps(month, day, steps);

            } else if (userInput == 2) {
                Menu.printSubMenu2();
                int userInputSubMenu2 = scanner.nextInt();
                if (userInputSubMenu2 == 1) {
                    System.out.println("введите месяц (1-12)");
                    int month = scanner.nextInt();
                    stepTracker.showStepsPerMonth(month);
                } else if (userInputSubMenu2 == 2) {
                    stepTracker.showAllStepsInMonth();
                }
            } else if (userInput == 3) {
                System.out.println(stepTracker.showAll());
            }
            Menu.printMenu(); // печатем меню ещё раз перед завершением предыдущего действия
            userInput = scanner.nextInt(); // повторное считывание данных от пользователя
        }
        System.out.println("Программа завершена");
    }
}
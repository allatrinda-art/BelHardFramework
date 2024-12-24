import java.util.Scanner;

public class Hw2 {
       public static void main(String[] args) {
        /*Task 1*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your score");
        int score = scanner.nextInt();
        scanner.nextLine();
          while (true) {
            if (score >= 90 && score <= 100) {
                System.out.println("Your grade is A!");
                break;
            } else if (score >= 80 && score <= 100) {
                System.out.println("Your grade is B!");
                break;
            } else if (score >= 70 && score <= 100) {
                System.out.println("Your grade is C!");
                break;
            } else if (score >= 60 && score <= 100) {
                System.out.println("Your grade is D!");
                break;
            } else if (score >= 50 && score <= 100) {
                System.out.println("Your grade is E!");
                break;
            } else if (score > 0 && score < 50) {
                System.out.println("Your grade is F!");
                break;
            } else {
                System.out.println("You've entered incorrect score. Repeat please again");
                System.out.println("Please, enter your score");
                score = scanner.nextInt();
            }
          }

        /*Task 2*/
        String userInput = "";
        System.out.println("This is task #2.");
        while (true) {
            System.out.println("Please enter something: ");
            userInput = scanner.nextLine();
           if (userInput.equals("Exit")){
               System.out.println("You've entered: " + userInput);
               break;
           }
        }

        /*Task 3*/
           System.out.println("This is task #3. Please enter a number: ");
           int x = scanner.nextInt();
           int sum = 0;
           if (x >= 0) {
               // Если число + или 0, считаем сумму от 0 до x
               for (int i = 0; i <= x; i++) {
                   sum += i;
               }
           } else {
               // Если число -, считаем сумму от x до 0
               for (int i = x; i <= 0; i++) {
                   sum += i;
               }
           }
           System.out.printf("The sum of all numbers from %d to 0 is %d%n", x, sum);

        /*Task 4*/
        System.out.println("This is task #4.");
        String[] channels = {"1й", "2й", "Inter", "MusicTv", "FashionTV", "СпасТВ", "БрестТВ", "ПинскТВ", "ШансонТВ"};
           while (true) {
               System.out.print("Введите номер канала (0 для выхода): ");
               int channelNumber = scanner.nextInt();
               if (channelNumber == 0) {
                   break;
               } else if (channelNumber > 0 && channelNumber <= channels.length) {
                   System.out.println("Вы выбрали: " + channels[channelNumber - 1]);
               } else {
                   System.out.println("Такого канала не существует. Попробуйте снова.");
               }
           }
           System.out.println("До свидания!");
       }
}

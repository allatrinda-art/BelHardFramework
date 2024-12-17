import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Task 1
        String name = "Alla";
        String surname = "Trinda";
        String profession = "QA Engineer";
        String myInfo = String.format("My name and surname are %s %s. My profession is %s", name, surname, profession);
        System.out.println(myInfo);

        //Task 2
        boolean bool = true;
        char ch = 'A';
        byte b = -128;
        short s = 32;
        int i = 10;
        long l = 3200L;
        float f = 12.34f;
        double d = 11.99;
        String string = "My new string";
        String allVar = String.format("Here is all variables with their values that I remember: boolean - %s, char - %c, byte - %d, short - %d, int - %d, long - %d, %float - f, double - %f, String - %s.", bool, ch, b, s, i, l, f, d, string);
        System.out.println(allVar);

        /*StringBuffer*/
        StringBuffer changableName = new StringBuffer(name);
        changableName.append("Maria");
        changableName.append("Prekrasnaya");
        System.out.println("Now my name is: " + changableName);

        //!!!Task 3!!!
        System.out.print("Please enter your greeting: ");
        Scanner sc = new Scanner(System.in);
        String greeting = sc.nextLine();
        System.out.println("Welcome aboard: " + greeting);

        /*lenth method*/
        System.out.println(greeting.length());

        /*charAt method*/
        System.out.println(greeting.charAt(3));

        /*isEmpty method*/
        System.out.println(greeting.isEmpty()); //is always false because of Scanner method above

        /*equals method*/
        System.out.print("Type here your presentation: ");
        String presentation = sc.nextLine();
        System.out.println("Your presentaion is: " + presentation);
        boolean wordsAreEqual = greeting.equals(presentation);
        System.out.println("So, your greeting and presentation are equal? - " + wordsAreEqual);

        /*equalsIgnoreCase method*/
        boolean wordsAreEqualCaseSensitive = greeting.equalsIgnoreCase(presentation);
        System.out.println("Are they equal case sensitive? - " + wordsAreEqualCaseSensitive);

        /*startWith, endsWith, contains methods*/
        boolean startsWithHello = greeting.startsWith("Hello");
        boolean endsWithAnna = greeting.endsWith("Anna");
        boolean containsName = greeting.contains("name");
        String containMethods = String.format("Did you say Hello? - %s. Your name is Anna? - %s. Did you mention your name? - %s", startsWithHello, endsWithAnna, containsName);
        System.out.println(containMethods);

        /*replace method*/
        String updatedGreeting = greeting.replace('H', 'h');
        String updatedName = greeting.replace("Anna", "Zoya");
        String newGreeting = String.format("My new greeting is: %s. And with my real name: %s", updatedGreeting, updatedName);
        System.out.println(newGreeting);

        /*ToLowerCase method*/
        String lowerCaseGreeting = updatedGreeting.toLowerCase();
        System.out.println("The greeting with lowercase: " + lowerCaseGreeting);
    }
}
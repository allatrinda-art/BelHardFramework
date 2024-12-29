public class Sailboat {
    // Поля класса
    private double length; // Длина в футах
    private String type; // Тип лодки
    private int numberOfMatches; // Количество матчей
    private int numberOfRudderFeathers; // Количество перьев руля
    private int numberOfSails; // Количество парусов
    private String countryOfOrigin; // Страна происхождения
    private String environment; // Морская/речная/океаническая
    // Конструктор для инициализации полей
    public Sailboat(double length, String type, int numberOfMatches, int numberOfRudderFeathers, int numberOfSails, String countryOfOrigin, String environment) {
        this.length = length;
        this.type = type;
        this.numberOfMatches = numberOfMatches;
        this.numberOfRudderFeathers = numberOfRudderFeathers;
        this.numberOfSails = numberOfSails;
        this.countryOfOrigin = countryOfOrigin;
        this.environment = environment;
    }
   // Метод для вывода информации о лодке
    public void displayInfo() {
        System.out.println("Сведения о парусной лодке:");
        System.out.println("Длина: " + length + " футов");
        System.out.println("Тип: " + type);
        System.out.println("Количество матчей: " + numberOfMatches);
        System.out.println("Количество перьев руля: " + numberOfRudderFeathers);
        System.out.println("Количество парусов: " + numberOfSails);
        System.out.println("Страна происхождения: " + countryOfOrigin);
        System.out.println("Тип водоемов: " + environment);
    }
}
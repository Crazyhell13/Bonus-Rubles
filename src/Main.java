public class Main {
    public static void main(String[] args) {
        int initialBalance = 100;
        int income = 8000;
        int bonus;
        if (income > 1000) {
            bonus = income / 100;
        } else {
            bonus = 0;
        }
        int newBalance = initialBalance + income + bonus;
        System.out.println("Баланс: " + newBalance);
        System.out.println("Из них бонусов: " + bonus);
    }
}
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int account = 110;
        int check = 200;

        int bonus;
        if (account > 1000) {
            bonus = check / 100;
        } else {
            bonus = 0;
        }

        int total = account + check + bonus;

        System.out.println("Заработано бонусов = " + bonus);
        System.out.println("Всего на счету = " + total);
    }
}
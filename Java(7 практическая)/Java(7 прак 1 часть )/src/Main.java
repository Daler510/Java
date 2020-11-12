import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String text = "Вася заработал 55000 рублей, Петя - 7563 рубля, а Маша - 3000 рублей";

        StringBuilder result;


        result = new StringBuilder();
        StringBuilder result1 = new StringBuilder();


        for (int i = 0;i < text.indexOf(","); i++) {
            if (text.charAt(i) >= '0' && text.charAt(i) < '9') {
                result.append(text.charAt(i));
            }
        }

        int sum = Integer.parseInt(String.valueOf(result));


        for (int i = text.indexOf("Маша");i < text.length(); i++) {
            if (text.charAt(i) >= '0' && text.charAt(i) < '9') {
                result1.append(text.charAt(i));
            }
        }

        sum += Integer.parseInt(String.valueOf(result1));
        System.out.println("Сумма" + sum);
        System.out.println("/////////////////////////");

        System.out.println("Введите ФИО: ");
        String fio;
        StringBuilder name = new StringBuilder("Имя: ");
        StringBuilder surname = new StringBuilder("Фамилия: ");
        StringBuilder otchestvo = new StringBuilder("Отчество: ");

        Scanner scanner = new Scanner(System.in);

        fio = scanner.nextLine();
        fio = fio.trim() + " ";
        int count = 0;
        if (fio.length() > 1) {

            for (int i = 0; i < fio.indexOf(" "); i++, count++) {
                if ((fio.charAt(i) >= 'a' && fio.charAt(i) <= 'z') || (fio.charAt(i) >= 'A' && fio.charAt(i) <= 'Z')
                || ((fio.charAt(i) >= 'а' && fio.charAt(i) <= 'я') || (fio.charAt(i) >= 'А' && fio.charAt(i) <= 'Я')
                        || (fio.charAt(i) == 'ё'))) {
                    surname.append(fio.charAt(i));
                } else {
                    System.out.println("Неправильная фамилия");
                    return;
                }
            }


            if (!(fio.indexOf(" ") == fio.length() - 1)) {
                for (int i = count + 1; i < fio.indexOf(" ", count + 1); i++, count++) {
                    if ((fio.charAt(i) >= 'a' && fio.charAt(i) <= 'z') || (fio.charAt(i) >= 'A' && fio.charAt(i) <= 'Z')
                            || ((fio.charAt(i) >= 'а' && fio.charAt(i) <= 'я') || (fio.charAt(i) >= 'А' && fio.charAt(i) <= 'Я')
                            || (fio.charAt(i) == 'ё'))) {
                        name.append(fio.charAt(i));
                    } else {
                        System.out.println("Неправильное имя");
                        return;
                    }
                }

            } else {
                System.out.println("Вы не ввели имя");
                return;
            }

            fio = fio.trim();
            if (!(count == fio.length() - 1)) {
                for (int i = count + 2; i < fio.length(); i++, count++) {
                    if ((fio.charAt(i) >= 'a' && fio.charAt(i) <= 'z') || (fio.charAt(i) >= 'A' && fio.charAt(i) <= 'Z')
                            || ((fio.charAt(i) >= 'а' && fio.charAt(i) <= 'я') || (fio.charAt(i) >= 'А' && fio.charAt(i) <= 'Я')
                            || (fio.charAt(i) == 'ё'))) {
                        otchestvo.append(fio.charAt(i));
                    } else if (fio.charAt(i) == ' ') {
                        System.out.println("Неверный ввод");
                        return;
                    } else {
                        System.out.println("Неправильное Отчество");
                        return;
                    }
                }

            }

            if (count + 2 == fio.length()) {
                System.out.println(surname);
                System.out.println(name);
                System.out.println(otchestvo);
            } else
            {
                System.out.println("Неверный ввод");
            }
        }










    }
}

import java.util.*;

public class Main {

   private static List<Integer> nums = new ArrayList<>(List.of(8,1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
   private static List<String> words = new ArrayList<>(List.of("раз", "дрова", "два", "дрова",
                                                                "три ", "дрова", "раз", "дрова",  "два","дрова"));
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() {
        System.out.println("Напишите код, с помощью которого можно" +
                           "напечатать только нечётные числа в консоль.");
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

    public static void task2() {
        System.out.println("Напишите код, с помощью которого можно напечатаать только нечётные" +
                           " числа без повторений в порядке возрастания.");
        for (int num : new TreeSet<Integer>(nums)) {
            if (num % 2 == 0) {
                System.out.println(num + " ");
            }
        }


    }

    public static void task3() {
        System.out.println("Напишите код, который выводит в консоль все уникальные слова из спика " +
                           "слов, в котором могут встречаться дубли");
        Set<String> uniqueWords = new HashSet<>(words);
        for (String uniqueWord : uniqueWords) {
            System.out.println(uniqueWord);
        }
    }

    public static void task4() {
        System.out.println("Напишите код, который выводит в консоль количество дублей из списка слов.");
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(words.size() - uniqueWords.size());
    }
}
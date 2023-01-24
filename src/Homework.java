public class Homework {

    public static int[] generateRandomArray() {

        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = random.nextInt(100_000) + 100_000;

        }

        return arr;

    }

    public static void main(String[] args) {

        task1();

    }

    private static void task1() {

        System.out.println("Задача 1");

        int [] array = generateRandomArray();
        int total = 0;

        for (int index: array) {

            total = total + index;

        }

        System.out.println("Сумма трат за месяц составила " + total + " рублей");

    }

}

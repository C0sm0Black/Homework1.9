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
        task2();

    }

    private static void task2() {

        System.out.println("Задача 2");

        int[] array = generateRandomArray();
        int max = array[0];
        int min = array[0];

        for (int index : array) {

            if (max < index) {
                max = index;
            }

            if (min > index) {
                min = index;
            }

        }

        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день" + " составила " + max + " рублей");

    }

    private static void task1() {

        System.out.println("Задача 1");

        int[] array = generateRandomArray();
        int total = 0;

        for (int index : array) {

            total = total + index;

        }

        System.out.println("Сумма трат за месяц составила " + total + " рублей");

    }

}

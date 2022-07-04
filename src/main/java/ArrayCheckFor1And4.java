import java.util.Arrays;
import java.util.Random;

public class ArrayCheckFor1And4 {

    public static void main(String[] args) {
        int[] array = arrayInitialization();
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Array check result: " + arrayCheck(array));
    }

    private static int[] arrayInitialization() {
        int[] array = new int[(int) (Math.random() * 10)];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            while (true) {
                int number = random.nextInt(5);
                if (number == 1 || number == 4) {
                    array[i] = number;
                    break;
                }
            }
        }
        return array;
    }

    protected static boolean arrayCheck(int[] array) {
        if (Arrays.stream(array).anyMatch(value -> value == 4)) {
            return Arrays.stream(array).anyMatch(value -> value == 1);
        } else {
            return false;
        }
    }
}

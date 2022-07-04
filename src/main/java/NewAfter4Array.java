import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NewAfter4Array {
    public static void main(String[] args) {
       int [] startArray = arrayInitialization();
        System.out.println("Start array: " + Arrays.toString(startArray));
        System.out.println("Result array: " + Arrays.toString(formNewArray(startArray)));
    }

    private static int[] arrayInitialization(){
        int[] array = new int[(int) (Math.random() * 100)];
        for (int i= 0; i <array.length; i++) {
            int value = ((int) (Math.random() * 10));
            array[i] = value;
        }
        return array;
    }

    public static int[] formNewArray(int[] array){
        if (Arrays.stream(array)
                .anyMatch(number -> number == 4)) {
            ArrayList<Integer> reversedArray = new ArrayList<>(Arrays.stream(array)
                    .boxed()
                    .toList());
            Collections.reverse(reversedArray);
            List<Integer> newList = reversedArray.stream()
                    .takeWhile(number -> (number != 4))
                    .toList();
            ArrayList<Integer> newArray = new ArrayList<>(newList);
            Collections.reverse(newArray);
            return newArray.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
        } else {
            throw new RuntimeException("Array doesn't contain 4");
        }
    }
}

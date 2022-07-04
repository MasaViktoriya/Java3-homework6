import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestNewAfter4Array {

    @ParameterizedTest
    @MethodSource("dataForTest")
    public void testFormNewArray(int[] testArray, int[] resultArray) {
        Assertions.assertArrayEquals(resultArray, NewAfter4Array.formNewArray(testArray));
    }

    public static Stream<Arguments> dataForTest() {
        List<Arguments> out = new ArrayList<>();
        out.add(Arguments.arguments(new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7}, new int[]{1, 7}));
        out.add(Arguments.arguments(new int[]{4, 5, 3, 1, 1, 1, 4, 9, 5, 7, 2}, new int[]{9, 5, 7, 2}));
        out.add(Arguments.arguments(new int[]{1, 4, 4, 1, 4}, new int[]{}));
        out.add(Arguments.arguments(new int[]{4, 9, 0, 3, 5, 1, 2, 8, 0}, new int[]{9, 0, 3, 5, 1, 2, 8, 0}));
        return out.stream();
    }
}

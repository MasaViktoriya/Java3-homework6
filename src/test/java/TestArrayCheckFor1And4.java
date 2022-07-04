import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestArrayCheckFor1And4 {

    @ParameterizedTest
    @MethodSource("dataForTest")

    public void testArrayCheckFor1And4(int[] falseArray, int[]trueArray){
        Assertions.assertFalse(ArrayCheckFor1And4.arrayCheck(falseArray));
        Assertions.assertTrue(ArrayCheckFor1And4.arrayCheck(trueArray));
    }

    public static Stream<Arguments> dataForTest(){
        List<Arguments> out = new ArrayList<>();
        out.add(Arguments.arguments(new int[] {1,1,1,1,1,1}, new int[]{1,4,1,4,1,4,1,4,1,4}));
        out.add(Arguments.arguments(new int[]{4,4,4}, new int[]{4,4,1}));
        out.add(Arguments.arguments(new int[]{1}, new int[]{1,1,1,1,1,1,1,1,4}));
        out.add(Arguments.arguments(new int[]{4}, new int[]{4,4,4,4,4,4,4,4,1}));
        out.add(Arguments.arguments(new int[]{}, new int[]{1,4}));
        return out.stream();
    }
}

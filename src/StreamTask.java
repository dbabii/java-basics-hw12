import java.util.Arrays;
import java.util.Comparator;

public class StreamTask {

    public static int getSumSquareEven(int[] numbers) {
        return Arrays.stream(numbers)
                .filter(x -> x % 2 == 0)
                .map(x -> x * x)
                .sum();
    }

    public static int[] getSortedOddsArray(int[] numbers) {
       return Arrays.stream(numbers)
                .filter(x -> x % 2 != 0)
                .sorted()
                .toArray();
//        return new int[]{};
    }
}

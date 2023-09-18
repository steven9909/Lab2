import java.util.List;

public class DataTypes {
    public static long sum(List<Integer> numbers) {

        Long s = 0L;
        // below is a "foreach" loop which iterates through numbers
        for (int i = 0; i <= 1_000_000-1; i++) {

            s += numbers.get(i);
        }
        return s;
    }
}

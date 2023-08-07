import java.util.stream.IntStream;

public class Stream2 {
    public static void main(String[] args) {
        int sums = IntStream.rangeClosed(1, 10)
                .filter(s -> s % 2 == 0)
                .map(s -> s * s)
                .sum();
        System.out.println(sums);
    }
}

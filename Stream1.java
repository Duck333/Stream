import java.util.ArrayList;
import java.util.List;

public class Stream1 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(20);
        for (int i = 0; i <= 50; i++) {
            nums.add(i);
        }
        nums
                .stream()
                .filter(integer -> !(integer % 2 == 0))
                .forEach(System.out::println);
    }
}

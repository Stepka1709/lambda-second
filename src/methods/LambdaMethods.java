package methods;

import java.util.List;
import java.util.stream.IntStream;

public class LambdaMethods {
    public static long countLowerCase(String line) {
        return line.chars().filter(Character::isLowerCase).count();
    }

    public static void threeLetter(List<String> l) {
        l.stream().filter(a -> (a.indexOf('a') == 0 || a.indexOf('a') == 0) && a.length() <= 3
                && countLowerCase(a) == a.length()).forEach(System.out::println);
    }

    public static void maxCountLetter(List<String> l) {
        int max = l.stream().flatMapToInt(a -> IntStream.of((int) countLowerCase(a))).max().orElse(0);
        l.stream().filter(a -> countLowerCase(a) == max).forEach(System.out::println);
    }
}

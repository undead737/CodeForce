package МишкаИСтаршийБрат;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Short> values = Stream.of(new Scanner(System.in).nextLine().split(" ")).map(Short::parseShort).collect(Collectors.toList());
        byte years = 0;
        do {
            values.set(0, (short) (values.get(0) * 3));
            values.set(1, (short) (values.get(1) * 2));
            years++;
        } while (values.get(0) <= values.get(1));
        System.out.println(years);
    }
}

package ВПоискахПростойЗадачи;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String col = scan.nextLine();
        System.out.println(Stream.of(scan.nextLine().split(" ")).map(Byte::parseByte).collect(Collectors.toList()).stream().anyMatch(x-> x == 1)? "HARD" : "EASY");
    }
}

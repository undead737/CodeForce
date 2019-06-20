package АнтонИМногогранники;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        List<String> values = new ArrayList<>();
        for (int i = 0; i < count; i++){
            values.add(sc.nextLine());
            //values.add(sc.nextLine());
        }
        System.out.printf("\n %s, %s, %s", values.get(0) , values.get(1), values.get(2));
    }
}

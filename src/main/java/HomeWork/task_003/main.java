package HomeWork.task_003;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class main {
    public static void main(String[] args) {
        String [] rawArr = {"1, 2, 0", "4, 5"};

        List <Integer> nums = Arrays.stream(rawArr)
                .flatMap(element -> Arrays.stream(element.split(", ")))
                .mapToInt(Integer::parseInt)
                .boxed()
                .sorted(Comparator.naturalOrder())
                .toList();

        String str = nums.toString();

        str = str.substring(1, str.length() - 1); // убрал из строки [ ]

        System.out.println(str);
    }
}
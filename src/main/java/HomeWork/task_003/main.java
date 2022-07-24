package HomeWork.task_003;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
        String [] rawArr = {"1, 2, 0", "4, 5"};

        String strNums = Arrays.stream(rawArr)
                .reduce("",(str, element) -> {
                    String [] arr = element.split(", ");
                    StringBuilder strBuilder = new StringBuilder(str);
                    for (String s : arr) {
                        strBuilder.append(s);
                    }
                    str = strBuilder.toString();
                    return str;
                });

        List <Integer> nums = Arrays.stream(strNums.split(""))
                .map(Integer::parseInt)
                .sorted(Comparator.naturalOrder())
                .toList();

        String str = nums.toString();

        str = str.substring(1, str.length() - 1); // убрал из строки [ ]

        System.out.println(str);
    }
}

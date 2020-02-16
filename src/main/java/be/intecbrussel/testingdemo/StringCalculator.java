package be.intecbrussel.testingdemo;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

    public static final String DELIMITER = ";"; // final so cannot be changed later, static so class level
    public static final String NEWLINE = "\n";
    private static int count = 0;

    public int add(String input) throws Exception {
        count++;
        int sum = 0;
        List<Integer> negativeNumbers = new ArrayList<>();

        if ("".equals(input) || input == null) { // if input string null or empty - return 0
            return 0;
        }

        // here string can contain both delimiter and newline // Example input - "1\n3\n4,5,6\n7"
        String[] delimiterSplitResult = input.split(DELIMITER);  // split input with delimiter -> 1\n3\n4 5 6\n7

        for (String fragment : delimiterSplitResult) { // for each fragment in 1\n3\n4 5 6\n7, split with newline
            String[] newLineSplitResult = fragment.split(NEWLINE);  // 1st fragment will give 1 3 4

            for (String subFragment : newLineSplitResult) { // for each sub fragment in split of newline
                int subFragmentNumber = Integer.parseInt(subFragment); //convert to int
                if (subFragmentNumber < 0) {
                    negativeNumbers.add(subFragmentNumber);
                }
                if (subFragmentNumber < 1000) {
                    sum += subFragmentNumber; // add to sum
                }
            }
        }

        if (negativeNumbers.size() > 0) {
            String exceptionMessage = "negatives not allowed " + negativeNumbers;
            System.out.println(exceptionMessage);
            throw new Exception(exceptionMessage);
        }

        return sum;
    }

    public int getCalledCount() {
        return count;
    }
}


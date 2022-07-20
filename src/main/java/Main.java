import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the series of numbers: ");
        String[] input = scanner.nextLine().split("\\s+");
        System.out.println(maxAbsoluteVal(input));
    }

    /**
     * Returns the largest absolute value in the array of numbers.
     *
     * @param numbers the input array of String integer numbers
     * @return the maximum integer absolute value in the array
     */
    public static int maxAbsoluteVal(String[] numbers) {
        List<String> numbersList = Arrays.asList(numbers);
        return numbersList.stream().mapToInt(strNum -> Integer.parseInt(strNum)).map(num -> Math.abs(num)).max().getAsInt();
    }
    
}

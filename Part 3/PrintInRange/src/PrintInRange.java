import java.util.ArrayList;

public class PrintInRange {
    public static void printNumbersInRange(ArrayList<Integer> numberList, int lowerLimit, int upperLimit) {
        for (int number: numberList) {
            if (number >= lowerLimit && number <= upperLimit) System.out.println(number);
        }
    }

    public static int sum(ArrayList<Integer> numberList) {
        // if empty return -1
        // could .isEmpty() instead
        if (numberList.size() == 0) return -1;

        int sum = 0;
        for (int number: numberList) {
            sum += number;
        }

        return sum;
    }

    static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();

        numberList.add(3);
        numberList.add(2);
        numberList.add(6);
        numberList.add(-1);
        numberList.add(5);
        numberList.add(1);

        System.out.println("The numbers in the range [0, 5]");
        printNumbersInRange(numberList, 0, 5);

        System.out.println("The numbers in the range [3, 10]");
        printNumbersInRange(numberList, 3, 10);

        System.out.print("Sum of list: ");
        System.out.println(sum(numberList));
    }
}

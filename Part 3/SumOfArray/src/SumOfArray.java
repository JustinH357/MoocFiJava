// Combined with print neatly and print array in stars exercise.

public class SumOfArray {
    public static int sumOfNumbersInArray(int[] array) {
        int sum = 0;
        for (int arr: array) sum += arr;
        return sum;
    }

    public static void printNeatly(int[] array) {
        for (int arr: array) {
            // store the last element index similar to ArrayList.size() - 1 that returns the last values in list
            int lastElement = array.length-1;

            // if the number in the array is the last element just print it no comma at the end
            // else every element before it gets a comma at the end
            if (arr == array[lastElement]) System.out.print(arr);
            else System.out.print(arr + ", ");
        }
    }

    public static void printArrayInStars(int[] array) {
        for (int arr: array) {
            // increment and print * based on the number in array each
            for (int i = 0; i < arr; i++) System.out.print("*");
            System.out.println(" ");
        }
    }

    static void main(String[] args) {
        int[] numbers = {5,1,3,4,2};

        System.out.println("Sum of array:");
        int sum = sumOfNumbersInArray(numbers);
        System.out.println(sum);

        System.out.println("Print neatly:");
        printNeatly(numbers);

        System.out.println(" ");

        System.out.println("Print array in stars:");
        printArrayInStars(numbers);
    }
}

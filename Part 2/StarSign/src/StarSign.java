public class StarSign {
    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println(" ");
    }

    public static void printSquare(int size) {
        int count = 0;
        while (count < size) {
            printStars(size);
            count++;
        }
    }

    public static void printRectangle(int width, int height) {
        int count = 0;
        while (count < height) {
            printStars(width);
            count++;
        }
    }

    public static void printTriangle(int size) {
        int count = 1;
        while (count <= size) {
            printStars(count);
            count++;
        }
    }

    static void main(String[] args) {
        System.out.println("Stars:");
        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println("Square:");
        printSquare(4);
        System.out.println("Rectangle:");
        printRectangle(17,3);
        System.out.println("Triangle:");
        printTriangle(4);
    }
}

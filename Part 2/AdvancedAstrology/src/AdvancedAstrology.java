public class AdvancedAstrology {
    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println(" ");
    }

    public static void printTriangle(int size) {
        int count = 1;
        int space = size;

        while (count <= size) {
            // create space first then print *
            printSpaces(space);
            printStars(count);

            count++;
            space--;
        }
    }

    public static void christmasTree(int height) {
        // tree variables
        int count = 1;
        int space = height;
        int area = height * 2;

        // tree base variables
        int baseCount = 1;
        int baseHeight = 2;
        int baseWidth = 3;
        int center = (area / 2) - 1;

        // printing the size of tree
        while (count <= area) {
            printSpaces(space);
            printStars(count);

            count+=2;
            space--;
        }

        // printing the size of tree base
        while (baseCount <= baseHeight) {
            printSpaces(center);
            printStars(baseWidth);
            baseCount++;
        }
    }

    static void main(String[] args) {
        System.out.println("Triangle with spaces:");
        printTriangle(4);
        System.out.println("Christmas tree:");
        christmasTree(4);
        System.out.println("Another Christmas tree:");
        christmasTree(10);
    }
}

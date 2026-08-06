public class Multiplier {
    private int number;

    public Multiplier(int number) {
        this.number = number;
    }

    public int multiply(int number) {
        // just multiplying number and this.number no need to set either to equal any
        return number * this.number;
    }
}

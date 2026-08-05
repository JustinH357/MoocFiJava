public class DecreasingCounter {
    private int value;   // a variable that remembers the value of the counter

    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrement() {
        this.value--;

        // decrement first then check if value is less than or equal to 0, set value to 0
        if (this.value <= 0) {
            this.value = 0;
        }
    }

    public void reset() {
        this.value = 0;
    }
}

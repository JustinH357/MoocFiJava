public class Gauge {
    private int value;

    public Gauge() {
        value = 0;
    }

    public void increase() {
        value++;
    }

    public void decrease() {
        value--;

        if (value <= 0) {
            value = 0;
        }
    }

    // getter since we are return instance var value
    public int getValue() {
        return value;
    }

    public boolean full() {
        return value == 5;
    }
}

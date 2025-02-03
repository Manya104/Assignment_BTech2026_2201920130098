class Counter {
    static protected int count = 0;

    // Default constructor
    public Counter() {
        count++;
    }

    // Static method to get the current count
    static public int getCount() {
        return count;
    }

    // Static method to reset the count
    static public void resetCount() {
        count = 0;
    }
}

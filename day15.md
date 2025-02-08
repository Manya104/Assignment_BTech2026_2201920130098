class Cycle {
    void describe() {
        System.out.println("My ancestor is a cycle who is a vehicle with pedals.");
    }
}

class Motorcycle extends Cycle {
    void describe() {
        System.out.println("Hello I am a motorcycle, I am a cycle with an engine.");
        super.describe(); // Calling the superclass method
    }
}

public class Main {
    public static void main(String[] args) {
        Motorcycle moto = new Motorcycle();
        moto.describe();
    }
}

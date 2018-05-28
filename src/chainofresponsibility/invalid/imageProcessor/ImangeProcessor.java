package chainofresponsibility.invalid.imageProcessor;

import java.util.Random;

/**
 * Source: https://sourcemaking.com/design_patterns/chain_of_responsibility/java/2
 */
interface Image {
    String process();
}

class IR implements Image {
    public String process() {
        return "IR";
    }
}

class LS implements Image {
    public String process() {
        return "LS";
    }
}

class Processor {
    private static final Random RANDOM = new Random();
    private static int nextID = 1;
    private int id = nextID++;

    public boolean execute(Image img) {
        if (RANDOM.nextInt(2) != 0) {
            System.out.println("   Processor " + id + " is busy");
            return false;
        }
        System.out.println("Processor " + id + " - " + img.process());
        return true;
    }
}


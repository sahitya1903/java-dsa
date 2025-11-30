import java.util.BitSet;

public class bitsetDemo{
    public static void main(String[] args) {

        BitSet b1 = new BitSet();
        BitSet b2 = new BitSet();

        // set some bits
        b1.set(1);
        b1.set(3);
        b1.set(5);

        b2.set(3);
        b2.set(4);
        b2.set(5);

        System.out.println("b1: " + b1);
        System.out.println("b2: " + b2);

        // Logical operations
        b1.and(b2);

        System.out.println("After AND operation: " + b1);
        System.out.println(b1.cardinality());
        b1.clear(5);
        System.out.println(b1);
    }
}

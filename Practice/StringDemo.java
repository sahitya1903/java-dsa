import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        sc.close();

        // String
        System.out.println("Original: " + sentence);
        System.out.println("Uppercase: " + sentence.toUpperCase());

        // StringBuilder
        StringBuilder sb = new StringBuilder(sentence);
        sb.reverse();
        String replaced = sb.toString().replace(" ", "-");
        System.out.println("Reversed & Hyphens: " + replaced);

        // StringBuffer
        StringBuffer sbf = new StringBuffer(replaced);
        sbf.append(" - Processed Successfully");
        System.out.println(sbf);
    }
}

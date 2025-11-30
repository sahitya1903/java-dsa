// class AgeException extends Exception {
//     public AgeException(String message) {
//         super(message);
//     }
// }

// public class CustomExcProgram {
//     public static void main(String[] args) {
//         try {
//             throw new AgeException("Age must be 18 or above to vote.");
//         } catch (AgeException e) {
//             System.out.println("Caught: " + e.getMessage());
//         }
//     }
// }



public class CustomExcProgram {
    public static void main(String[] args) {
        try {
            throw new ArithmeticException("Exception");
        } catch (ArithmeticException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}

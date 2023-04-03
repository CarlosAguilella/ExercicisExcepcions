import java.util.Scanner;

class NoEsUnEnteroException extends Exception {}
class DivisionPor0Exception extends Exception {}

class Main {
    public static void checkTheCode(String input) throws NoEsUnEnteroException, DivisionPor0Exception {
        try {
            int number = Integer.parseInt(input);

            int divResult = 22 / number;
            int multResult = 0 * number;
            System.out.println(multResult);
        } catch (NumberFormatException e) {
            throw new NoEsUnEnteroException();
        } catch (ArithmeticException e) {
            throw new DivisionPor0Exception();
        }
    }

    public static void main(String[] args) {

        try {
            checkTheCode(new Scanner(System.in).next());
        } catch (NoEsUnEnteroException e) {
            System.out.println("no int");
        } catch (DivisionPor0Exception e) {
            System.out.println("div 0");
        }
    }
}

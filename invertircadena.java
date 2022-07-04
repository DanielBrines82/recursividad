
    import java.util.Scanner;


        public class invertircadena {

                public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter any String :");
            String str = scanner.nextLine();
            System.out.println("The reverse of the String is : " + recursiveReverse(str));
        }

        static String recursiveReverse(String input) {
            if ((input == null) || (input.length() <= 1))
                return input;
            else {
                return recursiveReverse(input.substring(1)) + input.charAt(0);
            }
        }
    }


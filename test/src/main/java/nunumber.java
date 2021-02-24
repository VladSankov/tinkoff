import java.util.Scanner;
public class nunumber {

        public static void main(String[] args) {
            number();
        }
        static String number(){
            Scanner in = new Scanner(System.in);
            System.out.print("Input a number: ");
            String s = in.nextLine();
            int f = 0, t = 0;
            String s1 = s.replaceAll("([(,), ])","");
            if(s1 != s)
                t = 1;
            String res = s1;
            boolean start = res.startsWith("+7");
            if(start) {
                f = 1;
                res = s1.replace("+7", "8");
            }
            if(res.length() != 11)
            {
                System.out.println("Invalid number entered");
                System.exit(0);
            }
            else if(f == 1 && t == 1)
            {
                System.out.println("Replace +7 to 8");
                System.out.println("The number has spaces and / or brackets");
            }
            else if(f == 1)
                System.out.println("Replace +7 to 8");
            else if(t == 1)
                System.out.println("The number has spaces and / or brackets");
            else
                System.out.println("No changes");
            System.out.println("Your number: " + res);
            in.close();
            return null;
        }
    }


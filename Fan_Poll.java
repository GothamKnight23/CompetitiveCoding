import java.util.Scanner;

/**
 * Fan_Poll
 */
public class Fan_Poll {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a= s.nextInt(), b = s.nextInt(), c=s.nextInt();
        if (a>b && a>c) {
            System.out.println("Yes");
        }
        else{ 
            System.out.println("No");
        }
        s.close();
    }
}
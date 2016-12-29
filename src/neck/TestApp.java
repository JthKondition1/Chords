package neck;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class TestApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("E fret(#) is: ");//**** Start string/fret input
        int bigE = input.nextInt();
        System.out.print("A fret(#) is: ");
        int bigA = input.nextInt();
        System.out.print("D fret(#) is: ");
        int bigD = input.nextInt();
        System.out.print("G fret(#) is: ");
        int bigG = input.nextInt();
        System.out.print("B fret(#) is: ");
        int bigB = input.nextInt();
        System.out.print("e fret(#) is: ");
        int littleE = input.nextInt();
        System.out.println("Numeric tab of chord starting with big E: "
                + bigE + bigA + bigD + bigG + bigB + littleE);
    }

}

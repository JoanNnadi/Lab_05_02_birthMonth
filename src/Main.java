import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        int birthmonth;
        System.out.println(" Please enter your birth month: "); // promt the user to enter the birth month
        birthmonth = in.nextInt();

        if (birthmonth >= 1 && birthmonth <=12) {
            System.out.println( " Your birthmoth is: " + birthmonth);

        }
        else {
            System.out.println(" You entered an incorrect birthmonth value");
        }


    }
}
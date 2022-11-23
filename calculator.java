import java.util.Scanner;
public class calculator {
    public static void main (String[] args  ){
        double chislo1;
        double chislo2;
        double res;
        char ladno;
        Scanner myObj=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        chislo1 = myObj.nextDouble();
        chislo2 = myObj.nextDouble();
        System.out.print("\nEnter an operator (+, -, *, /): ");
        ladno = myObj.next().charAt(0);
        switch (ladno) {
            case '+':
                res = chislo1 + chislo2;
                break;
            case '-':
                res = chislo1 - chislo2;
                break;
            case '*':
                res = chislo1 * chislo2;
                break;
            case '/':
                res = chislo1 / chislo2;
                break;
            default:System.out.printf("oshibka realna");
                return;



        }
        System.out.print("\nyra pobeda:\n");
        System.out.printf(chislo1 + " " + ladno + " " + chislo2 + " = " + res);
    }
}

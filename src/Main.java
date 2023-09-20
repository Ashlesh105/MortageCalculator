import java.text.NumberFormat;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        int principal=0; float annualInterest=0; byte numberOfYears =0;
        Scanner scanner = new Scanner(System.in);
       while(true) {
            System.out.println("Principal($1K-$1M):");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal<100000) break;
            System.out.println("Enter value between betwen 1K and 1M");
        }
            while (true) {
                System.out.println("Annual Interest:");
                annualInterest = scanner.nextFloat();
                if (annualInterest>0 && annualInterest<=30)break;
                System.out.println("Enter value between betwen 0 and 30");
            }
        float monthlyInterest = annualInterest/PERCENT/MONTHS_IN_YEAR;
        while (true){
            System.out.println("Period(years):");
            numberOfYears = scanner.nextByte();
            if (numberOfYears>0 && numberOfYears<12)break;
            System.out.println("Enter value between betwen 0 and 12");
        }
        int years = numberOfYears*MONTHS_IN_YEAR;
        double mortage = principal*(monthlyInterest*Math.pow(1+monthlyInterest,years))/(Math.pow(1+monthlyInterest,years)-1);
        String mortageFormater = NumberFormat.getCurrencyInstance().format(mortage);
        System.out.println("Mortagage:"+mortageFormater);


    }
}
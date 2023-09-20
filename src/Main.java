import java.text.NumberFormat;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Principal:");
        int principal = scanner.nextInt();
        System.out.println("Annual Interest:");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest/PERCENT/MONTHS_IN_YEAR;
        System.out.println("Period(years):");
        byte numberOfYears = scanner.nextByte();
        int years = numberOfYears*MONTHS_IN_YEAR;
        double mortage = principal*(monthlyInterest*Math.pow(1+monthlyInterest,years))/(Math.pow(1+monthlyInterest,years)-1);
        String mortageFormater = NumberFormat.getCurrencyInstance().format(mortage);
        System.out.println("Mortagage:"+mortageFormater);


    }
}
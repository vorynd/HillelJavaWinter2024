package homework02;

public class BankDepositCalc {
    public static void main(String[] args) {
        double deposit = Double.parseDouble(args[0]);
        double percent = Double.parseDouble(args[1]);
        int years = Integer.parseInt(args[2]);

        System.out.println("Your deposit is: " + deposit);
        System.out.println("Percent is " + percent + "% yearly");
        System.out.println("Deposit term is " + years + " years");

        double monthlyMultiplier = percent / 100 / 12;

        for (int y = 0; y < years; y++) {
            double startDeposit = deposit;
            for (int i = 0; i < 12; i++) {
                deposit = deposit + deposit * monthlyMultiplier;
            }
            System.out.println("Year " + (y + 1) + ". Deposit = " + deposit);
            System.out.println("Yearly percent = " + (deposit - startDeposit));
        }
    }
}

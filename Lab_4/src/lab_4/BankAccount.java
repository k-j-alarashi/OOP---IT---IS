package lab_4;

public class BankAccount {

    public static void main(String[] args) {
        float currentAmount = 10000.0f;
        float futureAmount = currentAmount * 2;
        int years = 0;

        while (currentAmount <= futureAmount) {
            currentAmount = currentAmount + (currentAmount * 0.05f); // 0.05f == 5/100
            years++;
        }

        System.out.println("Years       : " + years);
    }
}

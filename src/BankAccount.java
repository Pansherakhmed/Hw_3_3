public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }
    public void deposit(double sum){
        amount = sum;
    }
    public void withDraw(int sum) throws LimitException{
        if(sum > amount){
            throw new LimitException("Ваш баланс: ", amount -= amount);
        }else {
            amount -= sum;
        }

    }
}

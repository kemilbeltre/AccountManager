
import java.util.*;

public class Account  {

    private double balance;
    private User user;
    private List<Expense> expenses;
    private List<Income> incomes;

    public Account(User user) {
        this.expenses = new ArrayList<>();
        this.incomes = new ArrayList<>();
        this.user = user;
        this.balance = 0;
    }

    public double getBalance() {
        return balance;
    }

    public double addIncomes(String description, double amount) {
        this.balance = this.balance + amount;
        this.incomes.add(new Income(amount, description));
        return this.balance;
    }

    public double addExpenses(String description, double amount) throws ExpenseException{

        if (amount < this.balance) {
            this.balance = this.balance - amount;
            this.expenses.add(new Expense(amount, description));
            System.out.println("The remaining balance is = "+getBalance());
            }else{
                throw new ExpenseException("DOES NOT HAVE A SUFFICIENT BALANCE");
            }
            return this.balance;
    }

    public List getExpenses() {
        return expenses;
    }

    public List getIncomes() {
        return incomes;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "saldo=" + balance + ", usuario=" + user + ", gastos=" + expenses + ", ingresos=" + incomes + '}';
    }
}

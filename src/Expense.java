
public class Expense extends Money {

    public Expense(double expense, String description) {
        this.money = expense;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Expense: " + this.getDescription()+","+
		" Amount: " + this.money + "\n";
    }

}

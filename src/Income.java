
public class Income extends Money {

    public Income(double income, String description) {
        this.description = description;
        this.money = income;
    }

    @Override
    public String toString() {
        return "Income: " + this.getDescription() + ", " + " Amount: " + this.money + "\n";
    }

}

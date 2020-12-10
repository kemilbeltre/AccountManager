
public abstract class Money {

    protected double money;
    protected String description;

    /**
     *
     * @return money
     */
    public double getMoney() {
        return money;
    }

    /**
     *
     * @param money
     */
    public void setMoney(double money) {
        this.money = money;
    }

    /**
     *
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

}

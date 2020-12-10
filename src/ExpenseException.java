
/**
 *
 * @author Kemil Beltre
 */
public class ExpenseException extends Exception {

    public static final long serialVersionUID = 700L;

    public ExpenseException(String message) {
        super(message);
    }



    @Override
    public String toString() {
        return "GastoException{" +
                "Exception: '" + getMessage() + '\'' +
                '}';
    }
}

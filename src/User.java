
/**
 *
 * @author Kemil Beltre
 */
public class User {

    private String name;
    private int age;
    private String DNI;

    /*
   *EMPTY BUILDER
     */
    public User() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDNI() {
        return this.DNI = DNI;
    }

    /**
     *  THE FOLLOWING METHOD EVALUATES WHETHER THE ENTERED ID IS CORRECT
     *
     * @param DNI
     */
    public boolean setDNI(String DNI) {
        if (DNI.matches("^[0-9]{8}[a-zA-Z]$")
                || DNI.matches("^[0-9]{8}[-][a-zA-Z]$")) {
            this.DNI = DNI;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", age=" + age + ", DNI=" + DNI + '}';
    }

}

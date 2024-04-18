public abstract class Employee {
    protected String name;
    protected String surname;
    protected String address;
    protected String email;
    protected String pesel;
    protected int startOfWork;

    public Employee(String name, String surname, String address, String email, String pesel, int startOfWork) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.email = email;
        this.pesel = pesel;
        this.startOfWork = startOfWork;
    }


    public abstract int calculateSalary();


}
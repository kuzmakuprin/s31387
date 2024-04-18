import java.util.ArrayList;

public class Tester {
    private String name;
    private String surname;
    private String address;
    private String email;
    private String pesel;
    private int startOfWork;
    private ArrayList<String> testTypes;

    public Tester(String name, String surname, String address, String email, String pesel, int startOfWork) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.email = email;
        this.pesel = pesel;
        this.startOfWork = startOfWork;
        this.testTypes = new ArrayList<>();
    }

    public void addTestType(String testType) {
        testTypes.add(testType);
    }

    public int calculateBonus() {
        int bonusPerTestType = 300;
        return testTypes.size() * bonusPerTestType;
    }

}

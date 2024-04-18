import java.util.ArrayList;

public class Developer {
    private String name;
    private String surname;
    private String address;
    private String email;
    private String pesel;
    private int startOfWork;
    private ArrayList<Technology> knownTechnologies; // Lista znanych technologii

    public Developer(String name, String surname, String address, String email, String pesel, int startOfWork) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.email = email;
        this.pesel = pesel;
        this.startOfWork = startOfWork;
        this.knownTechnologies = new ArrayList<>();
    }

    // Metoda dodająca znaną technologię
    public void addTechnology(Technology tech) {
        knownTechnologies.add(tech);
    }

    // Metoda obliczająca premię na podstawie znanych technologii
    public int calculateBonus() {
        int bonus = 0;
        for (Technology tech : knownTechnologies) {
            bonus += tech.getBonus();
        }
        return bonus;
    }

    public int calculateSalary(int baseSalary) {
        return baseSalary + calculateBonus();
    }

}

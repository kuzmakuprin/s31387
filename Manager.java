import java.util.ArrayList;
import java.util.Random;

public class Manager {
    private String name;
    private String surname;
    private String address;
    private String email;
    private String pesel;
    private int startOfWork;
    private ArrayList<Goal> goals; // Lista celów

    public Manager(String name, String surname, String address, String email, String pesel, int startOfWork) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.email = email;
        this.pesel = pesel;
        this.startOfWork = startOfWork;
        this.goals = new ArrayList<>();
    }

    public void addGoal(Goal goal) {
        goals.add(goal);
    }


    public int calculateSalary() {
        int baseSalary = 0;

        int bonus = 0;
        for (Goal goal : goals) {
            if (goal.isAchievedInCurrentMonth()) {
                bonus += goal.getBonus();
            }
        }
        // Dodaj bonusy do pensji
        return baseSalary + bonus;
    }


}
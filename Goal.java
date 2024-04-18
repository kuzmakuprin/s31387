import java.time.LocalDate;

public class Goal {
    private String name;
    private LocalDate deadline;
    private int bonus;

    public Goal(int year, int month, int day, String name, int bonus) {
        this.name = name;
        this.deadline = LocalDate.of(year, month, day);
        this.bonus = bonus;
    }

    // Metoda sprawdzająca, czy cel został osiągnięty w bieżącym miesiącu
    public boolean isAchievedInCurrentMonth() {
        LocalDate currentDate = LocalDate.now();
        return deadline.getYear() == currentDate.getYear() &&
                deadline.getMonth() == currentDate.getMonth();
    }

    // Gettery i settery
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
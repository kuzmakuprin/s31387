public class StudyProgramme {
    private String name;
    private String description;
    private int durationSemesters;
    private int currentSemester;
    public StudyProgramme(String name, String description, int durationSemesters, int currentSemester) {
        this.name = name;
        this.description = description;
        this.durationSemesters = durationSemesters;
        this.currentSemester = currentSemester;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public int getDurationSemesters() {
        return durationSemesters;
    }
    public int getCurrentSemester() {
        return currentSemester;
    }
    public void setCurrentSemester(int currentSemester) {
        this.currentSemester = currentSemester;
    }
}

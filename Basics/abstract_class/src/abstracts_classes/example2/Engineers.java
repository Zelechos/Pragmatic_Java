package abstracts_classes.example2;

public abstract class Engineers {

    private String speciality;
    private int yearsOfExperience;
    private boolean isGraduated;
    private boolean meetsTheProfile;

    public Engineers(String speciality, int yearsOfExperience, boolean isGraduated, boolean meetsTheProfile) {
        this.speciality = speciality;
        this.yearsOfExperience = yearsOfExperience;
        this.isGraduated = isGraduated;
        this.meetsTheProfile = meetsTheProfile;
    }

    public abstract void createProfessionalProfile();

    public abstract boolean isMeetsTheProfile();

    public abstract void setMeetsTheProfile();

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public boolean isGraduated() {
        return isGraduated;
    }

    public void setGraduated(boolean graduated) {
        isGraduated = graduated;
    }
}

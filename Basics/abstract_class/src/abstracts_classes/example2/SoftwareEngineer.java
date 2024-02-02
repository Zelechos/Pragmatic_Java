package abstracts_classes.example2;

public class SoftwareEngineer extends Engineers {

    public String name;
    public boolean isWorking;

    public SoftwareEngineer(String name, boolean isWorking, String speciality, int yearsOfExperience, boolean isGraduated, boolean meetsTheProfile) {
        super(speciality, yearsOfExperience, isGraduated, meetsTheProfile);
    }

    @Override
    public void createProfessionalProfile() {

    }

    @Override
    public boolean isMeetsTheProfile() {
        return false;
    }

    @Override
    public void setMeetsTheProfile() {

    }
}

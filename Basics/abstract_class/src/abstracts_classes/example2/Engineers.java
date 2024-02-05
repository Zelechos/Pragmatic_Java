package abstracts_classes.example2;

import java.util.Map;

/**
 * Practice Abstracts classes
 *
 * @author Alex T.H.
 * @version v0.4.1
 * @since 20.0.0 2024-02-05
 */
public abstract class Engineers {

    private final String speciality;
    private final int yearsOfExperience;
    private final boolean isGraduated;

    public Engineers(String speciality, int yearsOfExperience, boolean isGraduated) {
        this.speciality = speciality;
        this.yearsOfExperience = yearsOfExperience;
        this.isGraduated = isGraduated;
    }

    public abstract Map<String, Object> createProfessionalProfile();

    public abstract boolean isMeetsTheProfile(Map<String, Object> profile);

    public String getSpeciality() {
        return speciality;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public boolean isGraduated() {
        return isGraduated;
    }
}

package abstracts_classes.example2;

import java.util.HashMap;
import java.util.Map;

/**
 * Practice Abstracts classes
 *
 * @author Alex T.H.
 * @version v0.4.1
 * @since 20.0.0 2024-02-05
 */
public class AeroSpaceEngineer extends Engineers {

    private final String fullName;
    private final String nationality;
    private final boolean recommendations;

    public AeroSpaceEngineer(String speciality, int yearsOfExperience, boolean isGraduated, String fullName, String nationality, boolean recommendations) {
        super(speciality, yearsOfExperience, isGraduated);
        this.fullName = fullName;
        this.nationality = nationality;
        this.recommendations = recommendations;
    }

    @Override
    public Map<String, Object> createProfessionalProfile() {
        Map<String, Object> profile = new HashMap<>();
        profile.put("fullName", this.fullName);
        profile.put("nationality", this.nationality);
        profile.put("recommendations", this.recommendations);
        profile.put("speciality", this.getSpeciality());
        profile.put("yearsOfExperience", this.getYearsOfExperience());
        profile.put("isGraduated", this.isGraduated());
        return profile;
    }

    @Override
    public boolean isMeetsTheProfile(Map<String, Object> profile) {
        int experience = (int) profile.get("yearsOfExperience");
        boolean isRecommended = (boolean) profile.get("recommendations");
        boolean isGraduated = (boolean) profile.get("isGraduated");
        return isRecommended && isGraduated && (experience >= 5);
    }

    public String getFullName() {
        return fullName;
    }

    public String getNationality() {
        return nationality;
    }

    public boolean isRecommendations() {
        return recommendations;
    }
}

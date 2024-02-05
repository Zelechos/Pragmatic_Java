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
public class SoftwareEngineer extends Engineers {

    private final String name;
    private final int age;
    private final boolean isWorking;
    private final WorkType type;

    public SoftwareEngineer(String name, int age, boolean isWorking, WorkType type, String speciality, int yearsOfExperience, boolean isGraduated) {
        super(speciality, yearsOfExperience, isGraduated);
        this.name = name;
        this.age = age;
        this.isWorking = isWorking;
        this.type = type;
    }

    @Override
    public Map<String, Object> createProfessionalProfile() {
        Map<String, Object> profile = new HashMap<>();
        profile.put("name", this.name);
        profile.put("age", this.age);
        profile.put("isWorking", this.isWorking);
        profile.put("WorkType", this.type);
        profile.put("speciality", this.getSpeciality());
        profile.put("yearsOfExperience", this.getYearsOfExperience());
        profile.put("isGraduated", this.isGraduated());
        return profile;
    }

    @Override
    public boolean isMeetsTheProfile(Map<String, Object> profile) {
        int yearsOfExperience = (int) profile.get("yearsOfExperience");
        return yearsOfExperience >= 5;
    }

}

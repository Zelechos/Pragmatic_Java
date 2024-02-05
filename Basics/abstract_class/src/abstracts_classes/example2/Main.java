package abstracts_classes.example2;

/**
 * Practice Abstracts classes
 *
 * @author Alex T.H.
 * @version v0.4.1
 * @since 20.0.0 2024-02-05
 */
public class Main {
    public static void main(String[] args) {
        // test with Software Engineer Class
        WorkType workType = WorkType.REMOTE;
        Engineers softwareEngineer = new SoftwareEngineer("Alex", 27, true, workType, "Backend Developer", 5, false);
        var profile = softwareEngineer.createProfessionalProfile();
        System.out.println(profile.toString());
        System.out.println("The profile will be hired ? " + (softwareEngineer.isMeetsTheProfile(profile) ? "yes" : "no"));

        System.out.println("--------------------------------------------------");
        // test with AeroSpace Engineer Class
        Engineers aeroSpaceEngineer = new AeroSpaceEngineer("Spaceships", 3, false, "Mark DeLarge", "USA", false);
        var currentProfile = aeroSpaceEngineer.createProfessionalProfile();
        System.out.println(currentProfile.toString());
        System.out.println("The profile will be hired ? " + (aeroSpaceEngineer.isMeetsTheProfile(currentProfile) ? "yes" : "no"));

    }
}
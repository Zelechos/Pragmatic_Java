import beans.Person;
import beans.State;

/**
 * Learn Java Beans
 *
 * @author Alex T.H.
 * @version v0.4.4
 * @since 20.0.0 2024-05-08
 */
public class Main {
    public static void main(String[] args) {

        // Test my Person Bean
        Person person = new Person();
        person.setName("ALex");
        person.setLastname("Th.");
        System.out.println(person);

        // Test my State Bean
        State state = new State();
        state.setNameOfState("Initial");
        state.setActivate(true);

        try {
            state.setDateOfState(state.updateDateState());
            System.out.println(state);
            Thread.sleep(5000);// stop the thread of program 5 seconds to updateDateState
            state.setDateOfState(state.updateDateState());
            System.out.println(state);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }

    }
}
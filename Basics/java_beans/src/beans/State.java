package beans;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * Learn Java Beans
 *
 * @author Alex T.H.
 * @version v0.4.4
 * @since 20.0.0 2024-05-08
 */
public class State implements Serializable {

    private boolean activate;
    private String nameOfState;
    private Date dateOfState;

    public State() {
    }

    public boolean getActivate() {
        return activate;
    }

    public void setActivate(boolean activate) {
        this.activate = activate;
    }

    public String getNameOfState() {
        return nameOfState;
    }

    public void setNameOfState(String nameOfState) {
        this.nameOfState = nameOfState;
    }

    public Date getDateOfState() {
        return dateOfState;
    }

    public void setDateOfState(Date dateOfState) {
        this.dateOfState = dateOfState;
    }

    /**
     * Method to update a date of state
     */
    public Date updateDateState() {
        return Date.from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant());
    }

    @Override
    public String toString() {
        return "State{" + "activate=" + activate + ", nameOfState='" + nameOfState + '\'' + ", dateOfState=" + dateOfState + '}';
    }
}


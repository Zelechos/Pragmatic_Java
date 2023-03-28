package person;

import java.util.Date;

public class Client extends Person {

    private static int clienCounter;
    private int idClient;
    private Date registerDate;
    private boolean vip;

    public Client() {
    }

    public Client(String name, char gender, int age, String address, boolean vip, Date registeDate) {
        super(name, gender, age, address);
        this.idClient = ++Client.clienCounter;
        this.registerDate = registeDate;
        this.vip = vip;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        return "Client{" +
                "idClient=" + idClient +
                ", registerDate=" + registerDate +
                ", vip=" + vip +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}

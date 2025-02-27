package interviewDurgesh.comparable;

public class Emp {
    private String name;
    private int id;
    private int phoneNumber;

    public Emp(String name, int id, int phoneNumber) {
        this.name = name;
        this.id = id;
        this.phoneNumber = phoneNumber;
    }

    public String getName() { return name; }

    public int getId() { return id; }

    public int getPhoneNumber() { return phoneNumber; }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}

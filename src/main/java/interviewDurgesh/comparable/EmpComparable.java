package interviewDurgesh.comparable;

public class EmpComparable implements Comparable<EmpComparable> {

    private String name;
    private int id;
    private int phoneNumber;


    @Override
    public int compareTo(EmpComparable o) {  // comparing based on id
        return this.id-o.getId();
    }
    public EmpComparable(String name, int id, int phoneNumber) {
        this.name = name;
        this.id = id;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getPhoneNumber() {
        return phoneNumber;
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

package Entity;

public class Staff extends Person {
    private int id;
    private String school;
    private double pay;
    private Gender gender;

    public Staff() {;}
    public Staff(int id,String name, String school, double pay,Gender gender) {
        this.id = id;
        this.school = school;
        this.pay = pay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }
    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
    @Override
    public String getName(){
        return super.getName();
    }
    @Override
    public void setName(String name){
        super.setName(name);
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", school='" + school + '\'' +
                ", pay=" + pay +
                ",gender="+ gender +
                '}';
    }
}

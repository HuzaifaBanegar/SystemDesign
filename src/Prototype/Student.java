package Prototype;

public class Student implements Prototype<Student> {

    //Common attributes for all Students
    private String name;
    private int age;
    private String phone;
    private String email;

    //Common attributes for all the students

    private String batchName;
    private double avgBatchPsp;
    private int count = 0;

    public Student(){

    }

    // Copy Constructor
    public Student (Student student){
        this.name = student.name;
        this.age = student.age;
        this.phone = student.phone;
        this.email = student.email;
        this.batchName = student.batchName;
        this.avgBatchPsp = student.avgBatchPsp;
        this.count = student.count;
    }
    
    @Override
    public Student clone() {
        return new Student(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        this.count++;
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public double getAvgBatchPsp() {
        return avgBatchPsp;
    }

    public void setAvgBatchPsp(double avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }

    public String toString(){
        return "{" +"Name="+ this.name+", Batch="+this.batchName+ "}";
    }
}

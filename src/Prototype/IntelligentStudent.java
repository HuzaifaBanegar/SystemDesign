package Prototype;

public class IntelligentStudent extends Student {
    private int iq;

    public IntelligentStudent(){

    }

    // Copy Constructor
    public IntelligentStudent(IntelligentStudent student){
        super(student);
        this.iq = student.iq;
    }

    @Override
    public Student clone() {
        return new IntelligentStudent(this);

    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
}

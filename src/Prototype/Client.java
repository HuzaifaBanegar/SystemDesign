package Prototype;

public class Client {

    private static void populateRegistoryDummy(StudentRegistery registory) {
       Student inter_dec23_prototype_student = new Student();
       inter_dec23_prototype_student.setAvgBatchPsp(90.0);
       inter_dec23_prototype_student.setBatchName("Intermediate December 2023");
       registory.register("Int-dec23", inter_dec23_prototype_student);

       Student begin_jan24_prototype_student = new Student();
       begin_jan24_prototype_student.setAvgBatchPsp(94.0);
       begin_jan24_prototype_student.setBatchName("Beginner January 2024");
       registory.register("Beg-jan24", begin_jan24_prototype_student);

       IntelligentStudent intelligentStudentProto = new IntelligentStudent();
       intelligentStudentProto.setAvgBatchPsp(99.0);
       intelligentStudentProto.setBatchName("Advance Intelligent December 2023");
       registory.register("Adv-I-dec23", intelligentStudentProto);

    }

    public static void main(String[] args) {
        StudentRegistery registory = new StudentRegistery();
        populateRegistoryDummy(registory);

        // New student arrives
        // get the prototype from registory
        // and just set the dynamic values

        Student huzaifa = registory.get("Int-dec23").clone();
        huzaifa.setName("Huzaifa");
        huzaifa.setAge(27);
        huzaifa.setPhone("1928728612");
        huzaifa.setEmail("huzaifa@gmail.com");

        // huzaifa.saveToDb -> action that we can perform

        System.out.println(huzaifa);


    }
}

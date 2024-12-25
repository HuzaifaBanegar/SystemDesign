package Builder_Design_Patter;

public class Client {
    public static void main(String[] args) {
//        Builder builder = Student.getBuilder();
//        builder.setName("Huzaifa");
//        builder.setAge(27);
//        builder.setCompany("Botpresso");
//        Student student = builder.build();

        Student studentBuilder = Student.getBuilder()
                                .setName("Huzaifa")
                                .setAge(27)
                                .setCompany("Botpresso")
                                .setPsp(89.99)
                                .setBatch("LLD")
                                .build();

        System.out.println("debug");

    }
}

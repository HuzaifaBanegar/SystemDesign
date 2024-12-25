package Builder_Design_Patter;

public class Student {
    private String name;
    private int age;
    private String company;
    private double psp;
    private String batch;

    // By making it private we are restircting anyone to access the Students class directly without going through builder class
    // By that we are ensuring that all the validations are passed and then only object will be created from student class

    private Student(Builder builder) {
        this.name = builder.getName();
        this.age = builder.getAge();
        this.company = builder.getCompany();
        this.psp = builder.getPsp();
        this.batch = builder.getBatch();
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    // Inner class
    public static class Builder {
        private String name;
        private int age;
        private String company;
        private double psp;
        private String batch;

        public Student build (){
            //Validations here
            if(this.getAge()<20){
                throw new RuntimeException("Age cannot be less than 20");
            }

            // Create Object from students class
            return new Student(this);
        }
        //Setter methods
        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        public Builder setAge(int age) {
            this.age = age;
            return this;
        }
        public Builder setCompany(String company) {
            this.company = company;
            return this;
        }
        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }
        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        //Getter methods
        public String getName() {
            return name;
        }
        public int getAge() {
            return age;
        }
        public String getCompany() {
            return company;
        }
        public double getPsp() {
            return psp;
        }
        public String getBatch() {
            return batch;
        }

    }


}

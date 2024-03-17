public class Student{
    // The two fields are initialized to a null and 0
    private String name = "";
    private int age = 0;

    // A constructor that sets the name and age when the object is created.
    public Student(String name, int age){
        setName(name); // Calls the setName method and use the value from the constructor's parameter.
        setAge(age); // Calls the setAge method and use the value from the constructor's parameter.
    }
    // Sets the name of a new student.
    public void setName(String studentName){
       this.name = studentName;
    };
    // With this accessor, it returns the name of the student.
    public String getName(){
        return name;
    }
    // Sets a new age value whenever the user creates a new student object.
    public void setAge(int newAge){
        this.age = newAge;

        if (newAge <= 0){
            // System.out.print("Age must be greater than 0"); // This statement ensure if the validation executes properly.
            this.age = 0;
        }

    }

    // This method returns the age of the student.
    public int getAge(){
        return age;
    }

    // The getSchoolingLevel returns the level of the student based on age.
    public String getSchoolingLevel(){
        String schoolLevel = "";

        if (age == 5){
            schoolLevel = "Kindergarten";
        } else if (age >= 6 && age <= 10){
            schoolLevel = "Elementary School";
        } else if (age >= 11 && age <= 13){
            schoolLevel = "Intermediate School / Middle School";
        } else if (age >= 14 && age <= 17){
            schoolLevel = "High School";
        } else if (age >= 18) {
            schoolLevel = "College";
        } else {
            schoolLevel = "Unknown";
        }

        return schoolLevel;
    }

}
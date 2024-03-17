public class StudentCreator {
    public static void main(String[] args) {
        Student newLearner = new Student("Hal 9000", 0);
        System.out.println("Name: " + newLearner.getName());
        System.out.println("Age: " + newLearner.getAge());
        System.out.println("Schooling Level: " + newLearner.getSchoolingLevel());

    }
}

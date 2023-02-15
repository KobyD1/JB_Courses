package ObjectOrientedExample;

public class UniversityTest {
    public static void main(String[] args) {
      Student mathStudent = new Student(1995,"John","Smith");
      Student englishStudent = new Student(2000,"David","Backham");
      Driver driver1 = new Driver(1995,"Joe");
      Driver driver2 = new Driver(2000, "Jony");

      mathStudent.setDataBase("Hebrew",98);
        mathStudent.setDataBase("Sport",55);
        driver1.setDataBase("Math",87);
        int lisenceLevel = driver1.getLicence();
        driver2.getLicence();
        System.out.println("lisince level = "+lisenceLevel);




    }

}

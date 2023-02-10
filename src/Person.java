public class Person {
    private String fullName;
    private int age;
    private String clothes;
    private int experiens;
    private double salary;
    private String professional;

    public Person(String fullName, int age, String clothes, int experiens, double salary) {
        this.fullName = fullName;
        this.age = age;
        this.clothes = clothes;
        this.experiens = experiens;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClothes() {
        return clothes;
    }

    public void setClothes(String clothes) {
        this.clothes = clothes;
    }

    public int getExperiens() {
        return experiens;
    }

    public void setExperiens(int experiens) {
        this.experiens = experiens;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println(" Человек работает");

    }
    public void wear(){
        System.out.println("Человек одевает ");

    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", clothes='" + clothes + '\'' +
                ", experiens=" + experiens +
                ", salary=" + salary +
                '}';
    }
}

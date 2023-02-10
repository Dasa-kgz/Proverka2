public class Doctor extends Person {
    public Doctor(String fullName, int age, String clothes, int experiens, double salary) {
        super(fullName, age, clothes, experiens, salary);
    }

    @Override
    public void work() {
        System.out.println("Этот человек работает доктором");
    }

    @Override
    public void wear() {
        System.out.println("Он(а) носит халат");
    }
}

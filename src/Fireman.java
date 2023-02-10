public class Fireman extends Person{
    public Fireman(String fullName, int age, String clothes, int experiens, double salary) {
        super(fullName, age, clothes, experiens, salary);
    }

    @Override
    public void work() {
        System.out.println("Он пожарником работает");
    }

    @Override
    public void wear() {
        System.out.println("Его форма пожаро устойчивая");
    }

}

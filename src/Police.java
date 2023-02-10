public class Police extends Person{
    public Police(String fullName, String rinat, int age, String clothes, int experiens, double salary){
        super(fullName, age, clothes, experiens, salary);
    }

    @Override
    public void work() {
        System.out.println("Он работает в полиции");
    }

    @Override
    public void wear() {
        System.out.println("у него спец. форма");
    }
}

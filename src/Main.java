public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Gulira", 21, "black white", 5, 2500.8);
        System.out.println(doctor);
        doctor.work();
        doctor.wear();
        System.out.println("---------------------------------------");

        Police police = new Police("Police","Rinat",25,"DARK",21,215);
        System.out.println(police);
        police.work();
        police.wear();
        System.out.println("*************************************");

        Fireman fireman = new Fireman("Bakyt",35,"red",8,54566);
        System.out.println(fireman);
        fireman.work();
        fireman.wear();




    }

}
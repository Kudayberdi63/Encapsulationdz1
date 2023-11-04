public class Main {
    public static void main(String[] args) {
        School school = new School("J.Sultanov ", "Almatinka ", 12);
        System.out.println(school.getName() + "\n" + school.getAdreas() + "\n" + school.getNumber());

        System.out.println(" ");

        School school1 = new School("K.Kolbaev", "Vostok 5 ", 56);
        System.out.println(school1.getName() + "\n" + school1.getAdreas() + "\n" + school1.getNumber());

        System.out.println(" ");

        School school2 = new School("A.Chyngyz", "Kok-JAr ", 33);
        System.out.println(school2.getName() + "\n" + school2.getAdreas() + "\n" + school2.getNumber());
        System.out.println(" ");

        System.out.println("University");

        University university = new University();
        university.setName("Salumbekov");
        university.setAdreas("Peervo Mayskyi");
        university.setNumber(154);
        System.out.println(university.getName() + "\n" + university.getAdreas() + "\n" + university.getNumber());
        System.out.println(" ");
        University university1 = new University();
        university1.setName("Kudayberdiev");
        university1.setAdreas("Pervo Mayskyi");
        university1.setNumber(63);
        System.out.println(university1.getName() + "\n" + university1.getAdreas() + "\n" + university1.getNumber());
        System.out.println(" ");

        University university2 = new University();
        university2.setName("Salumbekova");
        university2.setAdreas("Peervo Mayskyi");
        university2.setNumber(44);
        System.out.println(university.getName() + "\n" + university.getAdreas() + "\n" + university.getNumber());
        System.out.println(" ");

        Car car = new Car();
        car.setName("Mercedes amg w213 e63s ");
        car.setColor("blac");
        car.setPrice(8000000);
        car.setVolume("6.3");
        System.out.println(car.getName() + "\n" + car.getColor() + "\n" + car.getPrice() + "\n" + car.getVolume());
        System.out.println(" ");
        Car car1 = new Car();
        car1.setName("Mercedes amg G63");
        car1.setColor("blac");
        car1.setPrice(900000000);
        car1.setVolume("6.4");
        System.out.println(car1.getName() + "\n" + car1.getColor() + "\n" + car1.getPrice() + "\n" + car1.getVolume());

        System.out.println(" ");

        Car car2 = new Car();
        car2.setName("Mercedes amg Cls63  ");
        car2.setColor("blac");
        car2.setPrice(8000000);
        car2.setVolume("6.3");
        System.out.println(car2.getName() + "\n" + car2.getColor() + "\n" + car2.getPrice() + "\n" + car2.getVolume());
        System.out.println(" ");

        Person person = new Person();
        person.setName("Kuba");
        person.setSurName("Gapurov");
        person.setAge(17);

        System.out.println(person.getName() + "\n" + person.getSurName() + "\n" + person.getAge());

        System.out.println(" ");

        Person person1 = new Person();
        person1.setName("Ulan");
        person1.setSurName("Abdyganiev");
        person1.setAge(17);
        System.out.println(person1.getName() + "\n" + person1.getSurName() + "\n" + person1.getAge());

        System.out.println(" ");

        Person person2 = new Person();
        person2.setName("Musa");
        person2.setSurName("Fazilov");
        person2.setAge(17);
        System.out.println(person2.getName() + "\n" + person2.getSurName() + "\n" + person2.getAge());
    }
}
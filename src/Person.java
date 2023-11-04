public class Person {
    String name;
    String surName;
    int age;

    public Person(String name, String surName, int age) {
        this.name = name;
        this.age = age;
        this.surName = surName;
    }
    public  Person(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

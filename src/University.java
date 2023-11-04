public class University {
    String name;
    String adreas;
    int number ;

    public University(String name, String adreas, int number) {
        this.name = name;
        this.adreas = adreas;
        this.number = number;
    }
    public University(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdreas() {
        return adreas;
    }

    public void setAdreas(String adreas) {
        this.adreas = adreas;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

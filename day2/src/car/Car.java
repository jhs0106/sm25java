package car;

public class Car {
    private String name;
    private String color;
    private int size;

    // Constructor
    public Car(){
        this.name = "Default";
        this.color = "white";
        this.size = 100;
    }
    public Car(String name, String color, int size){
        this.name = name;
        this.color = color;
        this.size = size;
    }
    public void go(){
        System.out.printf("%s Car go \n", this.name);
    }
    public void stop(){
        System.out.printf("%s Car stop\n", this.name);
    }
}

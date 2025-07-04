package vehicle;

public abstract class Vehicle {
    protected String name;
    protected double maxSpeed;
    protected int capacity;
    protected String fuelType;

    // 기본 생성자
    public Vehicle() {

    }

    // 매개변수가 있는 생성자
    public Vehicle(String name, double maxSpeed, int capacity, String fuelType) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.capacity = capacity;
        this.fuelType = fuelType;
    }

    // 추상 메서드들
    public abstract void start();
    public abstract void stop();
    public abstract void move();
    public abstract String getOperatingArea();

    // toString 메서드
    @Override
    public String toString() {
        return name + " [속도: " + maxSpeed + "km/h, 정원: " + capacity + "명, 연료: " + fuelType + ", 영역: " + getOperatingArea() + "]";
    }
}

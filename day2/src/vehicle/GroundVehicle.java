package vehicle;

public class GroundVehicle extends Vehicle {
    private int wheelcount;

    // 기본 생성자
    public GroundVehicle() {

    }

    // 매개변수가 있는 생성자
    public GroundVehicle(String name, double maxSpeed, int capacity, String fuelType, int wheelcount) {
        super(name, maxSpeed, capacity, fuelType);
        this.wheelcount = wheelcount;
    }

    @Override
    public void start() {
        System.out.println(name + " 시동을 켜고 " + wheelcount + "개의 바퀴가 회전합니다.");
    }

    @Override
    public void stop() {
        System.out.println(name + " 브레이크를 걸고 정지합니다.");
    }

    @Override
    public void move() {
        System.out.println(name + "이(가) " + wheelcount + "개의 바퀴로 도로를 달립니다.");
    }

    @Override
    public String getOperatingArea() {
        return "지상 운행영역 (도로, 철도)";
    }

    // getter, setter 메서드들
    public int getWheelcount() { return wheelcount; }
    public void setWheelcount(int wheelcount) { this.wheelcount = wheelcount; }

    @Override
    public String toString() {
        return name + " [속도: " + maxSpeed + "km/h, 정원: " + capacity + "명, 연료: " + fuelType + ", 바퀴: " + wheelcount + "개, 영역: " + getOperatingArea() + "]";
    }
}

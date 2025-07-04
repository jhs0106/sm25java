package vehicle;

public class MarineVehicle extends Vehicle {
    private String currentPort;

    // 기본 생성자
    public MarineVehicle() {

    }

    // 매개변수가 있는 생성자
    public MarineVehicle(String name, double maxSpeed, int capacity, String fuelType, String currentPort) {
        super(name, maxSpeed, capacity, fuelType);
        this.currentPort = currentPort;
    }

    @Override
    public void start() {
        System.out.println(name + " 엔진을 가동하고 " + currentPort + "에서 출항합니다.");
    }

    @Override
    public void stop() {
        System.out.println(name + " 엔진을 정지하고 " + currentPort + "에 정박합니다.");
    }

    @Override
    public void move() {
        System.out.println(name + "이(가) 파도를 가르며 항해합니다.");
    }

    @Override
    public String getOperatingArea() {
        return "해양 운행영역 (바다, 강, 호수)";
    }

    // getter, setter 메서드들
    public String getCurrentPort() { return currentPort; }
    public void setCurrentPort(String currentPort) { this.currentPort = currentPort; }

    @Override
    public String toString() {
        return name + " [속도: " + maxSpeed + "km/h, 정원: " + capacity + "명, 연료: " + fuelType + ", 현재항구: " + currentPort + ", 영역: " + getOperatingArea() + "]";
    }
}

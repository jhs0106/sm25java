package vehicle;

public class AirVehicle extends Vehicle {
    private String flightTypes;

    // 기본 생성자
    public AirVehicle() {

    }

    // 매개변수가 있는 생성자
    public AirVehicle(String name, double maxSpeed, int capacity, String fuelType, String flightTypes) {
        super(name, maxSpeed, capacity, fuelType);
        this.flightTypes = flightTypes;
    }

    @Override
    public void start() {
        System.out.println(name + " 엔진 점검 후 이륙 준비를 합니다.");
    }

    @Override
    public void stop() {
        System.out.println(name + " 착륙하고 엔진을 정지합니다.");
    }

    @Override
    public void move() {
        System.out.println(name + "(" + flightTypes + ")이(가) 하늘을 비행합니다.");
    }

    @Override
    public String getOperatingArea() {
        return "항공 운행영역 (" + flightTypes + ")";
    }

    // getter, setter 메서드들
    public String getFlightTypes() { return flightTypes; }
    public void setFlightTypes(String flightTypes) { this.flightTypes = flightTypes; }

    @Override
    public String toString() {
        return name + " [속도: " + maxSpeed + "km/h, 정원: " + capacity + "명, 연료: " + fuelType + ", 종류: " + flightTypes + ", 영역: " + getOperatingArea() + "]";
    }
}

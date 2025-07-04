package vehicle;

public class UnderVehicle extends Vehicle {
    private String tunnelType;
    private double depth;

    // 기본 생성자
    public UnderVehicle() {

    }

    // 매개변수가 있는 생성자
    public UnderVehicle(String name, double maxSpeed, int capacity, String fuelType,
                        String tunnelType, double depth) {
        super(name, maxSpeed, capacity, fuelType);
        this.tunnelType = tunnelType;
        this.depth = depth;
    }

    @Override
    public void start() {
        System.out.println(name + " 지하에서 운행을 시작합니다.");
    }

    @Override
    public void stop() {
        System.out.println(name + " 지하역에 정차합니다.");
    }

    @Override
    public void move() {
        System.out.println(name + "이(가) " + tunnelType + " 터널을 통과합니다. (깊이: " + depth + "m)");
    }

    @Override
    public String getOperatingArea() {
        return "지하 운행영역 (" + tunnelType + ")";
    }

    // getter, setter 메서드들
    public String getTunnelType() { return tunnelType; }
    public void setTunnelType(String tunnelType) { this.tunnelType = tunnelType; }
    public double getDepth() { return depth; }
    public void setDepth(double depth) { this.depth = depth; }

    @Override
    public String toString() {
        return name + " [속도: " + maxSpeed + "km/h, 정원: " + capacity + "명, 연료: " + fuelType + ", 터널: " + tunnelType + ", 깊이: " + depth + "m, 영역: " + getOperatingArea() + "]";

    }
}

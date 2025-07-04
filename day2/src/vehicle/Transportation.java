package vehicle;

public class Transportation {
    public static void main(String[] args) {
        System.out.println("=== 교통수단 운행영역별 시스템 ===\n");

        // 각 운행영역별 교통수단 생성
        Vehicle vehicles[] = new Vehicle[4];
        vehicles[0] = new GroundVehicle("고속버스", 120.5, 45, "경유", 6);
        vehicles[1] = new UnderVehicle("지하철 2호선", 80.0, 180, "전기", "도시철도", 15.5);
        vehicles[2] = new AirVehicle("Boeing 737", 850.8, 180, "항공유", "민항기");
        vehicles[3] = new MarineVehicle("여객선", 45.7, 200, "경유", "부산항");


        // 모든 교통수단 테스트
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString());
            vehicle.start();
            vehicle.move();
            vehicle.stop();
            System.out.println();
        }

    }
}


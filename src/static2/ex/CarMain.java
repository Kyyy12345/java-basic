package static2.ex;

public class CarMain {
    static void main() {
        Car c1 = new Car("K3");
        Car c2 = new Car("G80");
        Car c3 = new Car("Medel Y");

        Car.showTotalCars(); // 구매한 차량수를 출력하는  static 메서드

    }
}

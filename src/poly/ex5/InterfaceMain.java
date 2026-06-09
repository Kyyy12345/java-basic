package poly.ex5;



public class InterfaceMain {
    static void main() {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Caw caw = new Caw();

        moveAnimal(cat);
        moveAnimal(dog);
        moveAnimal(caw);

    }

    private static void moveAnimal(InterfaceAnimal animal) {
        System.out.println("동물 이동 테스트 시작");
        animal.move();
        System.out.println("동물 이동 테스트 종료");
    }

    private static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("동물 이동 테스트 시작");
        animal.sound();
        System.out.println("동물 이동 테스트 종료");
    }
}

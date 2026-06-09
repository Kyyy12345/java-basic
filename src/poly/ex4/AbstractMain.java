package poly.ex4;

public class AbstractMain {
    static void main() {
        // 추상클래스 생성 불가

        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        dog.move();
        cat.move();

        moveAnimal(dog);
        moveAnimal(cat);
        moveAnimal(caw);


    }

    private static void moveAnimal(AbstractAnimal animal) {
        System.out.println("동물 이동 테스트 시작");
        animal.move();
        System.out.println("동물 이동 테스트 종료");
    }
}

package poly.ex3;

public class AbstractMain {
    static void main() {
        // 추상클래스 생성 불가

        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        dog.sound();
        cat.sound();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);


    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물소리 테스트 시작");
        animal.sound();
        System.out.println("동물소리 테스트 종료");
    }
}

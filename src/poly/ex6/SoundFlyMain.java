package poly.ex6;

import poly.ex5.InterfaceAnimal;

public class SoundFlyMain {
    static void main() {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Chidken chidken = new Chidken();

        soundAnimal(dog);
        soundAnimal(bird);
        soundAnimal(chidken);

        flyAnimal(bird);
    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 이동 테스트 시작");
        animal.sound();
        System.out.println("동물 이동 테스트 종료");
    }

    // Fly인터페이스가 있으면 사용 가능
    private static void flyAnimal(Fly fly) {
        fly.fly();
    }
}

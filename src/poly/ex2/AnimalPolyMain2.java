package poly.ex2;

public class AnimalPolyMain2 {
    static void main() {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal caw = new Caw();
        Animal[] animals = {dog, cat, caw};

        for(Animal animal: animals) {
            System.out.println("동물소리 테스트 시작");
            animal.sound();
            System.out.println("동물소리 테스트 종료");
        }

    }


}

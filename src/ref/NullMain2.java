package ref;

public class NullMain2 {
    static void main() {
        Data data = null;
        data.value = 10; //NullPointException 발생
        System.out.println("data = " + data.value);
    }
}

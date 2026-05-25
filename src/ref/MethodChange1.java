package ref;

public class MethodChange1 {
    static void main() {
        int a = 10;
        System.out.println(a);
        changePrimitive(a);
        System.out.println(a);
    }

    static void changePrimitive(int x) {
        x = 20;
    }
}

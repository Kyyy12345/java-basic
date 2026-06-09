package poly.diamond;

public class DiamondMain {
    static void main() {
        InterfaceA a = new Child();
        a.methodA();
        a.methodCommon();
    }
}

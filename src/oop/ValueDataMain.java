package oop;

public class ValueDataMain {
    static void main() {
        ValueData valueData = new ValueData();
        valueData.add();
    }

    static void add(ValueData valueData) {
        valueData.value++;
        System.out.println("valueData 증가 = " + valueData.value);
    }
}

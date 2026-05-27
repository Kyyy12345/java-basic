package access.ex;

public class CountMain  {
    static void main() {
        MaxCount count = new MaxCount(3);
        count.increment();
        count.increment();
        count.increment();
        count.increment();
        count.increment();
        count.increment();
        int counter = count.getCount();
        System.out.println(counter);
    }
}

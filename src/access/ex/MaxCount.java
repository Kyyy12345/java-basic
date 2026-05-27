package access.ex;

public class MaxCount {
    private int count = 0;
    private int max;

    public MaxCount(int max) {
        this.max = max;
    }

    public void increment() {
        // 검증로직
        if (count >= max) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }
        // 실행로직
        count++;
    }

    public int getCount() {
        return count;
    }

}

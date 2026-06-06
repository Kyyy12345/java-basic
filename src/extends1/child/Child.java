package extends1.child;

import extends1.parent.Parent;

public class Child extends Parent {

    public void call() {
        publicValue = 1;
        protectedValue = 1; // 상속 관계
        //defaultValue = 1; // 다른패키지 접근 불가
    }
}

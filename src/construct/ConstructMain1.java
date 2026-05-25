package construct;

public class ConstructMain1 {
    static void main() {
        MemberConstruct member1 = new MemberConstruct("user1", 15, 89);
        MemberConstruct member2 = new MemberConstruct("user2", 16, 49);

        MemberConstruct[] members = {member1, member2};

        for(MemberConstruct m : members) {
            System.out.println("이름: " + m.name + " 나이: "+ m.age + " 점수: " + m.grade);
        }

    }
}

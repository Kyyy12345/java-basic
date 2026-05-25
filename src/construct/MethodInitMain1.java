package construct;

public class MethodInitMain1 {
    static void main() {
        MemberInit member1 = new MemberInit();
        member1.initMember("user1", 15, 90);

        MemberInit member2 = new MemberInit();
        member2.initMember("user2", 16, 80);

        MemberInit[] members = {member1, member2};

        for(MemberInit m : members) {
            System.out.println(m.name + " " + m.age + " " + m.grade);
        }
    }
}

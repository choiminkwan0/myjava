package object_ex.equals_ex;

public class Member {
    public String id;

    public Member(String id) {
        this.id = id;
    }

    @Override // extends Object가 자동 생략되어 빨간줄 없음
    public boolean equals(Object obj) {
        if(obj instanceof Member) {
            Member member = (Member) obj;
            if(id.equals(member.id)) {
                return true;
            }
        }
        return false;
    }
    
}

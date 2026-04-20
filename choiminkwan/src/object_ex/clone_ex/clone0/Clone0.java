package object_ex.clone_ex.clone0;

public class Clone0 implements Cloneable {
    public String id;
    public String name;
    public String pw;
    public int age;
    public boolean adult;

    public Clone0(String id, String name, String pw, int age, 
    boolean adult) {
        this.id = id;
        this.name = name;
        this.pw = pw;
        this.age = age;
        this.adult = adult;
    }

    public Clone0 getMember() {
        Clone0 cloned = null;
        try {
            cloned = (Clone0) clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return cloned;
    }
    
}

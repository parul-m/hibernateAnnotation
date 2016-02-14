package dto;
public class javabean {
    int rno;
    String name;
    float fees;
    public javabean(){}
    public javabean(int rno, String name, float fees) {
        this.rno = rno;
        this.name = name;
        this.fees = fees;
    }
    

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getFees() {
        return fees;
    }

    public void setFees(float fees) {
        this.fees = fees;
    }
    
}

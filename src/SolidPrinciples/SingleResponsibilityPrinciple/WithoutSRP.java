package SolidPrinciples.SingleResponsibilityPrinciple;

public class WithoutSRP {
    // here multiple responsibility of this class, which not good
    public String s;
    public int l;
    public int getLength(){
        return s.length();
    }
    public int Area(){
        return l*l;
    }
}

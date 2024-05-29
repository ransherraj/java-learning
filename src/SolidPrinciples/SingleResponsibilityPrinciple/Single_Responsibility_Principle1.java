package SolidPrinciples.SingleResponsibilityPrinciple;

public class Single_Responsibility_Principle1 {

    private String s;

    public Single_Responsibility_Principle1(String str){
        super();
        this.s = str;
    }

    public int getLength(){
        return s.length();
    }

}

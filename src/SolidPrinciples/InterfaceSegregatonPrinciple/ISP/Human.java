package SolidPrinciples.InterfaceSegregatonPrinciple.ISP;

public class Human implements IHumanActions{
    @Override
    public void Walk() {
        System.out.println("can walk");
    }

    @Override
    public void Run() {
        System.out.println("can run");
    }
}

package SolidPrinciples.InterfaceSegregatonPrinciple.WithoutISP;

public class Human implements IActions{
    @Override
    public void Walk() {
        System.out.println("walk");
    }

    @Override
    public void run() {
        System.out.println("run");
    }

    @Override
    public void fly() {
        // need not be here, because human cannot fly
    }
}

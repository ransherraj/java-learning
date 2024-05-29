package SolidPrinciples.InterfaceSegregatonPrinciple.WithoutISP;

public class Bird implements IActions{
    @Override
    public void Walk() {
        // need not be here, because human cannot walk
    }

    @Override
    public void run() {
        // need not be here, because human cannot run
    }

    @Override
    public void fly() {
        System.out.println("fly");
    }
}

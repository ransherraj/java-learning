package SolidPrinciples.InterfaceSegregatonPrinciple.ISP;

public class Bird implements IBirdActions{
    @Override
    public void Fly() {
        System.out.println("Bird Fly");
    }
}

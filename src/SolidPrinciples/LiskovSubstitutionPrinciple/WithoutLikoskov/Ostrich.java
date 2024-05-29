package SolidPrinciples.LiskovSubstitutionPrinciple.WithoutLikoskov;

public class Ostrich extends Bird{
    @Override
    public void fly(){
        //super.fly();
        throw new RuntimeException("Ostrich cannot fly");

        //So, extending Bird class and contradicting its behaviour is not good.
        //Need of Liskov Substitution Principle

    }
}

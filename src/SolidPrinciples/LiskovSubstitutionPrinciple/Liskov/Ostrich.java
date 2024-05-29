package SolidPrinciples.LiskovSubstitutionPrinciple.Liskov;

public class Ostrich {
    private Flyable flyable;
    public Ostrich(Flyable theflyable){
        this.flyable = theflyable;
    }
    public void Fly(){
        System.out.print("Ostrich : ");
        flyable.CanNotFly();
    }
}




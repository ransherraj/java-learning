package SolidPrinciples.LiskovSubstitutionPrinciple.Liskov;

public class Bird {
    private Flyable flyable;
    public Bird(Flyable theflyable){
        this.flyable = theflyable;
    }
    public void Fly(){
        System.out.print("Bird : ");
        flyable.CanFly();
    }
}

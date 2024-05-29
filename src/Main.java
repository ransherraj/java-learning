//import SolidPrinciples.LiskovSubstitutionPrinciple.WithoutLikoskov.Bird;
//import SolidPrinciples.LiskovSubstitutionPrinciple.WithoutLikoskov.Ostrich;
import ArrayAndMap.TwoSum;
import SolidPrinciples.DependencyInversionPrinciple.DIP.Entity.User;
import SolidPrinciples.DependencyInversionPrinciple.DIP.Service.UserService;
import SolidPrinciples.DependencyInversionPrinciple.DIP.UserDAO.UserModule;
import SolidPrinciples.LiskovSubstitutionPrinciple.Liskov.Bird;
import SolidPrinciples.LiskovSubstitutionPrinciple.Liskov.Flyable;
import SolidPrinciples.LiskovSubstitutionPrinciple.Liskov.Ostrich;

public class Main {

    public static void main(String[] args)
    {
        /*AdjecencyList list = new AdjecencyList();
        int t;
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        while(t-- > 0){
            list.solve();
        }*/

        /*WithoutSRP srp = new WithoutSRP();
        srp.s = "RansherRaj";
        srp.l = 10;
        int len = srp.getLength();
        System.out.println("length : " + len);
        System.out.println("Area : " + srp.Area());*/

        /*Single_Responsibility_Principle1 single_responsibility_principle1 = new Single_Responsibility_Principle1("ransherraj");
        int len = single_responsibility_principle1.getLength();
        System.out.println("length:" + len);*/

        /*Single_Responsibility_Principle2 single_responsibility_principle2 = new Single_Responsibility_Principle2(10);
        int area = single_responsibility_principle2.Area();
        System.out.println("Area:" + area);*/

       /* Without_OpenClose without_openClose = new Without_OpenClose(2, 3, 4, 5);
        Shape shape = Shape.Square;
        System.out.println(shape);
        System.out.println("Area : " + without_openClose.Area(shape));*/

        /*********   Open Close Principle  *******/
        /*CircleArea ar = new CircleArea(20.3);
        System.out.println("Circle Area = " + ar.Area());

        SquareArea arSq = new SquareArea(20.5);
        System.out.println("Square Area = " + arSq.Area());

        ReactangleArea arRe = new ReactangleArea(20.7, 30.2);
        System.out.println("Rectangle Area = " + arRe.Area());*/
        /*********   Open Close Principle  *******/

        /*********   Liskov Principle  *******/

        /*Bird bird = new Bird();
        bird.fly();*/

        /*Ostrich ostrich = new Ostrich();
        ostrich.fly();*/

        /*Flyable flyable = new Flyable();
        Bird bird = new Bird(flyable);

        bird.Fly();


        Ostrich ostrich = new Ostrich(flyable);
        ostrich.Fly();*/

        /*********   Liskov Principle  *******/

        /**********DIP************/

        //UserService userService = new UserService();
        /*UserModule userModule = new UserModule();
        User user =  userModule.getUser();
        System.out.println(user.UserId + " " + user.name + " " + user.address);*/

        /**********DIP************/

        TwoSum twoSum = new TwoSum();
        twoSum.solve();


    }
}
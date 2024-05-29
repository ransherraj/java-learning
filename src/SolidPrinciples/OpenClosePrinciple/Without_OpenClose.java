package SolidPrinciples.OpenClosePrinciple;

public class Without_OpenClose {
    private int l, r, b, a;
    public Without_OpenClose(int len, int rad, int bre, int sid){
        l = len;
        b = bre;
        r = rad;
        a = sid;
    }

    //public Shape shape;
    public double Area(Shape shape){
        //System.out.println(l);
        double area = 0.0;
        switch (shape){

            case Rectangle -> area = AreaRectangle(l, b);
            case Circle -> area = AreaCircle(r);
            case Square -> area = AreaSquare(a);
        }
        return area;
    }

    public double AreaRectangle(int len, int br){

        return len * br;

    }

    public double AreaCircle(int r){
        Double pie = 3.14;
        return pie * r * r;
    }

    public double AreaSquare(int a){
        return a * a;
    }

}

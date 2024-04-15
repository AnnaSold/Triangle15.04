public class Triangle {
    Point a;
    Point b;
    Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    public static double calculateAreaTr(Point a, Point b, Point c){
        double ab = calculateLength(a, b);
        double bc = calculateLength(b,c);
        double ac = calculateLength(a,c);
        double p = (ab+bc+ac)/2;
        double trArea = (int) Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
        return  trArea;

    }

    public static double calculateLength(Point a, Point b){
        int xSq = (int) Math.pow((a.x-b.x), 2);
        int ySq = (int) Math.pow((a.y-b.y), 2);

        int d = (int) Math.sqrt(xSq + ySq);
        return d;

    }
}

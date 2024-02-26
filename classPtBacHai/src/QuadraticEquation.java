public class QuadraticEquation {
    //(-b + Math.sqrt(delta)) / (2 * a);
    //(-b - Math.sqrt(delta)) / (2 * a);
    private double a ,b,c;
    public QuadraticEquation(){

    }
    public QuadraticEquation(double a , double b , double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public  double geDiscriminant(){
        return (b*2) - (4*a*c);
    }
    public  double[] root(){
        double[] root ;
        double delta = geDiscriminant();
        if(delta > 0 ){
            root = new double[2];
            root[0] = (-b + Math.sqrt(delta)) / (2 * a);
            root[1] = (-b - Math.sqrt(delta)) / (2 * a);
        }else if (delta == 0){
            root = new double[1];
            root[0] = -b/(2*a);
        }else{
            root = new double[0];
        }

        return  root;
    }



}

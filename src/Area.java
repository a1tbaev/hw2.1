public class Area {
    int a;
    int b;
    int c;



    public int getArea(){
        int s = (a + b + c)/2;
        return (int) Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}

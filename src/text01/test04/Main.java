package text01.test04;

class Point{
    int x;
    int y;

    Point(int x,int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString(){
        return x+ "," +y;
    }


}
public class Main {
    public static void main(String[] args){
        Point p = new Point(3,4);

        System.out.println(p.toString()); //3, 4출력
    }
}

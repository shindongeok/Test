package kr.co.bit08;

class XY{
    private int x,y;

    XY(int x, int y){
        this.x=x;
        this.y=y;
    }
    int getx(){
        return x;
    }
    int gety(){
        return y;
    }
    //protected 자식쪽에서 사용가능.
    protected void move(int x, int y){
        this.x=x;
        this.y=y;
    }

}
class XYZ extends XY{
    String z;

    XYZ(int x, int y, String z){
        super(x,y);
        this.z=z;
    }

    void setxy(int x, int y){
        super.move(x,y);

    }

    void setcolor(String z){
        this.z=z;
    }
    void show(){
        System.out.println(getx() + "," +gety()+"인 " + z+"색!");
    }

}
public class Main {
    public static void main(String[] args){
        XYZ xyz= new XYZ(10,10, "red");
        xyz.setxy(20,30);
        xyz.setcolor("blue");
        xyz.show();
    }
}

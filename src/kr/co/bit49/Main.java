package kr.co.bit49;

import java.util.ArrayList;

class XY{
    int x,y;

    XY(int x, int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString(){
        return x+","+y;
    }

}


public class Main {
    public static void main(String[] args){
        ArrayList<XY> li= new ArrayList<XY>();
        li.add(new XY(3,4));
        li.add(new XY(3,5));
        li.add(new XY(5,7));

        li.remove(1);   //인덱스[1] 삭제

        for(int i=0; i<li.size();i++){
            XY xy= li.get(i);
            System.out.println(xy);

        }
    }
}

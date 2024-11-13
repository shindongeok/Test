package kr.co.bit60;
@FunctionalInterface //함수형 인터페이스 어노테이션
interface Fun{
    int cal(int x, int y);
}
//class F implements Fun{
//    @Override
//    public int cal(int x, int y){
//        return x+y;
//    }
//}
public class Lambda01 {
    public static void main(String[] args) {
//        F f = new F();
//        f.cal(1,2);
        Fun f=(x, y) -> {
            return x+y;
        };

        System.out.println(f.cal(1,2));

        Fun f2 = (x,y)->x+y;
        System.out.println(f2.cal(2,2));
    }
}

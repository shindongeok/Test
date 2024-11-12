package test.c1302;

class Container<T>{
    private T t;

    public void set(T t){
        this.t=t;
    }

    T get(){
        return t;
    }

}
public class Main {
    public static void main(String[] args){
        Container<String> container1 = new Container<String>();
        container1.set("홍길동");
        String str = container1.get();

        Container<Integer> container2 = new Container<Integer>();
        container2.set(6);
        int value = container2.get();
    }
}

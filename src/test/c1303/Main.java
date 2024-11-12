package test.c1303;


class Container<T1, T2>{
    private T1 name;
    private T2 age;

    public void set(T1 key, T2 value){
        this.name=key;
        this.age=value;
    }
    T1 getKey(){
        return name;
    }
    T2 getValue(){
        return age;
    }
}
public class Main {
    public static void main(String[] args){
        Container<String,String> container1 = new Container<String,String>();
        container1.set("홍길동","도적");
        String name1 = container1.getKey();
        String job = container1.getValue();

        Container<String,Integer> container2 = new Container<String,Integer>();
        container2.set("홍길동",35);
        String name2 = container2.getKey();
        int value = container2.getValue();
    }
}

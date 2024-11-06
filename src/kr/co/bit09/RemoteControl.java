package kr.co.bit09;
// 인터페이스!!
public interface RemoteControl {

    //인터페이스는 기본 메소드 자체가 추상메소드이다.
    public int add(int a, int b);
    public int add(int a);

    //만약 구현하고싶다면, default 사용 안그러면 추상메소드로 인식.
    default  void pr(){
        System.out.println("히히");
    }
}


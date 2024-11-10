package test.p472;

public class Main {
    public static void main(String[] args){
        String[] array = {"100", "1oo"};

        for(int i=0; i<=array.length; i++){
            try{
                int value = Integer.valueOf(array[i]);
                System.out.println("array[" + i + "]: " + value);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("배열 인덱스가 초과됨: " + e.getLocalizedMessage());
            }catch (NumberFormatException e){
                System.out.println("숫자로 변환할 수 없음: " + e.getLocalizedMessage());
            }
        }
    }
}

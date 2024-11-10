package test.t07;

class NotExistIDException extends Exception {
    public NotExistIDException() {
        super("존재하는 id가 아닙니다.");
    }
    public NotExistIDException(String message) {
        super(message);
    }
}

class WrongPasswordException extends Exception {
    public WrongPasswordException() {
        super("패스워드가 틀립니다.");
    }
    public WrongPasswordException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args){
        try{
             login("white", "12345");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try{
            login("blue", "54321");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void login(String id, String password) throws Exception{
        if(!id.equals("blue")){
            throw new NotExistIDException();
        }
        if(!password.equals("12345")){
            throw new WrongPasswordException();
        }
    }
}

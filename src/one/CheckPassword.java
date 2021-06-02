package one;

public class CheckPassword {
    private String password = "vasy";
    public boolean check(String userPassword){
        if(userPassword.equals(password)){
            return true;
        }
        return false;
    }
}

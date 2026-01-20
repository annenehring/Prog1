package Exceptions;

public class InvalidUsernameException extends Exception{

    public InvalidUsernameException(String message){
        super(message);
    }

    public static void registerUser(String username) throws InvalidUsernameException{
        if(username == null || username.length() < 5){
            throw new InvalidUsernameException("Der Username muss mindestens 5 Zeichen haben");
        }else{
            System.out.println("User angelegt " + username);
        }
    }

    public static void main(String[] args) {
        try{
            registerUser("Anne");

        }catch(InvalidUsernameException e){
            System.out.println("Fehler: " + e.getMessage());
        }


    }



}

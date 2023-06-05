package Class12;

public class E2StringDemo {
    public static void main(String[] args) {
// Write a code to check the username and password if the username and
        //passwrod are less than 8 characketrs this msg "Signup sucessful"
        //otherwise print "Username and pasword cant be more than 8 character"
        String userName="admin";
        String password="pas1234";

        if(userName.length()<8 && password.length()<8){
            System.out.println("Sign in successful");
        }else{
            System.out.println("Username and Password can't be more than 8 characters");
        }
    }
}

package Class8;

public class E5WhileAndBreak {
    public static void main(String[] args) {
//create a boolean variable summer store true in it and then write a loop
        //that runs as long as it is summer inside the loop check the temp to 85

        boolean summer = true;
       int temp=85;
        while(summer){
            if(temp<=100){
                System.out.println("Its good I enjoy Summers");}

                else{
                    System.out.println("Its Very Hot");
                    temp=temp+2;
                }
                break;
            }
        }


    }

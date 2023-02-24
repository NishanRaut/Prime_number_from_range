import java.util.Scanner;

public class prime_to_form{
    
    public static void main(String args[]){
        int initial_number,final_number, i,number=2;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Starting Number: ");
        initial_number=input.nextInt();
        System.out.println("To number you want: ");
        final_number=input.nextInt();
        System.out.println("Prime number from "+initial_number+" to "+final_number);
        for(i=initial_number;i<=final_number;){
            if(i==1){
                i++;
            }
            else{
            if(i%number==0){
                if(i==number){
                    System.out.println(i);
                    number=2;
                }
                i++;
            }
            else{
                number++;
            }
            }
        }
    }
}
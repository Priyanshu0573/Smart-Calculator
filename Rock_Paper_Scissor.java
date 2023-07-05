import java.util.Scanner;
import java.util.Random;
class Rock_Paper_Scissor{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("0:Rock,1:Paper,2:Scissor,3:end");
        Random num=new Random();
        
        int u_c=0,s_c=0,a=0;
        while(a<=5){
            System.out.println("Enter your Move");
            int u_i= sc.nextInt();
            switch (u_i){
                case 0:
                    System.out.println("you choose rock");
                    break;
                case 1:
                    System.out.println("you choose Paper");
                    break;
                case 2:
                    System.out.println("you choose Scissor");
                    break;
                case 3:
                    System.out.println("You choose to end this game");
            }
            int c_i=num.nextInt(2);
            switch (c_i){
                case 0:
                    System.out.println("Computer choose rock");
                    break;
                case 1:
                    System.out.println("Computer choose Paper");
                    break;
                case 2:
                    System.out.println("Computer choose Scissor");
                    break;
            }
            
            if (u_i==0 && c_i==1){
                // System.out.println("you choose rock and computer choose paper  ");
                System.out.println("you lost");
                s_c+=1;
            }
            else if (u_i==1 && c_i==2){
                // System.out.println("you choose paper and computer choose scissor  ");
                System.out.println("you lost");
                s_c+=1;
            }
            else if (u_i==2 && c_i==0){
                // System.out.println("you choose scissor and computer choose rock  ");
                System.out.println("you lost");
                s_c+=1;
            }
            else if (u_i==c_i){
                System.out.println("both choose the same ");
                System.out.println("The game draws");
            }
            else if (u_i==1 && c_i==0){
                // System.out.println("you choose paper and computer choose rock  ");
                System.out.println("you win");
                u_c+=1;
            }
            else if (u_i==2 && c_i==1){
                // System.out.println("you choose Scissor and computer choose paper  ");
                System.out.println("you win");
                u_c+=1;
            }
            else if (u_i==0 && c_i==2){
                // System.out.println("you choose rock and computer choose Scissor  ");
                System.out.println("you win");
                u_c+=1;
            }
            else if(u_i==3){
                System.out.println("you choose to end the game ");
                System.out.println("Thanks for playing");
                break;
            }
            else{
                System.out.println("invalid input");
            }
            a+=1;
        }
        System.out.println("your score is "+u_c);
        System.out.println("computer score is "+s_c);
        if (u_c>s_c){
            System.out.println("Congratulation!");
            System.out.println("you won the game");
        }
        else{
            System.out.println("Sorry");1
            System.out.println("you lost the game");
        }
    }
}
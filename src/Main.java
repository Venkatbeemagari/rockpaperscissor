import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        rock();
    }
    static void rock(){
       Scanner sc=new Scanner(System.in);
        ArrayList al=new ArrayList<>();
        al.add('r');
        al.add('p');
        al.add('s');
        int player1=0;
        int player2=0;
        while(true){
            if(player2==10 || player1==10){
                break;
            }
            System.out.println("Enter the player 1:");
            char a=sc.next().charAt(0);
            System.out.println("Enter the player 2:");
            char b=sc.next().charAt(0);
            if(al.contains(a) || al.contains(b)) {
                if((a=='r' && b=='s')||(a=='s' && b=='p')||(a=='p' && b=='r') ) {
                    player1 += 1;
                    System.out.println("player1 wins:"+player1);
                }
                else{
                    player2+=1;
                    System.out.println("Player 2 wins:"+" "+player2);
                }
            }
        }
    }
}
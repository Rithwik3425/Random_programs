import java.util.Random;
import java.util.Scanner;

class game{
    int userinput,number,noofgusses=0;

    public game(){
        Random rand = new Random();
        this.number = rand.nextInt(10);
    }

    public void takeuserinput(){
        if(noofgusses==0)
            System.out.println("Guess the number (1-10): ");
        else
            System.out.println("It's okay. Try again: ");
        Scanner s = new Scanner(System.in);
        userinput = s.nextInt();
    }

    public boolean iscorrect(){
        noofgusses++;
        if(userinput>number){
            System.out.println("Number is too high....");
        }
        else if(userinput<number){
            System.out.println("Number is too low....");
        }
        else if(userinput==number){
            System.out.println("You gussesd it right.\nYou gusses it in "+noofgusses+" attempts.");
            return true;
        }
        return false;
    }
}

public class guessthenumber  {
    public static void main(String[] args) {
        game g = new game();
        boolean isitright = false;
        while(!isitright){
            g.takeuserinput();
            isitright = g.iscorrect();
        }
    }
}

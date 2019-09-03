import java.util.Scanner;

/**
 *
 * @author leilaniigbeltran
 */
public class Translation {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String t, s;
        
        System.out.println("t: "); 
            t=sc.next();
        System.out.println("s: ");
            s=sc.next();
        String g = "";
 //Array that compares both t and s
       for(int x=t.length()-1;x>=0;x--){
    g = (String) (g + t.charAt(x));
       }  
              if (s.equals(g)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }



    }
    
}



package laboratorio1;
import java.util.Scanner;

public class Laboratorio1 {

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        int m = teclado.nextInt();
        boolean flag = true;
        char[][] array = new char[n][m];
        for(int i = 0; i < n; i++){
            for(int c = 0; c < m; c++){
                char color = teclado.next().charAt(0);
                array[i][c] = color;
                if(color=='B'||color=='W'){
                    flag = false;
                }
            }
        }
        if(flag == true){
            System.out.println("#Color");
        } else {
            System.out.println("#Black&White");
        }
        
    }
}
/*
Суммирование
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
       int sum = 0; 

     while (true){
          int numb1 = Integer.parseInt(reader.readLine());
          sum = sum + numb1;
          if (numb1 == -1){
              break;
          }
     }   
       
    System.out.println(sum +1);     
        
    }
}

public class Lab3Q365767 {
public static void main (String[] args) {
    int n = 0 , ans1 = 0, num3 = 0 , num5 = 0 , num15 = 0, sum = 0 , ans2 = 0;
       for (n = 0; num3 < 1000 - 1; n++){
            num3 = n * 3;
            ans1 = ans1 + num3;
       }
       for (n = 0; num5 < 1000 - 5; n++){
            num5 = n * 5;
            ans1 = ans1 + num5;
       }
       for (n = 0; num15 < 1000 - 10; n++){
            num15 = n * 15;
            ans2 = ans2 + num15;
       }
            sum = ans1 - ans2;
         System.out.println(sum);
    }   
}     


 


class Pyramid{

public static void main(String ar []){
int i, j, space, rows=6, a=1;
for (i = 0; i < rows; i++) {
      for (space = 1; space <= rows - i; space++)
         System.out.print(" ");
      for (j = 0; j <= i; j++) {
         if (j == 0 || i == 0)
            a = 1;
         else
            a = a * (i - j + 1) / j;
         System.out.print(a+ " ");
      }
      System.out.print("\n");
   }
 }
 
 }
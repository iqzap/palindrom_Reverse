public class Run{
    public static int checkme(int bil){
        String bil_s_normal   = String.valueOf(bil);
        StringBuilder bil_str = new StringBuilder(bil_s_normal);
        String bil_s_reversed = bil_str.reverse().toString();

        if(bil_s_normal.equals(bil_s_reversed)){
            System.out.println("--> " + bil_s_normal + " and " + bil_s_reversed + " <--");
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args){
       int x = 99;
       int y = 99;
       int res = x*y;
       int tmp;
       outerloop:
       for(int i=x;i>0;i--){
           for(int j=y;j>0;j--){
               res = i*j;
               tmp = checkme(res);
               if(tmp==1){
                   System.out.println("Palindrom paling gede : " + res);
                   System.out.println("Hasil Perkalian : " + i + " x " + j);
                   break outerloop;
               }
           }
       }
    }
}
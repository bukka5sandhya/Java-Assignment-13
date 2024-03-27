import java.util.Scanner; 
class main{ 
    public static void main (String[] args){ 
        Scanner input  = new Scanner (System.in); 
        int N = input.nextInt(); //5 input
        for(int i =1; i<=N;i++){
            for(int j=1; j<=N-i;j++){ 
                System.out.print(" "); 
            } for(int j=1; j<=i;j++){ 
                System.out.print(j+" "); 
            }System.out.println(); 
        }
        // lower  half diamond
        for(int i=N-1; i>=1; i--){ 
            for(int j=1;j<=N-i;j++){ 
                System.out.print(" "); 
            }
            for(int j=1;j<=i;j++){ 
                System.out.print(j+" ");
            } 
            System.out.println();
        }
    }
}
            
            
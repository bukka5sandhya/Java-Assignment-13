import java.util.Scanner;
class shadedDiamond{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt(); //input 5
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N-i;j++){
                System.out.print(" ");

            } for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<N-1;i++){
            String spaces =" ".repeat(i);
            System.out.println(spaces+"*"+"  ".repeat(N-i-2)+" *");
        }
        System.out.print("");
        System.out.println(" ".repeat(N-1)+"*");
    }
}
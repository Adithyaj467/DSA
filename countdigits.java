import java.util.Scanner;

/**
 * countdigits
 */
public class countdigits {
public static int count(int n){

    int counter=0;

    while(n>0){
        n=n/10;
        counter++;
    }
    
    
    return counter;

}
    public static void main(String[] args) {

        System.out.println("input number n");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        System.out.println("the number of digits is "+count(n));
    }
}
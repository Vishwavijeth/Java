import java.util.*;
class Convert {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int ascii = ch;
        int change_int = (int) ch;
        
        System.out.print("Interger equivalent of " + ch +" is" +ascii);
    }
}

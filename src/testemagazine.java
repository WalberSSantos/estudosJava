public class testemagazine {
    public static void main(String[] args){
        int a = 1;
        int b = 3;
        int result = 0;

        
        while (a < 5){
            result = b+=2*a;
            a+=1;
        }
        System.out.print(a + " " + result);
    }
    
}

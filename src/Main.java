public class Main {
    public static void main(String[] args) {
        System.out.println(f(5));
    }

    private static int f(int num){
        if(num <= 1){
            return 1;
        }else{
            return num + f(num - 1);
        }
    }
}
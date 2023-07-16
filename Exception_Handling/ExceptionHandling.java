public class ExceptionHandling {

    public static void main(String[] args) {
         try {
        int a = 0, b = 30;
        int x =b/a;
        System.out.println("result"+x);
    } catch (Exception e) {
        // TODO: handle exception
        System.out.println("Cannot divide number by Zero");
    }
    }
    
}

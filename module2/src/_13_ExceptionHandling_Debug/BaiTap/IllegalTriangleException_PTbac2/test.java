package _13_ExceptionHandling_Debug.BaiTap.IllegalTriangleException_PTbac2;

public class test {
    public static void main(String [] args)     {
        try {
            badMethod();
            System.out.print("A");
        }catch (RuntimeException ex){
            System.out.print("B");
        }catch (Exception ex1){
            System.out.print("C");
        }finally{
            System.out.print("D");
        }
        System.out.print("E");
    }
    public static void badMethod(){
        throw new RuntimeException();
    }
}

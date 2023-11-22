public class Exception {
    public static void main(String[] args) {
        int x=25;
        int y=0;
        int z;
        int a[]=new int[5];

        try{
            if(y==0)
            {
                throw new ArithmeticException("Divide by Zero");
            }
            a[5]=3;
        }
        catch (ArithmeticException e)
        {
            e.printStackTrace();
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            e.printStackTrace();
        }
        finally {
            System.out.println("Finally always executed");
       }
     }

}

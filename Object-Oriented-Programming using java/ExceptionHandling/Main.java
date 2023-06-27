package abhi.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
//            divide(a, b);
            // mimicking
//            throw new Exception("just for fun");
            String name = "Abhijeet";
            if (name.equals("Abhijeet")){
                throw new MyException("Name is Abhijeet");
            }
        } catch (MyException e){
            System.out.println(e.getMessage());
        } catch (ArithmeticException e){
            // we have to put sub exception above its parent one
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("normal exception");
        }finally {
            System.out.println("This will always execute");
        }
    }

    static int divide(int a, int b) throws ArithmeticException{
        if (b == 0){
            throw new ArithmeticException("Please do not divide by zero");
        }

        return a / b;
    }
}

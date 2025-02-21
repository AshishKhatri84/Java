public class ExceptionExample{
    public static void main(String args[]){
        try{
            @SuppressWarnings("unused")
            int data=100/0;
        } catch(Exception e){
            System.out.println("Exception- " + e.getMessage());
        } try{
            int data=25/5; //code do not throw any exception
            System.out.println(data);
        } catch(Exception e){  //catch won't be executed
            System.out.println(e);
        } finally{ //executed regardless of exception occurred or not
            System.out.println("finally block executed");
        }}}
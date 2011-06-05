public class Another
{
    public static void main( String[] args )
    {
        System.out.println( "This is a Java main in the ANOTHER class file." );
    }
    
    public static String prependHello(String text) {
        return "Hello " + text + "in the Another class";
    }
}

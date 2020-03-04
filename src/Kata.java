public class Kata {

    public static boolean divide ( int weight ) {
        return weight > 2 && weight % 2 == 0;
    }

    public static void main ( String[] args ) {
        System.out.println ( divide ( 2 ) );
        System.out.println ( divide ( 3 ) );
        System.out.println ( divide ( 4 ) );
        System.out.println ( divide ( 5 ) );
        System.out.println ( divide ( 6 ) );
    }
}
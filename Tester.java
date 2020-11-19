public class Tester {

  public static void main(String[]args) {
    RealNumber x = new RealNumber(0.0);
    RealNumber y = new RealNumber(1.0);
    RealNumber z = new RealNumber(1.00001);
    System.out.println();

    System.out.println( "x = " + x.getValue() );
    System.out.println( "y = " + y.getValue() );
    System.out.println( "z = " + z.getValue() );
    System.out.println();

    System.out.println("EQUALS");
    System.out.print("x.equals(y) ");
    if ( x.equals(y) == false) System.out.println("passed");
    else System.out.println("failed");
    System.out.print("x.equals(z) ");
    if ( x.equals(z) == false) System.out.println("passed");
    else System.out.println("failed");
    System.out.print("y.equals(z) ");
    if ( y.equals(z) == true) System.out.println("passed");
    else System.out.println("failed");
    System.out.println();

    System.out.println("ADD");
    System.out.print("x.add(y) ");
    if ( (x.add(y)).getValue() == 1.0) System.out.println("passed");
    else System.out.println("failed");
    System.out.print("x.add(z) ");
    if ( (x.add(z)).getValue() == 1.00001) System.out.println("passed");
    else System.out.println("failed");
    System.out.print("y.add(z) ");
    if ( (y.add(z)).getValue() == 2.00001) System.out.println("passed");
    else System.out.println("failed");
    System.out.println();

  }

}

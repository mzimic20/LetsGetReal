public class Tester {

  public static void main(String[]args) {
    System.out.println("----- RealNumber -----");

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

    System.out.println("MULTIPLY");
    System.out.print("x.multiply(y) ");
    if ( (x.multiply(y)).getValue() == 0.0 * 1.0) System.out.println("passed");
    else System.out.println("failed");
    System.out.print("x.multiply(z) ");
    if ( (x.multiply(z)).getValue() == 0.0 * 1.00001) System.out.println("passed");
    else System.out.println("failed");
    System.out.print("y.multiply(z) ");
    if ( (y.multiply(z)).getValue() == 1.0 * 1.00001) System.out.println("passed");
    else System.out.println("failed");
    System.out.println();

    System.out.println("DIVIDE");
    System.out.print("x.divide(y) ");
    if ( (x.divide(y)).getValue() == 0.0) System.out.println("passed");
    else System.out.println("failed");
    System.out.print("x.divide(z) ");
    if ( (x.divide(z)).getValue() == 0.0) System.out.println("passed");
    else System.out.println("failed");
    System.out.print("y.divide(z) ");
    if ( (y.divide(z)).getValue() == 1 / 1.00001) System.out.println("passed");
    else System.out.println("failed");
    System.out.println();

    System.out.println("SUBTRACT");
    System.out.print("x.subtract(y) ");
    if ( (x.subtract(y)).getValue() == 0.0 - 1.0) System.out.println("passed");
    else System.out.println("failed");
    System.out.print("x.subtract(z) ");
    if ( (x.subtract(z)).getValue() == 0.0 - 1.00001) System.out.println("passed");
    else System.out.println("failed");
    System.out.print("y.subtract(z) ");
    if ( (y.subtract(z)).getValue() == 1.0 - 1.00001) System.out.println("passed");
    else System.out.println("failed");
    System.out.println();

    System.out.println("----- RationalNumber -----");

    RationalNumber a = new RationalNumber(1, 2);
    RationalNumber b = new RationalNumber(1, 3);
    RationalNumber c = new RationalNumber(2, 9);
    RationalNumber d = new RationalNumber(0, 999);
    RationalNumber e = new RationalNumber(3, 0);
    System.out.println();

    System.out.println( "a = " + a.getValue() );
    System.out.println( "b = " + b.getValue() );
    System.out.println( "c = " + c.getValue() );
    System.out.println( "d = " + d.getValue() );
    System.out.println( "e = " + e.getValue() );
    System.out.println();

    System.out.println("GETNUMERATOR");
    System.out.print("a.getNumerator() ");
    if ( a.getNumerator() == 1) System.out.println("passed");
    else System.out.println("failed");
    System.out.print("b.getNumerator() ");
    if ( b.getNumerator() == 1) System.out.println("passed");
    else System.out.println("failed");
    System.out.print("c.getNumerator() ");
    if ( c.getNumerator() == 2) System.out.println("passed");
    else System.out.println("failed");
    System.out.print("d.getNumerator() ");
    if ( d.getNumerator() == 0) System.out.println("passed");
    else System.out.println("failed");
    System.out.print("e.getNumerator() ");
    if ( e.getNumerator() == 0) System.out.println("passed");
    else System.out.println("failed");
    System.out.println();

    System.out.println("GETDENOMINATOR");
    System.out.print("a.getDenominator() ");
    if ( a.getDenominator() == 2) System.out.println("passed");
    else System.out.println("failed");
    System.out.print("b.getDenominator() ");
    if ( b.getDenominator() == 3) System.out.println("passed");
    else System.out.println("failed");
    System.out.print("c.getDenominator() ");
    if ( c.getDenominator() == 9) System.out.println("passed");
    else System.out.println("failed");
    System.out.print("d.getDenominator() ");
    if ( d.getDenominator() == 999) System.out.println("passed");
    else System.out.println("failed");
    System.out.print("e.getDenominator() ");
    if ( e.getDenominator() == 1) System.out.println("passed");
    else System.out.println("failed");
    System.out.println();

  }

}

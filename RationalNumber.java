public class RationalNumber extends RealNumber {

  private int numerator, denominator;

  /**Initialize the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1 instead
  *@param nume the numerator
  *@param deno the denominator
  */
  public RationalNumber(int nume, int deno){
    super(0.0);
    if (deno == 0) {
      numerator = 0;
      denominator = 1;
    }
    else {
      numerator = nume;
      denominator = deno;
    }
  }

  public double getValue(){
    return ((double)(numerator)) / denominator;
  }

  /**
  *@return the numerator
  */
  public int getNumerator(){
    return numerator;
  }
  /**
  *@return the denominator
  */
  public int getDenominator(){
    return denominator;
  }

  public boolean equals(RationalNumber other) {
    if ( this.getNumerator() == other.getNumerator() && this.getDenominator() == other.getDenominator() ) return true;
    else return false;
  }
  /**
  *@return a new RationalNumber that has the same numerator
  *and denominator as this RationalNumber but reversed.
  */
  public RationalNumber reciprocal(){
    RationalNumber recip = new RationalNumber(denominator, numerator);
    return recip;
  }

  /**
  *@return the value expressed as "3/4" or "8/3"
  */
  public String toString(){
    if (denominator == 1) return "" + numerator;
    else if (denominator < 0) return "-" + numerator + "/" + (denominator * -1);
    else return "" + numerator + "/" + denominator;
  }

  /**Calculate the GCD of two integers.
  *@param a the first integers
  *@param b the second integer
  *@return the value of the GCD
  */
  private static int gcd(int a, int b){
    /*use euclids method or a better one*/
    //http://sites.math.rutgers.edu/~greenfie/gs2004/euclid.html
    int temp = b;
    if (a < b) {
      b = a;
      a = temp;
    }
    if (a % b == 0) return b;
    else return gcd(b, a % b);
  }

  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  private void reduce(){
    int gcd = gcd(numerator, denominator);
    numerator = numerator / gcd;
    denominator = denominator / gcd;
  }
  /******************Operations Return a new RationalNumber!!!!****************/
  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
    int newNum = this.getNumerator() * other.getNumerator();
    int newDen = this.getDenominator() * other.getDenominator();
    RationalNumber product = new RationalNumber(newNum, newDen);
    product.reduce();
    return product;
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    int newNum = this.getNumerator() * other.getDenominator();
    int newDen = this.getDenominator() * other.getNumerator();
    RationalNumber quotient = new RationalNumber(newNum, newDen);
    quotient.reduce();
    return quotient;
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    int newDen = this.getDenominator() * other.getDenominator();
    int newNum = this.getNumerator() * other.getDenominator() + other.getNumerator() * this.getDenominator();
    RationalNumber sum = new RationalNumber(newNum, newDen);
    sum.reduce();
    return sum;
  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    int newDen = this.getDenominator() * other.getDenominator();
    int newNum = this.getNumerator() * other.getDenominator() - other.getNumerator() * this.getDenominator();
    RationalNumber difference = new RationalNumber(newNum, newDen);
    difference.reduce();
    return difference;
  }

}

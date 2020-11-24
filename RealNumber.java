public class RealNumber extends Number {

  private double value;

  public RealNumber(double v){
    value = v;
  }

  public double getValue(){
    return value;
  }

  public String toString(){
    return "" + value;
  }
  //---------ONLY EDIT BELOW THIS LINE------------

  /*
  *Return a new RealNumber that has the value of:
  *the sum of this and the other
  */
  public RealNumber add(RealNumber other){
    //other can be ANY RealNumber, including a RationalNumber
    //or other subclasses of RealNumber (that aren't written yet)
    double a = this.getValue() + other.getValue();
    RealNumber sum = new RealNumber(a);
    return sum;
  }

  /*
  *Return a new RealNumber that has the value of:
  *the product of this and the other
  */
  public RealNumber multiply(RealNumber other){
    double a = this.getValue() * other.getValue();
    RealNumber product = new RealNumber(a);
    return product;
  }

  /*
  *Return a new RealNumber that has the value of:
  *this divided by the other
  */
  public RealNumber divide(RealNumber other){
    double a = this.getValue() / other.getValue();
    RealNumber quotient = new RealNumber(a);
    return quotient;
  }

  /*
  *Return a new RealNumber that has the value of:
  *this minus the other
  */
  public RealNumber subtract(RealNumber other){
    double a = this.getValue() - other.getValue();
    RealNumber difference = new RealNumber(a);
    return difference;
  }

}

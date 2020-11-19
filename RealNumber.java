public class RealNumber{

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
  *Return true when the values are within 0.001% of eachother.
  *Special case: if one is exactly zero, the other must be exactly zero.
  */
  public boolean equals(RealNumber other){
    if (this.getValue() == 0 && other.getValue() == 0) return true;
    else {
      double ratio = this.getValue() / other.getValue();
      if (ratio <= 1.00001 && ratio >= .99999) return true;
      else return false;
    }
  }

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

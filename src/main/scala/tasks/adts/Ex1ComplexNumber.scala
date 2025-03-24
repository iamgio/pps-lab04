package tasks.adts

/*  Exercise 1: 
 *  Complete the implementation of ComplexADT trait below, so that it passes
 *  the test in ComplexTest.
 */

object Ex1ComplexNumbers:

  trait ComplexADT:
    type Complex
    def complex(re: Double, im: Double): Complex
    extension (complex: Complex)
      def re(): Double
      def im(): Double
      def sum(other: Complex): Complex
      def subtract(other: Complex): Complex
      def asString(): String

  object BasicComplexADT extends ComplexADT:

    // Change assignment below: should probably define a case class and use it?
    type Complex = (Double, Double)
    def complex(re: Double, im: Double): Complex = (re, im)

    extension (complex: Complex)
      def re(): Double = complex match
        case (re, _) => re

      def im(): Double = complex match
        case (_, im) => im

      def sum(other: Complex): Complex = (complex, other) match
        case ((re1, im1), (re2, im2)) => this.complex(re1 + re2, im1 + im2)

      def subtract(other: Complex): Complex = other match
        case (re, im) => sum(this.complex(-re, -im))

      def asString(): String = complex match
        case (re, 0) => re.toString
        case (0, im) => s"${im}i"
        case (re, im) if im > 0 => s"$re + ${im}i"
        case (re, im) => s"$re - ${-im}i"

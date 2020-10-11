import java.util.Objects;

/**
 * Abstraction for a rational number.
 */
public class Rational {
    private int numerator;
    private int denominator;

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    /**
     * Computes the greatest common divisor between p and q.
     * @param p the first operand
     * @param q the second operand
     * @return the gcd between both operands
     */
    private int gcd(int p, int q) {
        while (q != 0) {
            int temp = q;
            q = p % q;
            p = temp;
        }
        return p;
    }

    /**
     * Computer the least common multiple between p and q.
     * @param p the first operand
     * @param q the second operand
     * @return the lmm between both operands
     */
    private int lmm(int p, int q) {
        return (p * q) / gcd(p, q);
    }

    /**
     * Adds two rational numbers.
     * @param b the right operand
     * @return the addition of this rational to b
     */
    public Rational plus(Rational b) {
        // TODO: Completar
        lmm(1, 1); // TODO: remove this line
        return new Rational(0, 1);
    }

    /**
     * Substracts two rational numbers.
     * @param b the right operand
     * @return the subtraction of this rational to b
     */
    public Rational minus(Rational b) {
        // TODO: Completar
        return new Rational(0, 1);
    }

    /**
     * Multiplies two rational numbers.
     * @param b the right operand
     * @return the multiplication of this rational to b
     */
    public Rational times(Rational b) {
        // TODO: Completar
        return new Rational(0, 1);
    }

    /**
     * Divides two rational numbers.
     * @param b the right operand
     * @return the division of this rational by b
     */
    public Rational divides(Rational b) {
        // TODO: Completar
        return new Rational(0, 1);
    }

    /**
     * Checks if the given rational is equal to this.
     * @param b the right operand
     * @return true, if both are equal, false otherwise
     */
    public boolean isEqual(Rational b) {
        // TODO: Completar
        return false;
    }

    /**
     * Overload java internal equality semantics.
     * @param b the other parameter
     * @return true if both are equal, false otherwise
     */
    @Override
    public boolean equals(Object b) {
        if (this == b) {
            return true;
        }
        if (b == null || getClass() != b.getClass()) {
            return false;
        }
        return this.isEqual((Rational) b);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    /**
     * Shows the real number as fraction, the signal normalized
     * so that it appears only in the numerator, if any.
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        String signal = this.numerator < 0 || this.denominator < 0 ? "-" : "";

        return signal + Math.abs(this.numerator) + "/" + Math.abs(this.denominator);
    }

}

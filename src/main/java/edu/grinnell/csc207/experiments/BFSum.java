package edu.grinnell.csc207.experiments;

import edu.grinnell.csc207.util.BigFraction;

import java.io.PrintWriter;

/**
 * Sum all the fractions provided on the command line.
 *
 * @author Samuel A. Rebelsky.
 * @author Nicky Moreno Gonzalez & Drew Fargo
 */
public class BFSum {
  /**
   * Run the program.
   *
   * @param args
   *   The command-line arguments. Each should be a string that represents
   *   a fraction.
   *
   * @throws Exception
   *   When something goes seriously wrong, such as creating an invalid
   *   fraction or failing to set up a printwriter.
   */
  public static void main(String[] args) throws Exception {
    PrintWriter pen = new PrintWriter(System.out, true);
    BigFraction sum = new BigFraction(0, 1);   // Zero
    for (String arg : args) {
      sum = sum.add(new BigFraction(arg));
    } // for
    pen.println(sum);
    pen.close();
  } // main(String[])
} // class BFSum

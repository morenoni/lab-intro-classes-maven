package edu.grinnell.csc207.experiments;

import java.io.PrintWriter;
import edu.grinnell.csc207.util.*;;
/**
 * Experiments with Counters.
 *
 * @author Nicky Moreno Gonzalez & Drew Fargo
 */
public class CounterExperiment {
  /**
   * Run some experiments on counters.
   *
   * @param args
   *   Command-line arguments
   *
   * @throws Exception
   *   If something goes unexpectedly wrong
   */
  public static void main(String[] args) {
    PrintWriter pen = new PrintWriter(System.out, true);
    
    Counter c1 = new Counter();
    Counter c2 = new Counter();
    c1.increment();
    c1.increment();
    c2.increment();
    pen.println("c1: " + c1);
    pen.println("c2: " + c2);
    
    pen.close();
  } // main(String[])
} // class CounterExperiment

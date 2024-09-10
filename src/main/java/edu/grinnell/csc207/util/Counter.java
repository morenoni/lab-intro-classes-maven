package edu.grinnell.csc207.util;

/**
 * Simple counters.
 *
 * Nicky Moreno Gonzalez & Drew Fargo
 */
public class Counter {
  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+
  private int count;
  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+
  /**
   * Generates a new counter with count 0.
   */
  public Counter() {
    this.count = 0;
  } // Counter

  /**
   * Generate a new counter with count n
   * @param n Starting count
   */
  public Counter(int n) {
    this.count = n;
  } // Counter

  // +---------+-----------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Increments the count by one.
   */
  public void increment() {
    this.count++;
  } // increment
  /**
   * toString
   * 
   */
  public String toString(){
    return  String.valueOf(this.count);
  }

  /**
   * Resets the current count.
   */
  public void reset() {
    this.count = 0;
  }
  /**
   * Returns current count.
   * @return current count.
   */
  public int get() { 
    return this.count;
  }
} // class Counter

package com.gkvm.hackerrank.algorithms.implementation

/** Divisible Sum Pairs
  * https://www.hackerrank.com/challenges/divisible-sum-pairs
  *
  * Created by gkvm on 10/9/16.
  */
object DivisibleSumPairs {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    var n = sc.nextInt();
    var k = sc.nextInt();
    var a = new Array[Int](n);
    for(a_i <- 0 to n-1) {
      a(a_i) = sc.nextInt();
    }
    var count = 0;
    for(i <- 0 to n-1){
      for(j <- i+1 to n-1){
        if((a(i)+a(j))%k ==0) {
          count += 1
        }
      }
    }
    println(count)
  }
}

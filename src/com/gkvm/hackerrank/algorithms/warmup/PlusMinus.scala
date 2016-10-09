package com.gkvm.hackerrank.algorithms.warmup

/**
  * Created by gkvm on 9/28/16.
  */
object PlusMinus {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    var n = sc.nextInt();
    var arr = new Array[Int](n)
    var positive, negative, zero: Int = 0
    for (arr_i <- 0 to n - 1) {
      arr(arr_i) = sc.nextInt()
      if (arr_i > 0) positive += 1
      else if (arr_i < 0) negative += 1
      else zero += 1
    }
    val pf: Float = (positive:Float)/ n
    val nf: Float = (negative:Float) / n
    val zf: Float = (zero:Float) / n
    println(pf)
    println(nf)
    println(zf)
  }
}

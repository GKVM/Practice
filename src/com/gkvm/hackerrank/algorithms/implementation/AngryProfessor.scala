package com.gkvm.hackerrank.algorithms.implementation

/** Angry Professor
  * https://www.hackerrank.com/challenges/angry-professor
  *
  * Created by gkvm on 10/9/16.
  */
object AngryProfessor {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    val t = sc.nextInt();
    var a0 = 0;
    while (a0 < t) {
      var n = sc.nextInt();
      var k = sc.nextInt();
      var a = new Array[Int](n);
      for (a_i <- 0 to n - 1) {
        a(a_i) = sc.nextInt();
      }
      val e = a.count(_ <= 0)
      //println(s"e = $e , k= $k")
      if (e < k) println("YES") else println("NO")
      a0 += 1
    }
  }
}

package com.gkvm.hackerrank.algorithms.implementation

/** https://www.hackerrank.com/challenges/kangaroo
  *
  */
/**
  * Created by gkvm on 10/1/16.
  */
object Kangaroo {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    var x1 = sc.nextInt();
    var v1 = sc.nextInt();
    var x2 = sc.nextInt();
    var v2 = sc.nextInt();
    if(x1>x2 && v1>=v2) {println("NO"); return}
    if(x2>x1 && v2>=v1) {println("NO"); return}
    var distanceDiffPrev = Integer.MAX_VALUE;
    var distanceDiff = Math.abs(x1-x2);
    while(distanceDiff < distanceDiffPrev){
      x1+=v1;
      x2+=v2;
      if(x1==x2){println("YES"); return}
      distanceDiffPrev = distanceDiff
      distanceDiff = Math.abs(x1-x2)
    }
    println("NO")
  }
}

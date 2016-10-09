package com.gkvm.hackerrank.algorithms.warmup

/** Given a square matrix of size N x N, calculate the absolute difference between the sums of its diagonals.

Input Format

The first line contains a single integer, . The next  lines denote the matrix's rows, with each line containing space-separated integers describing the columns.

Output Format

Print the absolute difference between the two sums of the matrix's diagonals as a single integer.

Sample Input

3
11 2 4
4 5 6
10 8 -12
Sample Output

15
Explanation

The primary diagonal is:
11
      5
            -12

Sum across the primary diagonal: 11 + 5 - 12 = 4

The secondary diagonal is:
            4
      5
10
Sum across the secondary diagonal: 4 + 5 + 10 = 19
Difference: |4 - 19| = 15
  *
  */

/**
  * Created by gkvm on 9/28/16.
  */
object DiagonalDifference {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    val n = sc.nextInt();
    val a = Array.ofDim[Int](n,n);
    for(a_i <- 0 to n-1) {
      for(a_j <- 0 to n-1){
        a(a_i)(a_j) = sc.nextInt();
      }
    }
    var d1 = 0
    var d2 = 0
    for(a_i <- 0 to n-1) {
      for(a_j <- 0 to n-1){
        if(a_i == a_j)
          d1+=a(a_i)(a_j)
        if(a_i + a_j == n-1)
          d2 += a(a_i)(a_j)
      }
    }
    println(Math.abs(d1-d2))
  }
}
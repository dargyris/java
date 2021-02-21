package org.example.algos.selection;

/*  SELECTION ALGOS:
> Quick select, online selection (live), median of medians, ds
> Select max / min: kth order statistic.
> Sorting: O(NlogN){to find multiple k-th order statistics}. Inefficient for max or min --> ds: Heap/Map: O(1)

Quickselect: Tony Hoare: k-th smallest / largest element in unordered array
> O(N) - O(N^2){bad pivot choice}, in-place
> random pivot, partition array: all smaller elements than pivot to left and larger to right.
recursion on one part instead of both (quicksort).
> partition: random pivot -> swap with last element -> compare against all elements -> place smaller to left partition
-> swap with last index value
*/

import java.util.Random;

public class Main {
}

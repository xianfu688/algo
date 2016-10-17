package com.baiguomin.algo;

import com.baiguomin.algo.sort.FastSort;
import com.baiguomin.algo.sort.HeapSort;
import com.baiguomin.algo.sort.InsertSort;
import com.baiguomin.algo.sort.MergeSort;
import com.baiguomin.algo.sort.ShellSort;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        InsertSort.main(null);
        ShellSort.main(null);
        HeapSort.main(null);
        MergeSort.main(null);
        FastSort.main(null);
        /**
         *  inserSort cost time is10528
         *	shellSort cost time is7762
         *	heapSort cost time is3896
         *	mergeSort cost time is2049
         *	fastSort cost time is1647
         */
    }
}

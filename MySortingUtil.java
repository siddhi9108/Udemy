package com.siddhi.sorting.util;

import java.util.List;

import com.siddhi.sorting.algorithm.BubbleSort;

public class MySortingUtil {
	public List<String> sort(List<String> n) {
		BubbleSort bs = new BubbleSort();
		return bs.sort(n);
	}
}

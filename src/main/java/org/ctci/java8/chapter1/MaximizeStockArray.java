package org.ctci.java8.chapter1;

public class MaximizeStockArray {

	public int getMaxStockProfit(int[] is) {
		int maxProfit = 0;
		int currentMin = is[0];
		for(int i = 1; i < is.length; i++) {
			int potentialMax = is[i] - currentMin;
			if(potentialMax > maxProfit) {
				maxProfit = potentialMax;
			}
			if(is[i] < currentMin) {
				currentMin = is[i];
			}
		}
		return maxProfit;
	}

}

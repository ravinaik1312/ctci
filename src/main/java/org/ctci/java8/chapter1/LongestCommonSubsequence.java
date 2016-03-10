package org.ctci.java8.chapter1;

public class LongestCommonSubsequence {

	public int getLongestCommonSubsequence(String string, String string2) {
		if(string==null || string2==null) {
			return 0;
		}
		int m = string.length();
		int n = string2.length();
		
		if(m==0 || n==0) {
			return 0;
		}
		
		int lcs[][] = new int[m+1][n+1];
		for(int i=0; i<=m; i++) {
			lcs[i][0] = 0;
		}
		for(int j=0; j<=n; j++) {
			lcs[0][j] = 0;
		}
		
		for(int i = 1; i<=m; i++) {
			for (int j = 1; j<=n; j++) {
				if(string.charAt(i-1) == string2.charAt(j-1)) {
					lcs[i][j] = 1 + lcs[i-1][j-1];
				}
				else {
					lcs[i][j] = Math.max(lcs[i][j-1], lcs[i-1][j]);
				}
			}
		}
		
		return lcs[m][n];
		
	}

}

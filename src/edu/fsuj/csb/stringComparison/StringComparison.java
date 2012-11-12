package edu.fsuj.csb.stringComparison;

public class StringComparison {
	public static int positionOfFirstDifference(String s1, String s2){
		int l=Math.min(s1.length(), s2.length());
		for (int i=0; i<l; i++){
			if (s1.charAt(i)!=s2.charAt(i)) return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		String s1="Ach du Scheiße!";
		String s2="Ach du Scheibenkleister!";
		int p=positionOfFirstDifference(s1, s2);
	  System.out.println("'"+s1+"' und '"+s2+"' unterscheiden sich an Position "+p+" ("+s1.charAt(p)+"/"+s2.charAt(p)+")");
	  System.out.println("Unterschied: '"+s1.substring(p)+"' / '"+s2.substring(p)+"'");
  }
}

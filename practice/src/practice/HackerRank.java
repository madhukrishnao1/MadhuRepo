package practice;
import java.util.*;
public class HackerRank {

	public static void main(String[] args) {
		/*
		 * String s="madh"; String s2=""; int n=0; while(s2.length()<=18) {
		 * s2=s2.concat(s); } System.out.println(s2); for(int i=0;i<s2.length();i++) {
		 * if(s2.charAt(i)=='a') { n++; } } System.out.println(n);
		 */
		/*
		 * int h=1; int n=1; int k=1; System.out.println(h); while(n<6) {
		 * 
		 * switch(k) { case 1: { h=h*2; k++; System.out.println(h);
		 * 
		 * break; } case 2: { h=h+1; k--; System.out.println(h);
		 * 
		 * break; } } n++; }
		 */
		/*
		 * int []a= {0,0,1,0,0,1,0}; int jumps=0; for(int i=0;i<a.length-1;) {
		 * if(a[i+2]==0) { //System.out.println("in"); jumps++; //System.out.println(i);
		 * i=i+2; //System.out.println(i); } else if(a[i+1]==0) {
		 * //System.out.println("sec");
		 * 
		 * i=i+1;
		 * 
		 * jumps++; } } System.out.println(jumps);
		 */
		/*
		 * String s="madam"; String s1="madadm";
		 * 
		 * 
		 * for(int i=0;i<s1.length();i++) { String s2=""; String s3=""; for(int
		 * j=0;j<s1.length();j++) { if(i!=j) { s2=s2+s1.charAt(j); } } for(int
		 * k=s2.length()-1;k>=0;k--) {
		 * 
		 * s3=s3+s2.charAt(k); } System.out.println(s3); if(s3.equals(s2)) {
		 * System.out.println(i); }
		 * 
		 * }
		 */
		String s="test1 u9u miyt po6";
		Map<Integer,String>map=new TreeMap<>();
		String[]s1=s.split(" ");
		
		
		for(int i=0;i<s1.length;i++)
		{
			int sum=0;
			String value="";
			for(int j=0;j<s1[i].length();j++)
			{
				if(Character.isDigit(s1[i].charAt(j)))
				{
					sum=sum+Character.getNumericValue(s1[i].charAt(j));
				}
				else
				{
				   value=value+	s1[i].charAt(j);
				}
			}
			map.put(sum, value);
		}
		
		for(Map.Entry<Integer,String> o:map.entrySet())
		{
			System.out.print(o.getValue()+" ");
		}
		
	}

}

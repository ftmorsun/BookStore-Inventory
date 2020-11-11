package leetcode;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 /*
        You have 10 minutes to complete....
Write a program to check if two given Strings are Anagram of each other.
Your function should return true if two Strings are Anagram, false otherwise.
A string is said to be an anagram if it contains the same characters and same length, but in a different order,
For example; "army" and "Mary" are anagrams.
You can ignore cases for this problem.
*/

	}
	  public static void isAnagram(String s1, String s2){
		  ​
		           if(s1.length()!=s2.length() || s1.isEmpty() || s2.isEmpty()){
		               System.out.println(s1 + " and " + s2 + " are not anagram Strings");
		           }else{
		               String a1[] = s1.toLowerCase().split("");
		               Arrays.sort(a1);
		  ​
		               String a2[] = s2.toLowerCase().split("");
		               Arrays.sort(a2);
		  ​
		               if(Arrays.equals(a1,a2)){
		                   System.out.println(s1 + " and " + s2 + " are anagram Strings");
		               }else{
		                   System.out.println(s1 + " and " + s2 + " are not anagram Strings");
		               }
		           }


}

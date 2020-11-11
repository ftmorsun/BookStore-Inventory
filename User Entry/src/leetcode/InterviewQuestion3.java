package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class InterviewQuestion3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Ali, Ali, Veli, Ali";
		
		String[] words=s.split(" ");
		System.out.println(Arrays.toString(words));
		
		List<String> wordList = new ArrayList<String>();
        Arrays.stream(words).forEach(t->wordList.add(t.replaceAll("\\W","")));
        System.out.println(wordList);
        
        
        HashMap<String,Integer> countMap = new HashMap<>();
        
           for(int i=0; i<wordList.size(); i++){
            
            if(countMap.containsKey(wordList.get(i))){
                
                int numOfWords = countMap.get(wordList.get(i));
                
                countMap.put(wordList.get(i), numOfWords+1);
                
            }else{
                
                countMap.put(wordList.get(i), 1);
                
            }
        }
      System.out.println(countMap);



	}

}

package july16.Hashmap;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfInteger {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,1,2,3,4,5};
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
	
		for(int i : arr) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}else {
				map.put(i, 1);
			}
		
		
		}
		for(Map.Entry<Integer, Integer> pair :map.entrySet()) {
			System.out.println(pair.getKey()+"--->"+pair.getValue());
		}
		System.out.println(map.size());
	}

}

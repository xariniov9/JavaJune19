package fifteenthLecture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Class1 {
	
	public static ArrayList<Integer> removeDuplicates(int [] arr) {
		ArrayList<Integer> result = new ArrayList<>();
		HashSet<Integer> hs = new HashSet<>();
		
		for(int i=0; i<arr.length; i++) {
			if(!hs.contains(arr[i])) {
				result.add(arr[i]);
				hs.add(arr[i]);
			}
		}
		return result;
	}
	
	public static int numPairs(int [] arr, int k) {

		HashMap<Integer, Integer> mp = new HashMap<>();
		for(int i=0; i<arr.length; i++) {
			if(mp.containsKey(arr[i])) {
				int value = mp.get(arr[i]);
				mp.put(arr[i], value+1);
			} else {
				mp.put(arr[i], 1);
			}
		}
		
		int ans = 0;
		for(int i=0; i<arr.length; i++) {
			Integer pairs = mp.get(k - arr[i]);
			if(pairs != null) {
				ans += pairs;
				if(arr[i] == k - arr[i])
					ans--;				
			}
		}
		return ans/2;
	}
	
	public static void main(String[] args) {
		HashMap<Character, Integer> mp = new HashMap<>();
		String s = "abac";
		
		for(int i=0; i<s.length(); i++) {
			if(mp.containsKey(s.charAt(i))) {
				int value = mp.get(s.charAt(i));
				mp.put(s.charAt(i), value+1);
			} else {
				mp.put(s.charAt(i), 1);
			}
		}
		for(int i=0; i<s.length(); i++) {
			System.out.println(mp.get(s.charAt(i)));
		}
		
		System.out.println(mp.get('z')); // returns null
		
		HashSet<Integer> hs = new HashSet<>();
		// get first repeating element
		int [] arr = {11, 22, 5, 11, 5, 7, 5};
		for(int i=0; i<arr.length; i++) {
			if(hs.contains(arr[i])) {
				System.out.println("repeating element " + arr[i]);
				break;
			}
			hs.add(arr[i]);
		}
		
		ArrayList<Integer> res = removeDuplicates(arr);
		for(int i=0; i<res.size(); i++) {
			System.out.print(res.get(i) + " ");
		}
		System.out.println();
		
		System.out.println(numPairs(arr, 10));
	}
}












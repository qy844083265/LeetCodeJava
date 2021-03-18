package java.question.BackTracking.q0017;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	List<String> result = new ArrayList<>();
	StringBuilder sb = new StringBuilder();

	public List<String> letterCombinations(String digits) {
		if (digits == null || digits.length() == 0) {
			return result;
		}
		Map<Integer, String> map = new HashMap<>();
		map.put(0, "");
		map.put(1, "");
		map.put(2, "abc");
		map.put(3, "def");
		map.put(4, "ghi");
		map.put(5, "jkl");
		map.put(6, "mno");
		map.put(7, "pqrs");
		map.put(8, "tuv");
		map.put(9, "wxyz");
		goBack(map, 0, digits);
		return result;

	}

	public void goBack(Map<Integer, String> map, int index, String digits) {
		if (digits.length() == sb.length()) {
			result.add(sb.toString());
			return;
		}
		String val = map.get(digits.charAt(index) - '0');
		for (char ch : val.toCharArray()) {
			sb.append(ch);
			goBack(map, index + 1, digits);
			sb.deleteCharAt(sb.length() - 1);
		}
	}
}

package java.question.BackTracking.q0049;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
 * @author qinye
 *
 */
public class Solution {
	public List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> map = new HashMap<>();
		for (String string : strs) {
			String s = sortString(string);
			if (map.containsKey(s)) {
				map.get(s).add(string);
			} else {
				List<String> list = new ArrayList<>();
				list.add(string);
				map.put(s, list);
			}
		}

		return new ArrayList<>(map.values());
	}

	public String sortString(String string) {
		char[] ch = string.toCharArray();
		Arrays.sort(ch);
		return Arrays.toString(ch);
	}

	public List<List<String>> groupAnagramsCount(String[] strs) {
		if (strs == null || strs.length == 0) {
			return new ArrayList<>();
		}
		Map<String, List<String>> map = new HashMap<>();
		for (String string : strs) {
			char[] ch = new char[26];
			for (char c : string.toCharArray()) {
				ch[c - 'a']++;
			}
			String s = Arrays.toString(ch);
			if (map.containsKey(s)) {
				map.get(s).add(string);
			} else {
				List<String> list = new ArrayList<>();
				list.add(string);
				map.put(s, list);
			}
		}

		return new ArrayList<>(map.values());
	}
}

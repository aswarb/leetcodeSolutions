class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        s_dict = {k:0 for k in s}
        t_dict = {k:0 for k in t}

        for char in s:
            s_dict[char] += 1
        for char in t:
            t_dict[char] += 1
        
        return s_dict == t_dict

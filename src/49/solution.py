class Solution:

    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        table = {}

        for word in strs:
            sorted_word = tuple(sorted(word))
            if sorted_word in table.keys():
                table[sorted_word].append(word)
            else:
                table[sorted_word] = [word]

        return table.values()

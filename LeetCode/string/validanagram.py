class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        # Method 1
        dic =  {}
        # Check if character in dictionary, if not, set it to 1 (count). If in, add 1 count
        for i in s:
            if i not in dic:
                dic[i] = 1
            else:
                dic[i] += 1
        # Check it character in dictionary, if not, return False as won't be anagram anyway
        # If in dictionary, remove 1 count
        for j in t:
            if j not in dic:
                return False
            else:
                dic[j] -= 1
        # If value in dictionary is not equals zero, it is not an anagram. 
        # If value in dictionary is equals zero, all characters would have been removed exactly, hence it is anagram
        for val in dic.values():
            if val != 0:
                return False
        return True

        # Method 2

        # return sorted(s) == sorted(t)
    

        



class Solution:
    def lengthOfLastWord(self, s: str) -> int:

        wordList = s.split()
        lastWord = wordList[-1]
        length = len(lastWord)
   
        return length
class Solution(object):
    def mostWordsFound(self, sentences):
        """
        :type sentences: List[str]
        :rtype: int
        """
        count = 0
        
        for i in sentences:
            count = max(len(i.split()), count)
               
        return count
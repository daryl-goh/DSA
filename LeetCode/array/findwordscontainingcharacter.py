class Solution:
    def findWordsContaining(self, words: List[str], x: str) -> List[int]:
        res = []

        for index, element in enumerate(words):
            if x in element:
                res.append(index)
        return res
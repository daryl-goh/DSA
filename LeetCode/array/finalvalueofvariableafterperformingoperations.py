class Solution:
    def finalValueAfterOperations(self, operations: List[str]) -> int:
        # set if conditions for ++XX XX++ --XX XX--
        # return final value

        res = 0

        for i in range(len(operations)):
            if (operations[i] == '++X' or operations[i] == 'X++'):
                res += 1
            elif (operations[i] == '--X' or operations[i] == 'X--'):
                res -= 1

        return res

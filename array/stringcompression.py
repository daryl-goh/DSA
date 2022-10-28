class Solution(object):
    
    def compress(self, chars):
        """
        :type chars: List[str]
        :rtype: int
        """

        length = len(chars)

        # make it a bit faster
        if length < 2:
            return length

        # the start position of the contiguous group of characters we are currently reading.
        anchor = 0

        # position to Write Next
        # we start with 0 then increase it whenever we write to the array
        write = 0

        # we go through each caharcter till we fiand a pos where the next is not equal to it
        # then we check if it has appeared more than once using the anchor and r(read) pointers
        # 1. iterate till we find a diffrent char
        # 2. record the no. of times the current char was repeated
        for pos, char in enumerate(chars):

            # check if we have reached the end or a different char
            # check if we are end or the next char != the current
            if (pos + 1) == length or char != chars[pos+1]:
                chars[write] = char
                write += 1

                # check if char has been repeated
                # have been duplicated if the read pointer is ahead of the anchor pointer
                if pos > anchor:
                    # check no. of times char has been repeated
                    repeated_times = pos - anchor + 1

                    # write the number
                    for num in str(repeated_times):
                        chars[write] = num
                        write += 1

                # move the anchor to the next char in the iteration
                anchor = pos + 1

        return write

        # Solution Below Works Partially
        # first, second = 0, 0

        # while second < len(chars):
        #     chars[first] == chars[second]
        #     count = 1

        #     while second + 1 < len(chars) and chars[second] == chars[second + 1]:

        #         second += 1
        #         count += 1
            
        #     if count > 1:
        #         for num in str(count):
        #             chars[first + 1] = num
        #             first += 1
            
        #     first, second = first + 1, second + 1
        # return first
        


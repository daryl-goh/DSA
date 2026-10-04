"""
Definition of Interval:
class Interval(object):
    def __init__(self, start, end):
        self.start = start
        self.end = end
"""

class Solution:
    def canAttendMeetings(self, intervals: List[Interval]) -> bool:
        # sort the list (will be sorted based on first value of each tuple)
        # compare second value of first tuple (e1) with the first value of second tuple (s2) - if e1 <= s2 then return False else return True
        intervals.sort(key=lambda x: x.start)
        for i in range(len(intervals) - 1):
            if intervals[i].end > intervals[i + 1].start:
                return False
        return True
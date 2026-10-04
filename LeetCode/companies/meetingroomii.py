"""
Definition of Interval:
class Interval(object):
    def __init__(self, start, end):
        self.start = start
        self.end = end
"""

class Solution:
    def minMeetingRooms(self, intervals: List[Interval]) -> int:
        # 1. current_count tracks rooms in use right now, highest_count tracks the max seen (the answer)
        # 2. split intervals into two separate arrays, one of start times and one of end times
        # 3. sort both arrays independently
        # 4. use two pointers, one per array, and walk through both in time order
        # 5. if the next start time is earlier than the next end time, a new room is needed -
        #    increment current_count, update highest_count, advance start_pointer
        # 6. if the next end time is earlier than the next start time, a room frees up -
        #    decrement current_count, advance end_pointer
        # 7. if they're equal, it's a tie - one meeting ends exactly as another starts,
        #    net zero, not a real overlap - so skip current_count and advance both pointers
        # 8. stop once every meeting has started, since current_count can't hit a new peak
        #    after that point
        current_count = 0
        highest_count = 0

        start_time = []
        end_time = []

        for i in range(len(intervals)):
            start_time.append(intervals[i].start)
            end_time.append(intervals[i].end)

        start_time.sort()
        end_time.sort()

        start_pointer = 0
        end_pointer = 0

        while start_pointer < len(start_time):
            if start_time[start_pointer] < end_time[end_pointer]:
                current_count += 1
                highest_count = max(highest_count, current_count)
                start_pointer += 1
            elif start_time[start_pointer] > end_time[end_pointer]:
                current_count -= 1
                end_pointer += 1
            else:
                start_pointer += 1
                end_pointer += 1
        return highest_count

class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        stones.sort()
        while stones:
            s1 = stones.pop() 
            if not stones:
                return s1
            s2 = stones.pop()
            if s1 > s2:
                # we need to insert the remaining stone (s1-s2) into the list
                for i in range(len(stones)+1):
                    if i == len(stones) or stones[i] >= s1-s2:
                        stones.insert(i, s1-s2)
                        break
            # else s1 == s2; both stones are destroyed
        return 0
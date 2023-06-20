class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        hm = {}
        result = []
        for x in nums:
            hm[x] = hm.get(x, 0) + 1

        values_sorted = (sorted(list(set(hm.values())), reverse=True))
        # print(values_sorted)

        counter = 0
        i = 0
        while counter < k:
            keys = [key for key in hm if hm[key]==values_sorted[i]]
            # print(keys)
            for key in keys:
                if counter < k:
                    result.append(key)
                    counter += 1
            i += 1



        return result
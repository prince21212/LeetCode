class Solution:
    def findLeastNumOfUniqueInts(self, arr: List[int], k: int) -> int:
        f =collections.Counter(arr)
        
        removed =0
        for v in sorted(f.values()):
            if k >= v:
                k -= v
                removed += 1
                
        return len(f) - removed       
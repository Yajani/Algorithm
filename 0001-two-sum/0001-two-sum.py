class Solution(object):
    def twoSum(self, nums, target):
        memo = {}  # {숫자: 인덱스}
        for i, v in enumerate(nums):
            needed_number = target - v
            if needed_number in memo:
                return [memo[needed_number], i]
            memo[v] = i


# memo에 지금까지 본 숫자와 그 숫자의 인덱스를 저장함

# 현재 숫자 v에 대해 target - v가 이미 memo에 있다면,

# 그것과 현재 인덱스 i가 정답

# 조건을 만족하는 두 숫자를 찾으면 바로 리턴
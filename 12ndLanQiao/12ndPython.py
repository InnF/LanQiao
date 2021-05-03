# https://blog.csdn.net/m0_46405703/article/details/112912541
# 第十二届蓝桥杯模拟赛Python组（第一期）

""" 
# T1
print( sum(1 for i in range(1, 2021) if 2020 % i == 0) )
"""

""" 
# T2
print( 100 * 1024 // 4 )
"""

""" 
# T3
n = 2020
print( n * (n - 1) // 2 )
"""

""" 
# T4
print( sum(len(str(i)) for i in range(1, 2021)) )
"""

""" 
# T5
nums = [87,39,35,1,99,10,54,1,46,24,74,62,49,13,2,80,24,58,8,14,83,23,97,85,3,2,86,10,71,15]

ans = 0
while len(nums) > 1:
    min_num = min(nums)
    min_idx = nums.index(min_num)
    for i in range(min_idx):
        if nums[i] > min_num:
            ans += 1
    nums.pop(min_idx)
print(ans)
"""

""" 
# T6
i, h = int(input()), int(input())
product = i * h
print( product / 2 if product & 1 else product // 2 )
"""

""" 
# T7
from datetime import date

month = int(input())
day = int(input())

try:
    date(year=2021, month=month, day=day)
    print('yes')
except ValueError:
    print('no')
"""

""" 
# T8 [BFS]
# Method 1:

from collections import deque
word = input()
t = int(input())
que = deque()
que.append([word])
for _ in range(t):
    level = que.popleft()
    sub = []
    for node in level:
        for i in range(len(node)):
            sub.append(node[:i] + node[i + 1:])
    que.append(sub)
print( min(que[0]) )


# Method 2:
# 不需要去存储每一层去掉一个字符后的所有字符串，每一次得到子字符串后，只需要对最小的字符串进行拆分就可以了
word = input()
t = int(input())
for _ in range(t):
    level = []
    for i in range(len(word)):
        level.append(word[:i] + word[i+1:])
    word = min(level)
print(word)
"""


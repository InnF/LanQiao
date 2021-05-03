"""
# A: 门牌制作
from collections import Counter
print(sum(Counter(str(i))['2'] for i in range(1, 2021)))
"""

"""
# B: 寻找 2020
matrix = []
with open('B.txt') as fr:
    for line in fr:
        matrix.append(line.strip())

ans = 0
rows, cols = len(matrix), len(matrix[0])
for r in range(rows):
    for c in range(cols):
        if c <= cols - 4:
            if matrix[r][c:c+4] == '2020':
                ans += 1
        if r <= rows - 4:
            if matrix[r][c] + matrix[r + 1][c] + matrix[r + 2][c] + matrix[r + 3][c] == '2020':
                ans += 1
        if r <= rows - 4 and c <= cols - 4:
            if matrix[r][c] + matrix[r + 1][c + 1] + matrix[r + 2][c + 2] + matrix[r + 3][c + 3] == '2020':
                ans += 1
print(ans)
"""

"""
# C: 跑步锻炼
from datetime import datetime
from datetime import timedelta
# start_time = datetime(year=2000, month=1, day=1)
# end_time = datetime(year=2020, month=10, day=1)
from datetime import date
start_time = date(2000, 1, 1)
end_time = date(2020, 10, 1)
delta_time = timedelta(days=1)
ans = 0
while start_time <= end_time:
    if start_time.weekday() == 0 or start_time.day == 1:
        ans += 2
    else:
        ans += 1
    start_time += delta_time

print(ans)
"""

"""
# D: 蛇形填数
# 法一
snake = []
rows = 1
i = 0
while True:
    level = []
    for row in range(rows):
        i += 1
        level.append(i)
    if rows % 2 == 0:
        level.reverse()
    snake.append(level)
    rows += 1
    if i > 1000:
        break
# for row in snake:
#     print(row)
print(snake[38][19])

# 法二
n = 20
n = n * 2 - 1 # 算出 20 行 20 列在蛇形数组的哪一行
ans, sum = 0, 0
for i in range(1, n + 1):
    sum += i
# ans = (sum + sum - n + 1) // 2
ans += 20
print(ans)

# 法三
n = 1
for i in range(20):
    n += i * 4
print(n)
"""

"""
# E:排序
'''
# 1
因为是需要尽可能使用较短长度的字符串来构成100次的相邻字符的交换，并且要求字典序是最小的而且只能交换相邻的字母，
所以我们需要使用尽可能使用排列在前面的字符，并且使用逆序排列，考虑完全逆序的情况这样才可以使得字符串的交换次数尽可能多也就是字符串最短，
那么需要长度为15的完全逆序的字符串，因为完全逆序交换的次数为：(1 + 2 + ... + 14 + 15) = 105，所以剩下的我们就需要在完全逆序的字符串：
"onmlkjihgfedcba"进行调整使其构成能够使用100次的相邻字母的字符串，105次只比100次多了5次，所以我们需要将其中多余的5次消除掉，
分析字符串的特点可以知道后面字典序较大的字符往前调整，位于其前面的字符串的相对位置是不变的，所以我们需要在逆序的"onmlkjihgfedcba"字符串第6个字母放到最前面，
这样当排列好了"abcdefghi"之后j就位于其后面，这样字母j这个位置是不用调整的，所以恰好消除了多余的5次，最后交换的次数为 14 + 13 + ... + 6 + 4 + 3 + 2 + 1 = 100次。
所以结果为：jonmlkihgfedcba。
主要还是找出其中的规律，先考虑极端的情况再进行调整

# 2
【解析】：冒泡排序，要求字符串最短，那就假设完全逆序，设长度为n，则移动次数为 n*(n-1)/2，要求移动次数恰好大于100，则 n=15；移动次数105。要求字典序最小，
则把第六个字符移动到第一个位置，前五个字符后移一位。纯逻辑推导，无代码。
思路
最坏情况（完全逆序）下，交换次数为n(n-1)/2次；
移动次数为100，则n至少为15。也就是说，最后结果的字符串的长度至少15（低于15,它根本连交换100次的要求都达不到）。接下来再和题目要求的字典序最小一起考虑。
字典序最小→前15个字母abcdefghijklmno（这种情况下是105次交换）。
故我们要减少5次,且保证字典序最小→把j（第6个字符）移到第一位，即前五次比较不交换。
得到答案jonmlkihgfedcba
'''
def bubble_sort(arr):
    count = 0
    for i in range(len(arr) - 1):
        for j in range(len(arr) - i - 1):
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j] 
                count += 1
    return count
print(bubble_sort(list('jonmlkihgfedcba')))
"""

"""
# F: 成绩统计
from decimal import Decimal, ROUND_HALF_UP
N = int(input())
excellent = 0
pass_ = 0
for _ in range(N):
    score = int(input())
    if score >= 85:
        excellent += 1
    if score >= 60:
        pass_ += 1
print(excellent, pass_)
print('{}%'.format( Decimal(pass_ / N * 100).quantize(Decimal('1'), rounding=ROUND_HALF_UP) ))
print('{}%'.format( Decimal(excellent / N * 100).quantize(Decimal('1'), rounding=ROUND_HALF_UP) ))
"""

"""
# G: 单词分析
from collections import Counter
ans = Counter(input()).most_common(1)[0]
print(ans[0])
print(ans[1])
"""


# H: 数字三角形
'''
DP推导+奇偶判断。在输入数组的时候进行数组值的计算，因为只能向左或者右走，即我现在所在的位置坐标是从上一层这个位置的左边或者上边进行跳转得到的坐标，
通过选择最大值进行跳转，更新数组的值，由于向左向右不能超过1，所以通过奇偶判断层数，如果是奇数，最后的位置第n层，第（n/2+1）位置上的数字，如果是偶数，
则需要判断第n层，第（n/2）位置的数字和第n层第（n/2+1）位置的数字，选大的。
注意我的数组下标是从1开始。
'''
from sys import stdin
read = lambda tp: list(map(tp, stdin.readline().split()))
N = read(int)[0]
triangle = [read(int) for _ in range(N)]

for i in range(1, len(triangle)):
    for j in range(len(triangle[i])):
        if j == 0:
            triangle[i][j] += triangle[i - 1][j]
        elif j == i:
            triangle[i][j] += triangle[i - 1][j - 1]
        else:
            triangle[i][j] += max(triangle[i - 1][j], triangle[i - 1][j - 1])

if N % 2 == 0:
    print( max(triangle[-1][ N // 2], triangle[-1][ N // 2 + 1]) )
else:
    print( triangle[-1][ N // 2] )


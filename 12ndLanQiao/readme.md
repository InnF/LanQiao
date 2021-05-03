#### 栈

自带的 list 实现了栈
 + 入栈：append
 + 出栈：pop

#### 队列

`from Queue import Queue`

不推荐使用这个类，因为它在执行同步的时候使用的信号机制会拖慢执行速度

推荐使用 `deque`，即双向队列

```python
from collections import deque
```

  + 入队：append
  + 出队：popleft

还有 `appendleft`，`pop` 操作


#### 堆 / 优先队列

`heapq`

提供了把数组转化成堆的方法，即 `heapify(table)`。转化后的数组是完全二叉树，根节点下标为0的元素非空。

`heap = []`

 + 插入新元素：`heapq.heappush(heap, element)`
 + 抽出最小元素: `heapq.heappop(heap)`
 + 插入新元素同时取出最小元素: `heapq.heappushpop(heap, element)`

heapq 默认是最小堆，转换成最大堆需要修改元素
```python
max_heap = []

# 法一：
# 最大堆插入新元素
heapq.heappush(max_heap, -elm);
# 最大堆取出最大元素
-heapq.heappop(max_heap);

# 如果不想取出元素时仍要注意正负号，可参考法二
# 法二：
# 将插入元素改为 tuple，默认按照第 0 个元素比较大小
heapq.heappush(max_heap, (-elm, elm))
# 取出最大元素，忽略第 0 个元素即可
_, max_elm = heapq.heappop(max_heap)

```

#### 获取字符 ASCII 

 `ord()`
 

#### 二分查找库


`bisect` 用于**有序序列**的插入和查找


+ 查找: 
   + `bisect_left(arry, item, lo=0, hi=len(array))`
     + 返回的插入点 i 将数组 arr 分成两个部分，arr[:i] (右侧 < i)和 arr[i:] (左侧 >= i)
   + `bisect(array, item, lo=0, hi=len(array))`
   + `bisect_right(arry, item, lo=0, hi=len(array))` 返回的插入点是 arr 中已存在元素 item 的右侧。
+ 插入:
   + `insort_left(arry, item, lo=0, hi=len(array))` 
     + 将 item 插入到一个有序序列 arr 里，并维持其有序。如果 arr 有序的话，这相当于 `a.insert(bisect.bisect_left(arr, item, lo, hi), item)`
   +  `insort(array, item, lo=0, hi=len(array))`
   + `insort_right(arry, item, lo=0, hi=len(array))` 把 item 插入到 arr 中已存在元素 item 的右侧。

#### 双指针题

**两个指针同向滑动，即“滑动窗口”**

目前的感受是，都有一个共同特点是要求得 “连续的某一区间” 的答案，这就说明区间内的顺序不能打乱，所以要沿着数组去搜索。

有两个要控制的指针：
  + 右指针目前看来大部分情况下可以直接搜索的末尾，每次迭代加1
  + 左指针就需要考虑两个步骤
    + 更新条件：一般是区间不满足某一限定条件时进行更新
    + 迭代步长：一种是用循环更新步长知道满足条件，一种是直接更新到右指针的位置

目前很多题目只要能转换成求“最长增长子序列”问题，就可以用“滑动窗口”来做

**两个指针相向滑动，就是“双指针”**


#### itertool

LeetCode T1423

```python
class Solution:
    def maxScore(self, cardPoints: List[int], k: int) -> int:
        from itertools import accumulate, chain, islice
        N = len(cardPoints)
        p = [0]
        p.extend(accumulate(chain(islice(iter(cardPoints), N-k, None), islice(iter(cardPoints), 0, k))))
        return max(p[l] - p[l-k] for l in range(k, k*2+1))
```

## Collections

[https://docs.python.org/zh-cn/3.8/library/collections.html](https://docs.python.org/zh-cn/3.8/library/collections.html)

## 有序容器（第三方库）

不知道可以不可以用，~但是 python 没有内建的 BST 数据结构~(有bisect)

[Python Sorted Container](http://www.grantjenks.com/docs/sortedcontainers/)

```python
from sortedcontainers import SortedList
```


## 排序

排序默认是升序，如果有多个需要排序的元素，比如一个列表，其中每个元素有两个值，第一个元素升序，若相等则第二个元素降序

```python
envelopes.sort(key=lambda x: (x[0], -x[1]))
```

### 拷贝问题

获取数组的拷贝

```
arr[:]
```

生成一个二维数组

```
// wrong, 这种形式是对一维数组进行拷贝，最终没法保存正确结果
arr = [[0] * n] * n
// right
arr = [[0] * n for _ in range(n)]
```

## python 排序比较

**T179** 写一个自定义类，继承比较类型，重写 `__lt__` 方法

```python
class Solution:
    def largestNumber(self, nums: List[int]) -> str:
        if not nums:
            return '0'
        nums.sort(key=Compare)
        return '0' if nums[0] == 0 else "".join(map(str,nums))
class Compare(str):        
    def __lt__(x, y):
        return x+y>y+x
```

使用 `from functools import cmp_to_key` 来比较两个参数，默认的 `sort(key=lambda)` 方法只接收一个参数

```python
class Solution:
    def largestNumber(self, nums: List[int]) -> str:
        from functools import cmp_to_key
        cmp = lambda a, b: int(b + a) - int(a + b)
        ans = sorted(map(str, nums), key=cmp_to_key(cmp))
        return '0' if ans[0] == '0' else ''.join(ans)
```

问题在于为啥这里只能是转换成数字来比较，而不能用字符串直接比较


## 缓存机制，用于记忆化递归

在 Python 中，有一个实现记忆化递归的神器，就是 `functool` 模块的 lru_cache 装饰器，它可以把函数的输入和输出结果缓存住，在后续调用中如果遇到了相同的输入，直接从缓存里面读。顾名思义，它使用的是 LRU （最近最少使用）的缓存淘汰策略。

```
@functools.lru_cache(maxsize=None, typed=False)
```

 + `maxsize` 为最多缓存次数，如果为 None，则无限制；
 + `typed=True` 时，表示不同参数类型的调用将分别缓存。

参考：
 + [87. Scramble String](https://leetcode-cn.com/problems/scramble-string/solution/fu-xue-ming-zhu-ji-yi-hua-di-gui-by-fuxu-r98z/)
 + [Python 缓存机制与 functools.lru_cache](http://kuanghy.github.io/2016/04/20/python-cache)
  
## 有序容器

```
from sortedcontainers import SortedSet
```

## 正确的四舍五入

使用 `Decimal` 模块，[decimal.Decimal.quantize](https://docs.python.org/zh-cn/3/library/decimal.html#decimal.Decimal.quantize)

如果要用严格执行四舍五入，需要指定 `rounding` 参数为 `ROUND_HALF_UP` ，否则该方法与 `round` 函数效果一样，

```
from decimal import Decimal, ROUND_HALF_UP
Decimal('2.5').quantize(Decimal('1'), rounding=ROUND_HALF_UP)
# Decimal('3')

origin_num = Decimal('11.245')
answer_num = origin_num.quantize(Decimal('0.00'), rounding=ROUND_HALF_UP)
```

特别注意，一旦要做精确计算，那么就不应该再单独使用浮点数，而是应该总是使用`Decimal('浮点数')`。否则，当你赋值的时候，精度已经被丢失了，建议全程使用`Decimal`

## 前缀和

```
In [1]: from itertools import accumulate

In [2]: arr = [4, 6, 22]

In [3]: list(accumulate(arr))
Out[3]: [4, 10, 32]
```

其他 itertools 可以参考 [https://docs.python.org/3/library/itertools.html](https://docs.python.org/3/library/itertools.html)

## 负数的取模与除法

python 的负数在取模和做除法的时候有点问题

```python
In [3]: -123 // 10
Out[3]: -13

In [4]: -120 // 10
Out[4]: -12

In [5]: -123 % 10
Out[5]: 7

In [6]: (-123) % 10
Out[6]: 7
```

```python
class Solution:
    def reverse(self, x: int) -> int:
        INT_MIN, INT_MAX = -2**31, 2**31 - 1

        rev = 0
        while x != 0:
            # INT_MIN 也是一个负数，不能写成 rev < INT_MIN // 10
            if rev < INT_MIN // 10 + 1 or rev > INT_MAX // 10:
                return 0
            digit = x % 10
            # Python3 的取模运算在 x 为负数时也会返回 [0, 9) 以内的结果，因此这里需要进行特殊判断
            if x < 0 and digit > 0:
                digit -= 10

            # 同理，Python3 的整数除法在 x 为负数时会向下（更小的负数）取整，因此不能写成 x //= 10
            x = (x - digit) // 10
            rev = rev * 10 + digit
        
        return rev
```
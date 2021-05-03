```cpp
accumulate(arr.begin(), arr.end(), 0)  //累加和
__builtin_popcount() // 计算二进制中多少个1
is_sorted(arr.begin(), arr.end()) // 检查是否有序，递增
is_sorted(arr.rbegin(), arr.rend()) // 检查是否有序，递减
*max_element(dp.begin(), dp.end()); // 获取最大值，返回的是地址，加 * 返回的就是地址
lower_bound(arr.begin(), arr.end(), num) // 返回一个迭代器对象，指向范围 [first, last) 内的第一个【大于或等于】num 的元素，如果没找到就返回 last (即arr.end())
arr.lower_bound(num) // 如果 arr 是被维护有序的数据结构，那么可以直接使用 lower_bound
upper_bound(arr.begin(), arr.end(), num) // 返回一个迭代器对象，指向范围 [first, last) 内的第一个【大于】 num 的元素，如果没找到就返回 last 
arr.upper_bound(num) // 如果 arr 是被维护有序的数据接哦古，那么可以直接使用 upper_bound


//ctype
isdigt(c); // 判断是不是数字

// 查找
auto res = find(vec.begin(), vec.end(), target); // 查找target 的位置，找得到就返回该处指针，找不到返回 vec.end()
find_if(beg, end, pred);

// 填充
fill(vec.begin(), vec.end(), fill_val); // 将容器范围内的值用fill_val填充
fill_n(vec.begin(), size, fill_val); // 将vec [0, size) 范围内的值用 fil_val 填充


// 排序
sort(beg, end)
sort(vec.begin(), vec.end(), compare); // 默认从小到大排序（可不写compare，也可指定),
stable_sort(beg, end)
stable_sort(beg, end, compare); // 保持等长元素间的字典序

// 拷贝
copy(beg, end, dst);

// 转换
transform(beg, end, dst, lambda) // 将输入序列按照 lambda 变换值后传递给输出序列

unique(beg, end); // 将容器不一样的值排到前面，重复的值排到最后，返回最后一个不一样的值的指针，可以利用这个指针向后删除重复值
unique(beg, end, pred);

// 迭代
foe_each(beg, end, lambda)

// 插值
back_inserter // 对支持 push_back 的容器往后插值
front_inserter // 对支持 push_front 的容器向前插值

replace(beg, end, old_val, new_val);
replace_if(beg, end, pred, new_val);
replace_copy(beg, end, dest, old_val, new_val);
replace_copy_if(beg, end, dest, pred, new_val);

// 翻转
reverse(beg, end);
reverse_copy(beg, end, dest);

// 删除
remove_if(beg, end, pred);
remove_copy_if(beg, end, dest, pred);

// 迭代器
vec.begin() or vec.cbegin()  ----->    vec.end() or vec.cend()
            ||                                   ||
 vec.rend() or vec.crend()   <----- vec.rbegin() or vec.crbegin()

r: reverse
c: const
```

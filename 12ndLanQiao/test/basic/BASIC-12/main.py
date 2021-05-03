from sys import stdin

read = lambda tp: list(map(tp, stdin.readline().split()))

n = read(int)[0]
for _ in range(n):
    x = read(str)[0]
    print(str(oct(int(x, 16)))[2:])

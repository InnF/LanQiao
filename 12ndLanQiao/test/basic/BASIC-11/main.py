from sys import stdin

read = lambda tp: list(map(tp, stdin.readline().split()))

n = read(str)[0]
print(int(n, 16))

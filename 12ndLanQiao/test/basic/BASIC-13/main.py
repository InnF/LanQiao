from sys import stdin

read = lambda tp: list(map(tp, stdin.readline().split()))

n = read(int)[0]
arr = read(str)
arr.sort(key=lambda x: int(x))
print(' '.join(arr))

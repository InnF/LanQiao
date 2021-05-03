from sys import stdin

read = lambda tp: list(map(tp, stdin.readline().split()))

n = read(int)[0]
print( (n * (n + 1) ) // 2)

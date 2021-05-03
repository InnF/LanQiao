from sys import stdin

r = lambda tp: list(map(tp, stdin.readline().split()))

A, B = r(int)
print(A + B)
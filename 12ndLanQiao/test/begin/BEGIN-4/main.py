from sys import stdin
from math import pi

read = lambda tp: list(map(tp, stdin.readline().split()))

n = read(int)[0]
f1, f2 = 1, 1
for i in range(n - 1):
    f1, f2 = f2 % 10007, (f1 + f2) % 10007
print(f1)

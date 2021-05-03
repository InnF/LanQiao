from sys import stdin
from math import pi

read = lambda tp: list(map(tp, stdin.readline().split()))

r = read(int)[0]
print('%.7f' % (pi * r ** 2))

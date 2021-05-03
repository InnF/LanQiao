from sys import stdin

read = lambda tp: list(map(tp, stdin.readline().split()))

n = read(int)[0]
for i in range(10000, 1000000):
    a = str(i)
    if a == a[::-1] and sum((int(d) for d in a)) == n:
        print(i)

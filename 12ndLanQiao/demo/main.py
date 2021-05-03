from sys import stdin

read = lambda tp: list(map(tp, stdin.readline().split()))

def solve(N):
    A, B = N
    print("%d" % ( A + B))

while True:
    N = read(int)
    if len(N) == 0:
        break
    solve(N)

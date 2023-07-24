'''logic
    1. 일단 입력값을 다 받음
    2. 각 행마다의 min 값을 입력받아
    3. 행 넘어갈 때마다 max 값 갱신'''

N, M = map(int, input().split())

result = 0

for i in range(N):
    numbers = list(map(int, input().split()))
    minNum = min(numbers)
    result = max(result, minNum)

print(result)
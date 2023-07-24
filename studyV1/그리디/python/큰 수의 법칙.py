'''logic
    1. 숫자 list를 입력받은 후 오름차순으로 정렬시킴.
    2. 문제에 주어진 조건에 맞춰 큰 수를 도출해낸다.'''

N, M, K = map(int, input().split())
numList = list(map(int, input().split()))

# 오름차순 정렬
numList.sort()

# 첫번째, 두번째로 큰 수 저장
one = numList[-1]
two = numList[-2]

# 조건에 맞춰 더해야되는 횟수를 count 변수에 각각 저장시킨다.
oneCount = (M // K) * K
twoCount = M % K

# 결과 도출
count = 0
for i in range(oneCount):
    count += one
for j in range(twoCount):
    count += two

print(count)
'''logic
    1. 1번 계산을 나머지가 0이 될때까지 계속 한다.
    2. 나머지가 0이되면, 몫이 1이 될때까지 2번 연산을 수행한다.
    
    결론적으로 나눗샘을 많이 해야 계산 횟수가 적어진다.'''

N, K = map(int, input().split())
count = 0

# 일단 모든 계산은 N >= K가 성립해야함.
while N >= K:
    # logic 1 수행
    while N % K != 0:
        N -= 1
        count += 1
    # logic 2
    N //= K
    count += 1

# 만약 N이 1이 아니라면? 1이 될 때까지
while N > 1:
    N -= 1
    count += 1
    
print(count)
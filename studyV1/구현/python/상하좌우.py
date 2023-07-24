'''logic
    1. 상하좌우 이동 문제
    2. 범위 밖으로 벗어나는 좌표는 무시 처리 해야됨.
    3. x, y 좌표 입력받아서 이동할 때마다 해당 움직임 만큼 좌표 계산 처리해줘야함.'''

n = int(input())
moveList = input().split()

# 초기 좌표 설정
x, y = 1, 1 

# 이동 방향에 따른 dx, dy 리스트 상하좌우 순
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]
moveType = ['U', 'D', 'L', 'R']

nx, ny = 0, 0

for plan in moveList:
    # 일단 moveList 내용대로 이동후 좌표를 구한다.
    for i in range(len(moveType)):
        if plan == moveType[i]:
            # 좌표 값 수정
            nx = x + dx[i]
            ny = y + dy[i]
    # 공간 벗어나면 무시해야함.
    if nx < 1 or ny < 1 or nx > n or ny > n:
        continue
        
    x, y = nx, ny

print(x, y)
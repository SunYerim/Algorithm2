'''logic
    1. 우선 이동할 수 있는 방향들 선언
    2. 이동을 하고 나면 현 배열의 0을 바꿔줘야함. (지나갔다는 표시의 일종)
    3. 그러므로 현재 서있는 좌표는 이동처리를 해줘야한다. (편의상 1로 변경시키겠음)'''

n, m = map(int, input().split())
a, b, d = map(int, input().split()) # 현재 좌표 및 방향
# 리스트 넣기
board = []
for i in range(n):
    board.append(list(map(int, input().split())))

count = 1

direction = [0, 3, 2, 1] # 왼쪽 방향으로 돈다고 했으므로(북, 서, 남, 동)
dx = [0, -1, 0, 1]
dy = [-1, 0, 1, 0]

idx = direction.index(d) + 1
print(idx)
while(1):
    board[a][b] = 1
    x = a + dx[idx]
    y = b + dy[idx]

    if board[x][y] == 0:
        a = x
        b = y
        board[x][y] = 1
        count += 1

    if idx < 3:
        idx += 1
    else:
        idx = 0

    countRow = 0
    
    for i in board:
        if 0 not in i:
            countRow += 1
    if countRow == a:
        break

print(count)
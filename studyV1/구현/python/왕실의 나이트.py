'''logic
    1. 나이트가 이동할 수 있는 경우는 2가지.
    2. 이동할 수 있는 경우를 list에 담아 선언
    3. 8가지 방향으로 이동가능한지 여부 확인하여 count 증가시킴'''

site = input() # 현재 나이트의 위치

# 입력받은 데이터에서 행, 열 분리
row = int(site[1]) # 행
column = int(ord(site[0])) - int(ord('a')) + 1 # 열

# 나이트가 이동할 수 있는 방향들 list
directions = [(-2, -1), (-1, -2), (1, -2), (2, -1), (2, 1), (1, 2), (-1, 2), (-2, 1)]

# 답으로 내보낼 변수 설정
count = 0

# 8가지 방향으로 이동할 수 있는지 여부 확인
for step in directions:
    nextRow = row + step[0]
    nextColumn = column + step[1]
    # 해당 위치로 이동 가능하면? -> count 증가시킴
    if nextRow >= 1 and nextRow <= 8 and nextColumn >= 1 and nextColumn <= 8:
        count += 1

print(count)
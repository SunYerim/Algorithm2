'''logic
    1. 3이 하나라도 포함되는 경우? 전부 포함
    2. 시, 분, 초 => 순서대로 반복문 돌리기'''

hour = int(input())

count = 0

for i in range(hour + 1):
    for j in range(60):
        for k in range(60):
            # 시, 분, 초 안에 3이 포함되어 있다면 count를 증가시킨다.
            if '3' in (str(i) + str(j) + str(k)):
                count += 1


print(count)
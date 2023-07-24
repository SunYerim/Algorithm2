# 손님에게 거슬러 줘야할 거스름돈 N원 => 거슬러줘야 할 동전의 최소 개수 (단, 거슬러줘야할 돈 N은 항상 10의 배수다.)

# 돈 입력받기
money = int(input())

# 결과로 나갈 count 변수 설정
count = 0

# 거스름돈 가능 금액 명시
moneyList = [500, 100, 50, 10]

for n in moneyList:
    count += (money // n)
    money %= n

print(count)
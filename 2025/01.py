import math

n = 50
c = 0

with open("input.txt", "r") as file:
    for line in file:
        direction = line[:1]
        degree = int(line[1:])
        
        if degree >= 100:
            c += math.floor(degree / 100)
            degree = degree % 100
        
        if direction == "L":
            if not(n == 0) and n <= degree:
                c += 1
            n -= degree
            n = n % 100
        else:
            if not(n == 0) and n >= 100 - degree:
                c += 1
            n += degree
            n = n % 100

print(c)

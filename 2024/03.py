import re

n = 0
muls = []
doMul = True

with open("input.txt", "r") as file:
    muls = re.findall("mul\(\d+,\d+\)|do\(\)|don't\(\)", file.read())

for mul in muls:
    if mul == "do()":
        doMul = True
    elif mul == "don't()":
        doMul = False
    elif doMul and "mul" in mul:
        mulParts = re.split("\(|,|\)", mul)
        n += int(mulParts[1]) * int(mulParts[2])

print(n)

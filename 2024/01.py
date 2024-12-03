n = 0
list1 = []
list2 = []

with open("input.txt", "r") as file:
    for line in file:
        nums = line.split("   ")
        list1.append(int(nums[0]))
        list2.append(int(nums[1]))

list1.sort()
list2.sort()

for x in range(1000):
    for y in range(1000):
        if list1[x] == list2[y]:
            n += list1[x]

print(n)

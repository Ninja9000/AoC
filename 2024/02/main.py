n = 0
reports = []

with open("input.txt", "r") as file:
    for line in file:
        reports.append(line)

for report in reports:
    safe = False
    levels = [int(x) for x in report.split()]
    tLevels = []
    
    for i in range(len(levels)):
        tSafe = True
        tLevels = levels[:]
        tLevels.pop(i)
        
        if tLevels != sorted(tLevels) and tLevels != sorted(tLevels, reverse = True):
            tSafe = False
    
        for j in range(len(tLevels) - 1):
            diff = abs(tLevels[j] - tLevels[j + 1])
            if diff < 1 or diff > 3:
                tSafe = False
        if tSafe:
            safe = True
    
    if safe:
        n += 1

print(n)

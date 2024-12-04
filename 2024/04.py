words = 0
wordsearch = []

with open("input.txt", "r") as file:
    for line in file:
        wordsearch.append(line.rstrip())

for i, row in enumerate(wordsearch):
    for j, column in enumerate(row):
        if i > 0 and j > 0 and i < len(row) - 1 and j < len(row) - 1:
            x1 = (wordsearch[i-1][j-1] + wordsearch[i][j] + wordsearch[i+1][j+1] == "MAS"
                or wordsearch[i+1][j+1] + wordsearch[i][j] + wordsearch[i-1][j-1] == "MAS")
            x2 = (wordsearch[i-1][j+1] + wordsearch[i][j] + wordsearch[i+1][j-1] == "MAS"
                or wordsearch[i+1][j-1] + wordsearch[i][j] + wordsearch[i-1][j+1] == "MAS")
            if x1 and x2:
                words += 1

print(words)

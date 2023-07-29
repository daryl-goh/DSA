def score(name):
    return sum([ord(letter) - 64 for letter in name])

total_score = 0

with open('names.txt') as file:
    names = file.read().replace('"', '').split(',')
    names.sort()
   
    for index, name in enumerate(names, 1):  # Start index from 1
        name_score = index * score(name)
        total_score += name_score
        # print(f"{name}: {name_score}")

print("Total score:", total_score)
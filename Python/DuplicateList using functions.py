def Duplicate(x):
    return list(dict.fromkeys(x))

print(Duplicate(['a','b','c','c','d','d']))
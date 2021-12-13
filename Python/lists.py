def get_difference(list_a, list_b):
    return set(list_a).intersection(list_b)

a =  [1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89]

b =   [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]

print(get_difference(a,b))

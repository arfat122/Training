def BiggerNum(a,b,c):
    if ((a > b) and (a > c)):
        return a
    elif ((b > a) and (b > c)):
        return b
    else:
        return c
print(BiggerNum(2,6,4))
# Convert string to zigzag and compute new string
# Input: "PAYPALISHIRING", 4 =>
# P     I    N
# A   L S  I G
# Y A   H R
# P     I
# Output: "PINALSIGYAHRPI"
def convert(s, numRows):
    if (numRows == 1): return s
    r = (numRows * 2) - 2
    res = ""
    for x in range(numRows):
        tmp1 = 2*x
        tmp2 = r - tmp1
        nxt = x
        for y in range(len(s)):
            if (x == 0 or x == numRows - 1):
                nxt = x + y*r
            elif (y != 0):
                if (y % 2 == 0): nxt += tmp1
                else: nxt += tmp2
            if (nxt > len(s) - 1): break
            if (nxt < 0): continue
            res += s[nxt]
    return res

z1 = convert("PAYPALISHIRING", 3)
print(z1)
z2 = convert("PAYPALISHIRING", 4)
print(z2)
z3 = convert("A", 1)
print(z3)
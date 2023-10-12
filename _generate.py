import random
import numpy

lang = ['C++', 'C#', 'Java', 'JavaScript', 'Python', 'C', 'Ruby', 'Go', 'PHP', 'Rust']
num = random.randint(0, len(lang) - 1)
print(lang[num])
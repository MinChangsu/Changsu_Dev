from primePy import primes


a=list(primes.upto(1000))
b=list(primes.upto(100))


c=[x for x in a if x not in b]
print(len(c))
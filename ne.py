n = int(input("Podja n:"))
tablica = []
i = 1
while i <= n:
    tablica.append(i)
    i+=1
tablica.remove(1)
z = int(tablica[0])
r = 2
while z <= n:
   if r in tablica:
       tablica.remove(r)
       r+=2
print(tablica)
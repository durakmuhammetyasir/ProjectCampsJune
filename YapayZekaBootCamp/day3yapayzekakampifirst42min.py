# -*- coding: utf-8 -*-
"""Day3YapayZekaKampifirst42min.ipynb

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/1B0eZZt0eNdhYnc_7kb8WxtxkqPQHz4Mi
"""

meyveler = ["elma", "armut", "kivi"]
print(meyveler)
print(type(meyveler))

meyveler2 = list(( "elma", "armut", "kivi"))
print(meyveler2)
print(type(meyveler2))

karma = ["elif", 20, False]
print(karma)
print(type(karma))
print(len(karma))

meyveler3 = list(("elma", "armut", "kivi", "cilek", "muz"))
print(meyveler3)
print(type(meyveler3))
print(len(meyveler3))
print(meyveler3[0:3])
if "kivi" in meyveler3:
  print("kivi bulundu")
else:
  print("kivi bulunmadi")
meyveler3[2] = "ananas"
print(meyveler3)
meyveler3[3:5] = "muz","cilek"
print(meyveler3)
meyveler3[2:5] = "cilek","muz","kivi"
print(meyveler3)
meyveler3.append("portakal")
print(meyveler3)
meyveler3.insert(1,"karpuz")
print(meyveler3)

meyveler4 = ["elma", "armut","cilek"]
meyveler5 = ["muz","kivi"]
meyveler4.extend(meyveler5)
print(meyveler4)
meyveler4.remove("armut")
print(meyveler4)
meyveler4.pop(3)
print(meyveler4)
del meyveler4[1]
print(meyveler4)
meyveler4.clear()
print(meyveler4)
del(meyveler4)

gunler= ["pazartesi", "sali", "carsamba", "persembe", "cuma", "cumartesi","pazar"]
for gun in gunler:
  print(gun)
[print (gun) for gun in gunler]
for gun in range (len(gunler)):
  print(gunler[gun])
  print("listenin", gun)
gun = 0
while gun<len(gunler):
  print(gunler[gun])
  gun += 1
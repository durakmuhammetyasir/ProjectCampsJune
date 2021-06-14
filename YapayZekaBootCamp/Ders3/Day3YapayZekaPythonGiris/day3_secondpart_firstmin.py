# -*- coding: utf-8 -*-
"""
Created on Mon Jun 14 00:10:52 2021

@author: Yasir
"""

def basitfonksiyon():
    print("Merhaba, ilk fonksiyonum")

basitfonksiyon()

def degeralan(kullaniciadi, sifre):
    print("kullanici adi " + kullaniciadi + " sifrem " + sifre)
    print("kullanici adi" , kullaniciadi, "sifrem", sifre)
    
degeralan("Yasir", "nerede")

def degeralantekil(*kullaniciadi):
    print("kullaniciadi:" , kullaniciadi[1])
    print("kullaniciadi:" , kullaniciadi[0])
    print("kullaniciadi:" , kullaniciadi[2])

degeralantekil("Yasir", "Kaan", "Kenan")

def ogrenciotomasyon(**bilgi):
    print("Ogrenci adi:", bilgi["adi"] )
    print("Ogrenci sinifi:", bilgi["sinifi"])

ogrenciotomasyon(adi= "Ezgi", sinifi = "10")
ogrenciotomasyon(adi = "Kaan", sinifi = "12")
ogrenciotomasyon(adi="Yusuf",sinifi="12",adi1="Yunus",sinifi1="12")

def ulkeler(ulke= "Turkiye"):
    print("Merhaba, benim ulkem" ,ulke)

ulkeler()
ulkeler("Hindistan")
ulkeler("Arjantin")

def degerdondurenfonksiyon(sayi):
    return sayi*10

soru = int (input("Verdigin sayinin on katini bulacagim, sayi ver :"))
print(degerdondurenfonksiyon(soru))

def negatifbul(sayi):
    if sayi<0:
        print("negatif sayi")
    else:
        print("negatif degil")
        
negatifbul(-2)
negatifbul(2)

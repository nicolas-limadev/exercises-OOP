# -- coding: utf-8 --


a = float (input())
b = float (input())
c = float (input())

area = (a * c)/2

print("TRINGULO: " +str(round(area,3)))

print("CIRCULO: " +str(round(c*3.14159, 3)))

print("TRAPEZIO: " +str(round((a + b) * c /2 ,3)))

print("QUADRADO: " +str(round(b*2, 3)))

print("RETANGULO: " +str(round(a*b, 3)))
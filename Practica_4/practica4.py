import math

class FiguraGeometrica:
    def area(self):
        pass 

class Circulo(FiguraGeometrica):
    def __init__(self, radio):
        self.radio = radio

    def area(self):
        return math.pi * self.radio**2

class Rectangulo(FiguraGeometrica):
    def __init__(self, base, altura):
        self.base = base
        self.altura = altura

    def area(self):
        return self.base * self.altura

class Triangulo(FiguraGeometrica):
    def __init__(self, base, altura):
        self.base = base
        self.altura = altura

    def area(self):
        return (self.base * self.altura) / 2

class Pentagono(FiguraGeometrica):
    def __init__(self, lado, apotema):  
        self.lado = lado
        self.apotema = apotema

    def area(self):
        perimetro = 5 * self.lado
        return (perimetro * self.apotema) / 2

class Trapecio(FiguraGeometrica):
    def __init__(self, baseA, baseB, altura):
        self.baseA = baseA
        self.baseB = baseB
        self.altura = altura

    def area(self):
        return ((self.baseA + self.baseB) * self.altura) / 2

# Crear instancias de figuras
p1 = Circulo(5)
p2 = Rectangulo(8, 3)
p3 = Triangulo(11, 5)
p4 = Pentagono(7, 3) 
p5 = Trapecio(9, 5, 10)


print("Círculo:", p1.area())
print("Rectángulo:", p2.area())
print("Triángulo:", p3.area())
print("Pentágono:", p4.area())
print("Trapecio:", p5.area())

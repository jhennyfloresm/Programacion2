from abc import ABC, abstractmethod

class A(ABC):
    @abstractmethod
    def incrementaXZ(self):
        pass

    @abstractmethod
    def incrementaZ(self):
        pass

class B(ABC):
    @abstractmethod
    def incrementaYZ(self):
        pass

    @abstractmethod
    def incrementaZ(self):
        pass

class D(A, B):
    def __init__(self, x, y, z):
        self.x = x
        self.y = y
        self.z = z

    def incrementaXZ(self):
        self.x += 1
        self.z += 1

    def incrementaYZ(self):
        self.y += 1
        self.z += 1

    def incrementaZ(self):
        self.z += 1

    def incrementaXYZ(self):
        self.x += 1
        self.y += 1
        self.z += 1

    def mostrar_valores(self):
        print(f"x: {self.x}, y: {self.y}, z: {self.z}")

if __name__ == "__main__":
    obj = D(7, 8, 4)
    obj.mostrar_valores()
    obj.incrementaXZ()
    obj.incrementaYZ()
    obj.incrementaZ()
    obj.incrementaXYZ()
    obj.mostrar_valores()


class Ministerio:
    def __init__(self, nombre, direccion):
        self.nombre = nombre
        self.direccion = direccion
        self.empleados = []

    def agregar_empleado(self, nombre, edad, sueldo):
        empleado = {
            "nombre": nombre,
            "edad": edad,
            "sueldo": sueldo
        }
        self.empleados.append(empleado)

    def eliminar_por_edad(self, edad_objetivo):
        antes = len(self.empleados)
        self.empleados = [emp for emp in self.empleados if emp["edad"] != edad_objetivo]
        print(f"Eliminados {antes - len(self.empleados)} empleado(s) con edad {edad_objetivo}.")

    def mostrar_menor_edad(self):
        if not self.empleados:
            print("No hay empleados.")
            return
        menor = min(emp["edad"] for emp in self.empleados)
        print("Empleados con la menor edad:")
        for emp in self.empleados:
            if emp["edad"] == menor:
                print(f"{emp['nombre']} - Edad: {emp['edad']}")

    def mostrar_menor_sueldo(self):
        if not self.empleados:
            print("No hay empleados.")
            return
        menor = min(emp["sueldo"] for emp in self.empleados)
        print("Empleados con el menor sueldo:")
        for emp in self.empleados:
            if emp["sueldo"] == menor:
                print(f"{emp['nombre']} - Sueldo: {emp['sueldo']}")

    def __lshift__(self, otro):
        if not otro.empleados:
            print("No hay empleados para transferir.")
            return
        empleado = otro.empleados.pop()  
        self.empleados.append(empleado)
        print(f"Empleado transferido: {empleado['nombre']}")


def main():

    min1 = Ministerio("Medio Ambiente", "La Paz")
    min1.agregar_empleado("Sonia", 98, 988)
    min1.agregar_empleado("Pablo", 23, 7899)
    min1.agregar_empleado("Roro", 35, 3455)

    
    min2 = Ministerio("Salud", "La Paz, Av 6 de Agosto")
    min2.agregar_empleado("Marc", 34, 1000)
    min2.agregar_empleado("Gawin", 18, 3456)

    
    min1.eliminar_por_edad(18)       
    min1 << min2                     

    print("\n-  miniterio medio ambiente")
    min1.mostrar_menor_edad()
    min1.mostrar_menor_sueldo()

    print("\n---  ministerio salud")
    min2.mostrar_menor_edad()
    min2.mostrar_menor_sueldo()




   



        

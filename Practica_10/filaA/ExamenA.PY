class LineaTeleferico:
    def __init__(self, color, tramo, nro_cabinas):
        self.color = color
        self.tramo = tramo
        self.nro_cabinas = nro_cabinas
        self.empleados = []

    def agregar_empleado(self, nombre, edad, sueldo):
        empleado = self._crear_empleado(nombre, edad, sueldo)
        self.empleados.append(empleado)

    def _crear_empleado(self, nombre, edad, sueldo):
        return {"nombre": nombre, "edad": edad, "sueldo": sueldo}

    def eliminar_empleado_por_apellido(self, apellido):
        inicial = len(self.empleados)
        self.empleados = [e for e in self.empleados if not e["nombre"].split()[-1] == apellido]
        eliminados = inicial - len(self.empleados)
        print(f"{eliminados} empleado(s) eliminado(s) con apellido '{apellido}'.")

    def obtener_empleado_mayor(self, clave):
        if not self.empleados:
            return None
        return max(self.empleados, key=lambda e: e[clave])

    def mostrar_empleado_mayor_edad(self):
        mayor = self.obtener_empleado_mayor("edad")
        if mayor:
            print(f"Empleado con mayor edad: {mayor['nombre']} ({mayor['edad']} años)")
        else:
            print("No hay empleados.")

    def mostrar_empleado_mayor_sueldo(self):
        mejor_pagado = self.obtener_empleado_mayor("sueldo")
        if mejor_pagado:
            print(f"Empleado con mayor sueldo: {mejor_pagado['nombre']} (Bs {mejor_pagado['sueldo']})")
        else:
            print("No hay empleados.")

    def __str__(self):
        return f"Línea {self.color} - Tramo: {self.tramo} - Cabinas: {self.nro_cabinas} - Empleados: {len(self.empleados)}"

    def __rshift__(self, otra_linea):
        if self.empleados:
            transferido = self.empleados.pop()
            otra_linea.empleados.append(transferido)
            print(f"Empleado transferido: {transferido['nombre']}")
        else:
            print("No hay empleados para transferir.")


# Ejemplo de uso
linea1 = LineaTeleferico("lila", " 6 de marzo", 34)
linea1.agregar_empleado("gawin jus", 27, 100)
linea1.agregar_empleado("marck flores" , 24, 200)
linea2 = LineaTeleferico("amarillo", "satelite", 45)

linea2.agregar_empleado("fluck ros", 34, 230)
linea2.agregar_empleado(" ohm", 23, 567)

linea1.eliminar_empleado_por_apellido("ros")

linea1 >> linea2

print("\nEmpleados en Línea 1:")
linea1.mostrar_empleado_mayor_edad()
linea1.mostrar_empleado_mayor_sueldo()

print("\nEmpleados en Línea 2:")
linea2.mostrar_empleado_mayor_edad()
linea2.mostrar_empleado_mayor_sueldo()

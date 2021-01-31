import threading
import time


def esPar(n):
    if n % 2 == 0:
        return True
    return False

def imprimirPares (limite, dormir) :
    time.sleep(int(dormir) / 1000)
    for i in range(int(limite)):
        if esPar(i):
            print("ESPAR: " + str(i))

def imprimirImpares (limite, dormir):
    time.sleep(int(dormir) / 1000)
    for i in range(int(limite)):
        if not esPar(i):
            print("NOESPAR: " + str(i))


limite = input("Escriba el limite superior ")
dormir = input("Escriba el tiempo que los  threads van a dormir ")


thread1 = threading.Thread(target=imprimirImpares, args=(limite, dormir))
thread2 = threading.Thread(target=imprimirPares, args=(limite, dormir))

thread1.start()
thread2.start()
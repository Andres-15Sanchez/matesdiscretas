import turtle

ventana = turtle.Screen()
ventana.bgcolor("black")
tortuga = turtle.Turtle()
tortuga.speed(1)
tortuga.color('red')
longitud = 150

for _ in range(5):
    tortuga.forward(longitud)
    tortuga.right(144)

ventana.exitonclik()
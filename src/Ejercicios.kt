//1. Control de Gastos Diarios
fun reto1(){
    val gastos = arrayOf(12000.0, 15000.0, 8000.0, 22000.0, 17000.0,
        9000.0, 11000.0, 14000.0, 13000.0, 16000.0,
        18000.0, 10000.0, 7000.0, 19000.0, 21000.0)

    var total = 0.0;
    var max = gastos[0]
    var min = gastos[0]

    for (gasto in gastos){
        total += gasto
        if(gasto > max) max = gasto
        if(gasto < min) min = gasto
    }
    val promedio = total / gastos.size
    println("\n=== reto 1 ===")
    println("Total: $total")
    println("Promedio: $promedio")
    println("Maximo: $max")
    println("Minimo: $min")
}

// 2. Filtro de Empleados Senior
fun reto2() {
    val empleados = listOf(
        Pair("Carlos", 25),
        Pair("Ana", 35),
        Pair("Luis", 42),
        Pair("Marta", 28)
    )

    val senior = mutableListOf<String>()

    for (empleado in empleados) {
        if (empleado.second > 30) {
            senior.add(empleado.first.uppercase())
        }
    }

    println("\n=== Reto 2 ===")
    println(senior)
}

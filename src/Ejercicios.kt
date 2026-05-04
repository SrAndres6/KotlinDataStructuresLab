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

// 3. Limpieza de Contactos Duplicados
fun reto3() {
    val numeros = listOf(
        "3001111111", "3002222222", "3001111111",
        "3003333333", "3002222222", "3004444444"
    )

    val unicos = numeros.toSet().toList().sorted()

    println("\n=== Reto 3 ===")
    println(unicos)
}

// 4. Análisis de Carrito de Compras
fun reto4() {
    val productos = listOf("Pan", "Leche", "Pan", "Huevos", "Leche", "Pan")
    val conteo = mutableMapOf<String, Int>()

    for (producto in productos) {
        conteo[producto] = (conteo[producto] ?: 0) + 1
    }

    println("\n=== Reto 4 ===")
    println(conteo)
}

// 5. Historial de Navegación Reversible
fun reto5() {
    val urls = arrayOf(
        "google.com",
        "youtube.com",
        "github.com",
        "kotlinlang.org",
        "openai.com"
    )

    println("\n=== Reto 5 ===")
    for (i in urls.size - 1 downTo 0) {
        println(urls[i])
    }
}

// 6. Compatibilidad de Intereses
fun reto6() {
    val persona1 = setOf("cine", "música", "viajar", "leer")
    val persona2 = setOf("música", "deporte", "viajar", "cocinar")

    val comunes = persona1.intersect(persona2)
    val exclusivos = persona1.subtract(persona2)

    println("=== Reto 6 ===")
    println("Intereses en común: $comunes")
    println("Exclusivos de persona 1: $exclusivos")
}

// 7. Inventario de Despensa
fun reto7() {
    val despensa = mutableMapOf(
        "Arroz" to 3,
        "Leche" to 2,
        "Huevos" to 12
    )

    val producto = "Leche"
    val cantidadConsumida = 2

    if (despensa.containsKey(producto)) {
        despensa[producto] = despensa[producto]!! - cantidadConsumida

        if (despensa[producto]!! <= 0) {
            despensa.remove(producto)
            println("Producto agotado: $producto")
        }
    }

    println("=== Reto 7 ===")
    println(despensa)
}

// 8. Cálculo de Promedio Académico
fun reto8() {
    val notas = listOf(
        Pair(4.5, 0.3),
        Pair(3.8, 0.2),
        Pair(4.0, 0.5)
    )

    var definitiva = 0.0

    for (nota in notas) {
        definitiva += nota.first * nota.second
    }

    println("=== Reto 8 ===")
    println("Nota final: %.2f".format(definitiva))
}

// 9. Traductor de Códigos de País
fun reto9() {
    val paises = mapOf(
        "CO" to "Colombia",
        "MX" to "México",
        "AR" to "Argentina"
    )

    println("=== Reto 9 ===")
    for ((codigo, pais) in paises) {
        println("El código $codigo pertenece a $pais")
    }
}

// 10. Rotación de Turnos de Trabajo
fun reto10() {
    val empleados = mutableListOf(
        "Ana", "Luis", "Carlos",
        "Marta", "Pedro", "Sofía", "Jorge"
    )

    val k = 2

    repeat(k) {
        val ultimo = empleados.removeAt(empleados.lastIndex)
        empleados.add(0, ultimo)
    }

    println("=== Reto 10 ===")
    println("Turnos rotados: $empleados")
}

// 11. Organizador de Maleta
fun reto11() {
    val objetos = listOf(
        Pair("Zapatos", 2),
        Pair("Camisa", 1),
        Pair("Laptop", 3),
        Pair("Libro", 2)
    )

    val maleta = mutableMapOf<Int, MutableList<String>>()

    for ((objeto, peso) in objetos) {
        if (!maleta.containsKey(peso)) {
            maleta[peso] = mutableListOf()
        }
        maleta[peso]?.add(objeto)
    }

    println("=== Reto 11 ===")
    println(maleta)
}

// 12. Verificador de Ruta Reversible
fun reto12() {
    val ruta = listOf("A", "B", "C", "B", "A")
    var reversible = true

    for (i in ruta.indices) {
        if (ruta[i] != ruta[ruta.size - 1 - i]) {
            reversible = false
            break
        }
    }

    println("=== Reto 12 ===")
    println("¿La ruta es reversible?: $reversible")
}

// 13. Reparto de Pedidos por Camión
fun reto13() {
    val paquetes = (1..25).toList()
    val lotes = mutableListOf<List<Int>>()

    var i = 0
    while (i < paquetes.size) {
        val fin = minOf(i + 10, paquetes.size)
        lotes.add(paquetes.subList(i, fin))
        i += 10
    }

    println("=== Reto 13 ===")
    println(lotes)
}

// 14. Identificador de Ticket Único
fun reto14() {
    val tickets = listOf(101, 102, 103, 101, 102)

    for (ticket in tickets) {
        var contador = 0
        for (t in tickets) {
            if (ticket == t) contador++
        }
        if (contador == 1) {
            println("=== Reto 14 ===")
            println("Ticket único: $ticket")
            break
        }
    }
}


// 15. Calculadora de IVA Selectiva
fun reto15() {
    val productos = mapOf(
        "Televisor" to 1200000.0,
        "Arroz" to 30000.0,
        "Celular" to 800000.0
    )

    val resultado = mutableMapOf<String, Double>()

    for ((nombre, precio) in productos) {
        resultado[nombre] = if (precio > 50000) precio * 1.19 else precio
    }

    println("=== Reto 15 ===")
    println(resultado)
}

// 16. Mantenimiento de Sensores
fun reto16() {
    val sensores = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    sensores.removeAll { it % 3 == 0 }

    println("=== Reto 16 ===")
    println(sensores)
}

// 17. Mapa de Almacén (Matriz)
fun reto17() {
    val almacen = arrayOf(
        intArrayOf(1, 2, 3, 4),
        intArrayOf(5, 6, 7, 8),
        intArrayOf(9, 10, 11, 12),
        intArrayOf(13, 14, 15, 16)
    )

    var diagonalPrincipal = 0
    var diagonalSecundaria = 0

    for (i in almacen.indices) {
        diagonalPrincipal += almacen[i][i]
        diagonalSecundaria += almacen[i][almacen.size - 1 - i]
    }

    println("=== Reto 17 ===")
    println("Diagonal principal: $diagonalPrincipal")
    println("Diagonal secundaria: $diagonalSecundaria")
}

// 18. Fusión de Recetas
fun reto18() {
    val receta1 = mapOf("Harina" to 1.0, "Azúcar" to 0.5)
    val receta2 = mapOf("Harina" to 0.5, "Leche" to 1.0)

    val fusion = mutableMapOf<String, Double>()

    for ((ingrediente, cantidad) in receta1) {
        fusion[ingrediente] = cantidad
    }

    for ((ingrediente, cantidad) in receta2) {
        fusion[ingrediente] = (fusion[ingrediente] ?: 0.0) + cantidad
    }

    println("=== Reto 18 ===")
    println(fusion)
}

// 19. Ranking de Apps por Calificación
fun reto19() {
    val apps = mutableListOf(
        Pair("WhatsApp", 4.5),
        Pair("Instagram", 4.2),
        Pair("Telegram", 4.8)
    )

    for (i in 0 until apps.size - 1) {
        for (j in 0 until apps.size - i - 1) {
            if (apps[j].second < apps[j + 1].second) {
                val temp = apps[j]
                apps[j] = apps[j + 1]
                apps[j + 1] = temp
            }
        }
    }

    println("=== Reto 19 ===")
    println(apps)
}

// 20. Unión de Agendas Ordenadas
fun reto20() {
    val lista1 = listOf("Ana", "Carlos", "Pedro")
    val lista2 = listOf("Beatriz", "Daniel", "Sofía")

    val resultado = mutableListOf<String>()
    var i = 0
    var j = 0

    while (i < lista1.size && j < lista2.size) {
        if (lista1[i] < lista2[j]) {
            resultado.add(lista1[i])
            i++
        } else {
            resultado.add(lista2[j])
            j++
        }
    }

    while (i < lista1.size) {
        resultado.add(lista1[i])
        i++
    }

    while (j < lista2.size) {
        resultado.add(lista2[j])
        j++
    }

    println("=== Reto 20 ===")
    println(resultado)
}

// 21. Días de Mantenimiento (Primos)
fun reto21() {
    val primos = mutableListOf<Int>()

    for (num in 2..100) {
        var esPrimo = true

        for (i in 2 until num) {
            if (num % i == 0) {
                esPrimo = false
                break
            }
        }

        if (esPrimo) {
            primos.add(num)
        }
    }

    println("=== Reto 21 ===")
    println(primos)
}

// 22. Pila de Platos Sucios
fun reto22() {
    val pila = mutableListOf<String>()

    pila.add("Plato 1")
    pila.add("Plato 2")
    pila.add("Plato 3")

    val lavado = pila.removeAt(pila.lastIndex)

    println("=== Reto 22 ===")
    println("Plato lavado: $lavado")
    println("Pila restante: $pila")
}

// 23. Seguimiento de Dieta
fun reto23() {
    val calorias = listOf(1800, 2000, 1900, 2100, 2200)
    val diferencias = mutableListOf<Double>()

    for (i in calorias.indices) {
        var suma = 0
        for (j in 0 until i) {
            suma += calorias[j]
        }

        val promedio = if (i == 0) calorias[i].toDouble() else suma.toDouble() / i
        diferencias.add(calorias[i] - promedio)
    }

    println("=== Reto 23 ===")
    println(diferencias)
}

// 24. Organización de Contenedores
fun reto24() {
    val secuencia = "(()())"
    var contador = 0
    var balanceado = true

    for (c in secuencia) {
        if (c == '(') contador++
        if (c == ')') contador--

        if (contador < 0) {
            balanceado = false
            break
        }
    }

    if (contador != 0) balanceado = false

    println("=== Reto 24 ===")
    println("¿Balanceado?: $balanceado")
}

package com.example.apliksasiketiga


fun main() {
    val aquarium = buildAquarium()

    println("Width: ${aquarium.width}")
    println("Height: ${aquarium.height}")
    println("Length: ${aquarium.length}")

    val aquarium1 = Aquarium(height = 31)
    aquarium1.printSize()

    val aquarium2 = Aquarium(height = 35)
    aquarium2.printSize()

    println("Aquarium 1 Total Surface Area: ${aquarium1.totalSurfaceArea} cm^2")
    println("Aquarium 2 Total Surface Area: ${aquarium2.totalSurfaceArea} cm^2")
}

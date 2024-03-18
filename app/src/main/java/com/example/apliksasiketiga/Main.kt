package com.example.apliksasiketiga

// Define the Aquarium class
class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {
    init {
        println("⇒ aquarium initialized")
    }

    // Property getter for total surface area
    val totalSurfaceArea: Int
        get() = 2 * (length * width + length * height + width * height)

    // Function to print the size of the aquarium
    fun printSize() {
        println("Width: $width cm, Length: $length cm, Height: $height cm")
        println("Volume: ${calculateVolume()} liters")
    }

    private fun calculateVolume(): Int {
        return width * length * height / 1000 // Volume in liters
    }
}
// Function to build aquariums with different configurations and return an instance of Aquarium
fun buildAquarium(): Aquarium {
    val aquarium1 = Aquarium()
    aquarium1.printSize()

    // Default height and length
    val aquarium2 = Aquarium(width = 25)
    aquarium2.printSize()

    // Default width
    val aquarium3 = Aquarium(height = 35, length = 110)
    aquarium3.printSize()

    // Everything custom
    val aquarium4 = Aquarium(width = 25, height = 35, length = 110)
    aquarium4.printSize()

    return aquarium4 // Return an instance of Aquarium
}


fun main() {
    val aquarium = buildAquarium()

    println("Width: ${aquarium.width}")
    println("Height: ${aquarium.height}")
    println("Length: ${aquarium.length}")
}

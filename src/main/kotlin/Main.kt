import kotlin.math.pow

fun main() {
    val dog = Dog()
    val cat = Cat()
    val horse = Horse()
    val veterinarian = Veterinarian()

    var animals: Array<Animal> = arrayOf(dog, cat, horse)

    for (item in animals) veterinarian.treatAnimal(item)

    dog.sleep()
    cat.makeNoise()
    horse.eat()
}

open class Animal {
    open val food: String = ""
    open val location: String = ""
    open fun makeNoise() {}
    open fun eat() {}
    open fun sleep() {}
}

class Dog:Animal() {
    override val food: String = "Meat"
    override val location: String = "Cottage"
    override fun makeNoise() {
        println("Woof-woof")
    }
    override fun eat() {
        println("Dog are eating")
    }
    override fun sleep() {
        println("Dog are sleeping")
    }
}

class Cat:Animal() {
    override val food: String = "Fish"
    override val location: String = "Home"
    override fun makeNoise() {
        println("Meow-meow")
    }
    override fun eat() {
        println("Cat are eating")
    }
    override fun sleep() {
        println("Cat are sleeping")
    }
}

class Horse:Animal() {
    override val food: String = "Grass"
    override val location: String = "Pasture"
    override fun makeNoise() {
        println("Neigh")
    }
    override fun eat() {
        println("Horse are eating")
    }
    override fun sleep() {
        println("Horse are sleeping")
    }
}

class Veterinarian() {
    fun treatAnimal(animal: Animal) {
        println("Animal ${animal} came to the appointment. Animal eat ${animal.food} and lives at ${animal.location}")
    }
}

class Message(username: String) {
    private val _username = username
    fun introduce() {
        println("Hello, my name is ${_username}!")
    }
}

class Words {
    init {
        println("Class Words has been created!")
    }
}
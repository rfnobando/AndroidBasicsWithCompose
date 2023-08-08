// Defining a class to represent a person
class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    // Function to display the person's profile
    fun showProfile() {
        // Determine hobby status
        val hobbyStatus = if (hobby != null) "Likes to $hobby. " else "Doesn't have a hobby. "
        
        // Determine referrer status
        val referrerStatus = when {
            referrer != null -> "Has a referrer named ${referrer.name}"
            else -> "Doesn't have a referrer"
        }
        
        // Determine referrer's hobby status
        val referrerHobbyStatus = when {
            referrer != null && referrer.hobby != null -> ", who likes to ${referrer.hobby}."
            referrer != null -> ", who doesn't have a hobby."
            else -> "."
        }

        // Display the profile information
        println("Name: " + name)
        println("Age: " + age)
        println(hobbyStatus + referrerStatus + referrerHobbyStatus + "\n") 
    }
}

// Main function to execute the program
fun main() {
    // Creating instances of Person
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)
    val caroline = Person("Caroline", 19, null, null)
    val emily = Person("Emily", 25, "paint", caroline)
    val samantha = Person("Samantha", 21, "read books", atiqah)
    
    // Calling showProfile() for each person
    amanda.showProfile()
    atiqah.showProfile()  
    caroline.showProfile()
    emily.showProfile()
    samantha.showProfile()
}

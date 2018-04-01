package net.bk

import org.junit.Test
import kotlin.properties.Delegates

class ObservableTests {

    class User {
        var name: String by Delegates.observable("no name") { d, old, new ->
            println("$old - $new")
        }

        var surName: String by Delegates.notNull() // no value in constructor


    }

    @Test(expected = IllegalStateException::class)
    fun notNullNoConstructorValueTest(){
        val user = User()
        //user.name = "Juan"
        val x = user.surName
        println(x)
    }

    @Test
    fun notNullConstructorValuesOkTest(){
        val user = User()
        user.surName = "keating"
        println(user.surName)
    }

    @Test
    fun testObservable() {
        val user = User()
        user.name = "Juan"
        user.name = "Kam"
        println("Username: ${user.name}")
    }
}
package net.bk

import org.junit.Test
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class InteropTests{

    @Test
    fun javaPropertyTest(){
        val app = Application()
        app.Login();

        assertNotNull( app.userToken )


    }
}
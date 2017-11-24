package net.bk



fun main(args:String){

    var a: String = "abc"
    //a = null // compilation error

    var b: String? = "abc"
    b = null // ok

    var l = a.length // safe

    //l = b.length  //  Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?

    val ll = b?.length // save call

    // check tracked by compiler
    val llll = if (b != null) b.length else -1  // notice ternary

    // more complex null track
    if (b != null && b.length > 0) {
        print("String of length ${b.length}")
    } else {
        print("Empty string")
    }

    // Safe call chaining
    //val x = bob?.department?head


    // let with nulls
    val listWithNulls: List<String?> = listOf("A", null)
    for (item in listWithNulls) {
        item?.let { println(it) } // prints A and ignores null
    }

}
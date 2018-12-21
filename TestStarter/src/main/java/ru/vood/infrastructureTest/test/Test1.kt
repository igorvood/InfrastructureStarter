package ru.vood.infrastructureTest.test

import ru.vood.infrastructure.wrappers.WrapperForController

class Test1 : WrapperForController {

    fun q() {
        val h = HashMap<Long, String>()
        val put = h.put(1L, "2")
        //wrapObject(Function {  }, )
    }
}
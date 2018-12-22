package ru.vood.infrastructure.wrappers.kt

import io.vavr.*
import ru.vood.infrastructure.wrappers.BeginnerOfChainFunctionInterface
import ru.vood.infrastructure.wrappers.kt.PageKT.Companion.NULL_PAGE
import java.util.*
import java.util.Arrays.asList
import java.util.function.BiFunction
import java.util.function.Function
import java.util.function.Supplier

interface WrapperForServiceKT : BeginnerOfChainFunctionInterface {

    fun <R> wrapList(longListFunction: Supplier<List<R>>) = wrapList(NULL_PAGE, Function<List<R>, List<R>> { longListFunction.get() }, null)

    fun <T1, R> wrapList(longListFunction: Function<T1, List<R>>, t1: T1?) = wrapList(NULL_PAGE, longListFunction, t1)

    fun <T1, T2, R> wrapList(longListFunction: BiFunction<T1, T2, List<R>>, t1: T1, t2: T2) = wrapList(NULL_PAGE, longListFunction, t1, t2)

    fun <T1, T2, T3, R> wrapList(longListFunction: Function3<T1, T2, T3, List<R>>, t1: T1, t2: T2, t3: T3) = wrapList(NULL_PAGE, longListFunction, t1, t2, t3)

    fun <T1, T2, T3, T4, R> wrapList(longListFunction: Function4<T1, T2, T3, T4, List<R>>, t1: T1, t2: T2, t3: T3, t4: T4) = wrapList(NULL_PAGE, longListFunction, t1, t2, t3, t4)

    fun <T1, T2, T3, T4, T5, R> wrapList(longListFunction: Function5<T1, T2, T3, T4, T5, List<R>>, t1: T1, t2: T2, t3: T3, t4: T4, t5: T5) = wrapList(NULL_PAGE, longListFunction, t1, t2, t3, t4, t5)

    fun <T1, T2, T3, T4, T5, T6, R> wrapList(longListFunction: Function6<T1, T2, T3, T4, T5, T6, List<R>>, t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6) = wrapList(NULL_PAGE, longListFunction, t1, t2, t3, t4, t5, t6)

    fun <T1, T2, T3, T4, T5, T6, T7, R> wrapList(longListFunction: Function7<T1, T2, T3, T4, T5, T6, T7, List<R>>, t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7) = wrapList(NULL_PAGE, longListFunction, t1, t2, t3, t4, t5, t6, t7)

    fun <T1, T2, T3, T4, T5, T6, T7, T8, R> wrapList(longListFunction: Function8<T1, T2, T3, T4, T5, T6, T7, T8, List<R>>, t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8) = wrapList(NULL_PAGE, longListFunction, t1, t2, t3, t4, t5, t6, t7, t8)

    fun <R> wrapList(page: PageKT, longListFunction: Supplier<List<R>>) = wrapList(page, Function<List<R>, List<R>> { longListFunction.get() }, null)

    fun <T1, R> wrapList(page: PageKT, longListFunction: Function<T1, List<R>>, t1: T1?): WrappedObject<R> {
        try {
            return getOk(page, longListFunction.apply(t1!!))
        } catch (e: Exception) {
            return getError(e)
        }

    }

    fun <T1, T2, R> wrapList(page: PageKT, longListFunction: BiFunction<T1, T2, List<R>>, t1: T1, t2: T2): WrappedObject<R> {
        try {
            val apply = longListFunction.apply(t1, t2)
            return getOk(page, apply)
        } catch (e: Exception) {
            return getError(e)
        }

    }

    fun <T1, T2, T3, R> wrapList(page: PageKT, longListFunction: Function3<T1, T2, T3, List<R>>, t1: T1, t2: T2, t3: T3): WrappedObject<R> {
        try {
            val apply = longListFunction.apply(t1, t2, t3)
            return getOk(page, apply)
        } catch (e: Exception) {
            return getError(e)
        }

    }

    fun <T1, T2, T3, T4, R> wrapList(page: PageKT, longListFunction: Function4<T1, T2, T3, T4, List<R>>, t1: T1, t2: T2, t3: T3, t4: T4): WrappedObject<R> {
        try {
            val apply = longListFunction.apply(t1, t2, t3, t4)
            return getOk(page, apply)
        } catch (e: Exception) {
            return getError(e)
        }

    }

    fun <T1, T2, T3, T4, T5, R> wrapList(page: PageKT, longListFunction: Function5<T1, T2, T3, T4, T5, List<R>>, t1: T1, t2: T2, t3: T3, t4: T4, t5: T5): WrappedObject<R> {
        try {
            val apply = longListFunction.apply(t1, t2, t3, t4, t5)
            return getOk(page, apply)
        } catch (e: Exception) {
            return getError(e)
        }

    }

    fun <T1, T2, T3, T4, T5, T6, R> wrapList(page: PageKT, longListFunction: Function6<T1, T2, T3, T4, T5, T6, List<R>>, t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6): WrappedObject<R> {
        try {
            val apply = longListFunction.apply(t1, t2, t3, t4, t5, t6)
            return getOk(page, apply)
        } catch (e: Exception) {
            return getError(e)
        }

    }

    fun <T1, T2, T3, T4, T5, T6, T7, R> wrapList(page: PageKT, longListFunction: Function7<T1, T2, T3, T4, T5, T6, T7, List<R>>, t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7): WrappedObject<R> {
        try {
            val apply = longListFunction.apply(t1, t2, t3, t4, t5, t6, t7)
            return getOk(page, apply)
        } catch (e: Exception) {
            return getError(e)
        }

    }

    fun <T1, T2, T3, T4, T5, T6, T7, T8, R> wrapList(page: PageKT, longListFunction: Function8<T1, T2, T3, T4, T5, T6, T7, T8, List<R>>, t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8): WrappedObject<R> {
        try {
            val apply = longListFunction.apply(t1, t2, t3, t4, t5, t6, t7, t8)
            return getOk(page, apply)
        } catch (e: Exception) {
            return getError(e)
        }

    }

    //------------------------------------------------------
    fun <R> wrapObject(longListFunction: Supplier<R>): WrappedObject<R> {
        val function = Function<R, R> { longListFunction.get() }
        return wrapList<R, R>(function.andThen<List<R>>(aroundObjectByList<R>()), null)
    }

    fun <T1, R> wrapObject(longListFunction: Function<T1, R>, t1: T1): WrappedObject<R> {
        return wrapList(longListFunction.andThen(aroundObjectByList()), t1)
    }

    fun <T1, T2, R> wrapObject(longListFunction: BiFunction<T1, T2, R>, t1: T1, t2: T2): WrappedObject<R> {
        return wrapList(longListFunction.andThen(aroundObjectByList()), t1, t2)
    }

    fun <T1, T2, T3, R> wrapObject(longListFunction: Function3<T1, T2, T3, R>, t1: T1, t2: T2, t3: T3): WrappedObject<R> {
        return wrapList(longListFunction.andThen(aroundObjectByList()), t1, t2, t3)
    }

    fun <T1, T2, T3, T4, R> wrapObject(longListFunction: Function4<T1, T2, T3, T4, R>, t1: T1, t2: T2, t3: T3, t4: T4): WrappedObject<R> {
        return wrapList(longListFunction.andThen(aroundObjectByList()), t1, t2, t3, t4)
    }

    fun <T1, T2, T3, T4, T5, R> wrapObject(longListFunction: Function5<T1, T2, T3, T4, T5, R>, t1: T1, t2: T2, t3: T3, t4: T4, t5: T5): WrappedObject<R> {
        return wrapList(longListFunction.andThen(aroundObjectByList()), t1, t2, t3, t4, t5)
    }

    fun <T1, T2, T3, T4, T5, T6, R> wrapObject(longListFunction: Function6<T1, T2, T3, T4, T5, T6, R>, t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6): WrappedObject<R> {
        return wrapList(longListFunction.andThen(aroundObjectByList()), t1, t2, t3, t4, t5, t6)
    }

    fun <T1, T2, T3, T4, T5, T6, T7, R> wrapObject(longListFunction: Function7<T1, T2, T3, T4, T5, T6, T7, R>, t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7): WrappedObject<R> {
        return wrapList(longListFunction.andThen(aroundObjectByList()), t1, t2, t3, t4, t5, t6, t7)
    }

    fun <T1, T2, T3, T4, T5, T6, T7, T8, R> wrapObject(longListFunction: Function8<T1, T2, T3, T4, T5, T6, T7, T8, R>, t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8): WrappedObject<R> {
        return wrapList(longListFunction.andThen(aroundObjectByList()), t1, t2, t3, t4, t5, t6, t7, t8)
    }

    fun <R> wrapObject(page: PageKT, longListFunction: Supplier<R>): WrappedObject<R> {
        val function = Function<R, R> { longListFunction.get() }
        return wrapList<R, R>(page, function.andThen<List<R>>(aroundObjectByList<R>()), null)
    }

    fun <T1, R> wrapObject(page: PageKT, longListFunction: Function<T1, R>, t1: T1): WrappedObject<R> {
        return wrapList(page, longListFunction.andThen(aroundObjectByList()), t1)
    }

    fun <T1, T2, R> wrapObject(page: PageKT, longListFunction: BiFunction<T1, T2, R>, t1: T1, t2: T2): WrappedObject<R> {
        return wrapList(page, longListFunction.andThen(aroundObjectByList()), t1, t2)
    }

    fun <T1, T2, T3, R> wrapObject(page: PageKT, longListFunction: Function3<T1, T2, T3, R>, t1: T1, t2: T2, t3: T3): WrappedObject<R> {
        return wrapList(page, longListFunction.andThen(aroundObjectByList()), t1, t2, t3)
    }

    fun <T1, T2, T3, T4, R> wrapObject(page: PageKT, longListFunction: Function4<T1, T2, T3, T4, R>, t1: T1, t2: T2, t3: T3, t4: T4): WrappedObject<R> {
        return wrapList(page, longListFunction.andThen(aroundObjectByList()), t1, t2, t3, t4)
    }

    fun <T1, T2, T3, T4, T5, R> wrapObject(page: PageKT, longListFunction: Function5<T1, T2, T3, T4, T5, R>, t1: T1, t2: T2, t3: T3, t4: T4, t5: T5): WrappedObject<R> {
        return wrapList(page, longListFunction.andThen(aroundObjectByList()), t1, t2, t3, t4, t5)
    }

    fun <T1, T2, T3, T4, T5, T6, R> wrapObject(page: PageKT, longListFunction: Function6<T1, T2, T3, T4, T5, T6, R>, t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6): WrappedObject<R> {
        return wrapList(page, longListFunction.andThen(aroundObjectByList()), t1, t2, t3, t4, t5, t6)
    }

    fun <T1, T2, T3, T4, T5, T6, T7, R> wrapObject(page: PageKT, longListFunction: Function7<T1, T2, T3, T4, T5, T6, T7, R>, t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7): WrappedObject<R> {
        return wrapList(page, longListFunction.andThen(aroundObjectByList()), t1, t2, t3, t4, t5, t6, t7)
    }

    fun <T1, T2, T3, T4, T5, T6, T7, T8, R> wrapObject(page: PageKT, longListFunction: Function8<T1, T2, T3, T4, T5, T6, T7, T8, R>, t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8): WrappedObject<R> {
        return wrapList(page, longListFunction.andThen(aroundObjectByList()), t1, t2, t3, t4, t5, t6, t7, t8)
    }

    fun <R> aroundObjectByList(): Function<R, List<R>> {
        return Function { r ->
            if (r is List<*>)
                throw RuntimeException("Класс " + r + " уже является списком,  для работы с ни необходимо использовать медоты WrapperForService.wrapList")
            val rList = ArrayList<R>()
            rList.add(r)
            asList(r)
        }
    }

    fun <R> getError(e: Exception): WrappedObject<R> {
        throw RuntimeException(e.message, e)
    }

    fun <R> getOk(page: PageKT, apply: List<R>): WrappedObject<R> {
        return WrappedObject(page, apply)
    }

    fun <R> getOk(apply: List<R>): WrappedObject<R> {
        return WrappedObject(NULL_PAGE, apply)
    }

    fun <R> getOk(apply: R): WrappedObject<R> {
        return WrappedObject(NULL_PAGE, listOf(apply))
    }

    fun <R> getOk(page: PageKT, apply: R): WrappedObject<R> {
        return WrappedObject(page, listOf(apply))
    }


    class WrappedObject<OBJ> internal constructor(val page: PageKT, val objectList: List<OBJ>)

}

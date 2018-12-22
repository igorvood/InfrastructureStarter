package ru.vood.infrastructure.wrappers.kt

import io.vavr.*
import ru.vood.infrastructure.wrappers.*
import java.util.*
import java.util.function.BiFunction
import java.util.function.Function
import java.util.function.Supplier

interface WrapperForController : BeginnerOfChainFunctionInterface {

    fun <R> wrapObject(longListFunction: Supplier<WrapperForService.WrappedObject<R>>) =
            try {
                getOk(longListFunction.get())
            } catch (e: Exception) {
                getError<R>(e)
            }

    fun <T1, R> wrapObject(longListFunction: Function<T1, WrapperForService.WrappedObject<R>>, t1: T1) =
            try {
                getOk(longListFunction.apply(t1))
            } catch (e: Exception) {
                getError<R>(e)
            }

    fun <T1, T2, R> wrapObject(longListFunction: BiFunction<T1, T2, WrapperForService.WrappedObject<R>>, t1: T1, t2: T2) =
            try {
                getOk(longListFunction.apply(t1, t2))
            } catch (e: Exception) {
                getError<R>(e)
            }

    fun <T1, T2, T3, R> wrapObject(longListFunction: Function3<T1, T2, T3, WrapperForService.WrappedObject<R>>, t1: T1, t2: T2, t3: T3) =
            try {
                getOk(longListFunction.apply(t1, t2, t3))
            } catch (e: Exception) {
                getError<R>(e)
            }

    fun <T1, T2, T3, T4, R> wrapObject(longListFunction: Function4<T1, T2, T3, T4, WrapperForService.WrappedObject<R>>, t1: T1, t2: T2, t3: T3, t4: T4) =
            try {
                getOk(longListFunction.apply(t1, t2, t3, t4))
            } catch (e: Exception) {
                getError<R>(e)
            }

    fun <T1, T2, T3, T4, T5, R> wrapObject(longListFunction: Function5<T1, T2, T3, T4, T5, WrapperForService.WrappedObject<R>>, t1: T1, t2: T2, t3: T3, t4: T4, t5: T5) =
            try {
                getOk(longListFunction.apply(t1, t2, t3, t4, t5))
            } catch (e: Exception) {
                getError<R>(e)
            }

    fun <T1, T2, T3, T4, T5, T6, R> wrapObject(longListFunction: Function6<T1, T2, T3, T4, T5, T6, WrapperForService.WrappedObject<R>>, t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6) =
            try {
                getOk(longListFunction.apply(t1, t2, t3, t4, t5, t6))
            } catch (e: Exception) {
                getError<R>(e)
            }

    fun <T1, T2, T3, T4, T5, T6, T7, R> wrapObject(longListFunction: Function7<T1, T2, T3, T4, T5, T6, T7, WrapperForService.WrappedObject<R>>, t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7) =
            try {
                getOk(longListFunction.apply(t1, t2, t3, t4, t5, t6, t7))
            } catch (e: Exception) {
                getError<R>(e)
            }

    fun <T1, T2, T3, T4, T5, T6, T7, T8, R> wrapObject(longListFunction: Function8<T1, T2, T3, T4, T5, T6, T7, T8, WrapperForService.WrappedObject<R>>, t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8) =
            try {
                getOk(longListFunction.apply(t1, t2, t3, t4, t5, t6, t7, t8))
            } catch (e: Exception) {
                getError<R>(e)
            }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    fun <T1, R> validateAndWrapObject(validationFunction: Function<T1, ErrorMessage>, longListFunction: Function<T1, WrapperForService.WrappedObject<R>>, t1: T1): WrappedObject<R> {
        return try {
            val errorMessage = validationFunction.apply(t1)
            if (isNotValid(errorMessage))
                return validError(errorMessage)
            val apply = longListFunction.apply(t1)
            getOk(apply)
        } catch (e: Exception) {
            getError(e)
        }
    }

    fun <T1, T2, R> validateAndWrapObject(validationFunction: BiFunction<T1, T2, ErrorMessage>, longListFunction: BiFunction<T1, T2, WrapperForService.WrappedObject<R>>, t1: T1, t2: T2): WrappedObject<R> {
        try {
            val errorMessage = validationFunction.apply(t1, t2)
            if (isNotValid(errorMessage))
                return validError(errorMessage)
            val apply = longListFunction.apply(t1, t2)
            return getOk(apply)
        } catch (e: Exception) {
            return getError(e)
        }

    }

    fun <T1, T2, T3, R> validateAndWrapObject(validationFunction: Function3<T1, T2, T3, ErrorMessage>, longListFunction: Function3<T1, T2, T3, WrapperForService.WrappedObject<R>>, t1: T1, t2: T2, t3: T3): WrappedObject<R> {
        try {
            val errorMessage = validationFunction.apply(t1, t2, t3)
            if (isNotValid(errorMessage))
                return validError(errorMessage)
            val apply = longListFunction.apply(t1, t2, t3)
            return getOk(apply)
        } catch (e: Exception) {
            return getError(e)
        }

    }

    fun <T1, T2, T3, T4, R> validateAndWrapObject(validationFunction: Function4<T1, T2, T3, T4, ErrorMessage>, longListFunction: Function4<T1, T2, T3, T4, WrapperForService.WrappedObject<R>>, t1: T1, t2: T2, t3: T3, t4: T4): WrappedObject<R> {
        try {
            val errorMessage = validationFunction.apply(t1, t2, t3, t4)
            if (isNotValid(errorMessage))
                return validError(errorMessage)
            val apply = longListFunction.apply(t1, t2, t3, t4)
            return getOk(apply)
        } catch (e: Exception) {
            return getError(e)
        }

    }

    fun <T1, T2, T3, T4, T5, R> validateAndWrapObject(validationFunction: Function5<T1, T2, T3, T4, T5, ErrorMessage>, longListFunction: Function5<T1, T2, T3, T4, T5, WrapperForService.WrappedObject<R>>, t1: T1, t2: T2, t3: T3, t4: T4, t5: T5): WrappedObject<R> {
        try {
            val errorMessage = validationFunction.apply(t1, t2, t3, t4, t5)
            if (isNotValid(errorMessage))
                return validError(errorMessage)
            val apply = longListFunction.apply(t1, t2, t3, t4, t5)
            return getOk(apply)
        } catch (e: Exception) {
            return getError(e)
        }

    }

    fun <T1, T2, T3, T4, T5, T6, R> validateAndWrapObject(validationFunction: Function6<T1, T2, T3, T4, T5, T6, ErrorMessage>, longListFunction: Function6<T1, T2, T3, T4, T5, T6, WrapperForService.WrappedObject<R>>, t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6): WrappedObject<R> {
        try {
            val errorMessage = validationFunction.apply(t1, t2, t3, t4, t5, t6)
            if (isNotValid(errorMessage))
                return validError(errorMessage)
            val apply = longListFunction.apply(t1, t2, t3, t4, t5, t6)
            return getOk(apply)
        } catch (e: Exception) {
            return getError(e)
        }

    }

    fun <T1, T2, T3, T4, T5, T6, T7, R> validateAndWrapObject(validationFunction: Function7<T1, T2, T3, T4, T5, T6, T7, ErrorMessage>, longListFunction: Function7<T1, T2, T3, T4, T5, T6, T7, WrapperForService.WrappedObject<R>>, t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7): WrappedObject<R> {
        try {
            val errorMessage = validationFunction.apply(t1, t2, t3, t4, t5, t6, t7)
            if (isNotValid(errorMessage))
                return validError(errorMessage)
            val apply = longListFunction.apply(t1, t2, t3, t4, t5, t6, t7)
            return getOk(apply)
        } catch (e: Exception) {
            return getError(e)
        }

    }

    fun <T1, T2, T3, T4, T5, T6, T7, T8, R> validateAndWrapObject(validationFunction: Function8<T1, T2, T3, T4, T5, T6, T7, T8, ErrorMessage>, longListFunction: Function8<T1, T2, T3, T4, T5, T6, T7, T8, WrapperForService.WrappedObject<R>>, t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6, t7: T7, t8: T8): WrappedObject<R> {
        try {
            val errorMessage = validationFunction.apply(t1, t2, t3, t4, t5, t6, t7, t8)
            if (isNotValid(errorMessage))
                return validError(errorMessage)
            val apply = longListFunction.apply(t1, t2, t3, t4, t5, t6, t7, t8)
            return getOk(apply)
        } catch (e: Exception) {
            return getError(e)
        }

    }

    ///////////////////////

    fun isNotValid(errorMessage: ErrorMessage?): Boolean {
        return errorMessage !=
                null && errorMessage.errorMessages != null && errorMessage.errorMessages.size > 0
    }

    fun <R> validError(errorMessage: ErrorMessage): WrappedObject<R> {
        return WrappedObject<R>(CommonStatus.ERROR, null, errorMessage, null)
    }


    fun <T> getError(e: Exception): WrappedObject<T> {
        val errorMessage = ErrorMessage(listOf<String>(e.message!!))
        return WrappedObject(CommonStatus.ERROR, null, errorMessage, null)
    }

    fun <R> getOk(objectFromService: WrapperForService.WrappedObject<R>): WrappedObject<R> {
        return WrappedObject<R>(CommonStatus.OK,
                RestContext(Date(),
                        checkPage(objectFromService.page,
                                objectFromService.objectList)), null,
                objectFromService.objectList)
    }

    fun checkPage(page: Page, rs: List<*>): Page {
        return if (page === Page.NULL_PAGE) Page(rs.size) else page
    }


    class WrappedObject<OBJ> {
        var status: CommonStatus? = null
        var context: RestContext? = null
        var errorMessages: ErrorMessage? = null
        var objectList: List<OBJ>? = null

        constructor() {}

        constructor(status: CommonStatus, context: RestContext?, errorMessages: ErrorMessage?, objectList: List<OBJ>?) {
            this.status = status
            this.context = context
            this.errorMessages = errorMessages
            this.objectList = objectList
        }
    }

}

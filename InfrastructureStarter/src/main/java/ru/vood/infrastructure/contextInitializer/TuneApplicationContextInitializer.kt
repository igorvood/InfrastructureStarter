package ru.vood.infrastructure.contextInitializer

import org.slf4j.LoggerFactory
import org.springframework.context.ApplicationContextInitializer
import org.springframework.context.ConfigurableApplicationContext
import ru.vood.infrastructure.annotation.Tune
import ru.vood.infrastructure.annotation.TuneCode
import ru.vood.infrastructure.annotation.TuneDescription
import ru.vood.infrastructure.annotation.TuneId

class TuneApplicationContextInitializer : ApplicationContextInitializer<ConfigurableApplicationContext> {
    private val log = LoggerFactory.getLogger(TuneApplicationContextInitializer::class.java)
    var mapTune = HashMap<Class<*>, TuneData>()
    override fun initialize(applicationContext: ConfigurableApplicationContext) {
        log.debug("Поиск классов-настроек.")
        val reflections = Reflections("ru", SubTypesScanner(false))
        val allTypes = reflections.allTypes
        val listClass = allTypes.map { s -> Class.forName(s) }
        val classAnnotatedByTune = getClassAnnotatedBy(listClass, Tune::class.java)

        for (cl in classAnnotatedByTune) {
            val declaredFields = cl.declaredFields
            val tuneData = TuneData()
            tuneData.cl = cl
            for (f in declaredFields) {
                val annotationTuneId = f.getAnnotation(TuneId::class.java)
                val annotationTuneCode = f.getAnnotation(TuneCode::class.java)
                val annotationTuneDescription = f.getAnnotation(TuneDescription::class.java)
                if (tuneData.id == null && annotationTuneId != null)
                    tuneData.id = f
                if (tuneData.code == null && annotationTuneCode != null)
                    tuneData.code = f
                if (tuneData.description == null && annotationTuneDescription != null)
                    tuneData.description = f
            }
            if (tuneData.cl != null && tuneData.id != null && tuneData.code != null && tuneData.description != null)
                mapTune.put(tuneData.cl!!, tuneData)
            else
                log.warn("- Класс ${tuneData.cl.toString()} не полностью аннтирован.")
        }

        mapTune.forEach { t -> log.warn(("+ Успешно аннторированный класс ${t.key} ")) }

        val clazz = classAnnotatedByTune[0]

        println(clazz)
        val annotations = listClass[0].annotations

        val kClass = TuneKT::class
        val java = TuneKT::class.java


        val contains = annotations.map { a -> a::class.java }

        //annotations.
        //allTypes.forEach { s -> println(s) }
        println(contains)
        println(Tune::class.java)
        println(TuneKT::class.java)
        println("===============================")


        val forName = Class.forName(allTypes.first())
        println(forName)

    }

    inline fun getClassAnnotatedBy(listClass: List<Class<*>>, element: Class<*>) =
            listClass
                    .filter { cl ->
                        cl.annotations
                                .map { ann -> ann.annotationClass.java }
                                .contains(element)
                    }


}
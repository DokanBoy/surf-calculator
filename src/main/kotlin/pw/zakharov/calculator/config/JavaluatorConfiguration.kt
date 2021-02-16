package pw.zakharov.calculator.config

import com.fathzer.soft.javaluator.DoubleEvaluator
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class JavaluatorConfiguration {

    @Bean
    fun doubleEvaluator(): DoubleEvaluator {
        return DoubleEvaluator()
    }

}
import ch.qos.logback.classic.PatternLayout
import ch.qos.logback.core.ConsoleAppender

import static ch.qos.logback.classic.Level.TRACE
import static ch.qos.logback.classic.Level.DEBUG
import static ch.qos.logback.classic.Level.INFO
import static ch.qos.logback.classic.Level.WARN
import static ch.qos.logback.classic.Level.ERROR


appender("STDOUT", ConsoleAppender) {
    layout(PatternLayout) {
        pattern = "%d{HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %msg%n"
    }
}
logger("com.javabilities.demo", INFO)
root(WARN, ["STDOUT"])

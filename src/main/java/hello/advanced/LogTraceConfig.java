package hello.advanced;


import hello.advanced.trace.logtrace.FieldLogTrace;
import hello.advanced.trace.logtrace.LogTrace;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //<-여기안에 @Component가 있다.
public class LogTraceConfig {

    @Bean //수동 빈등록
    public LogTrace logTrace() {
        return new FieldLogTrace();
    }
}

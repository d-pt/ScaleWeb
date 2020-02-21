package spring;

import org.springframework.session.web.context.AbstractHttpSessionApplicationInitializer;

// @formatter:off
// tag::class[]
public class Initializer
        extends AbstractHttpSessionApplicationInitializer
{ // <1>

    public Initializer() {
        super(SessionConfig.class); // <2>
    }

}
// end::class[]
// @formatter:on

package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@Configuration
//@Import(EmbeddedRedisConfig.class)

//@Profile("embedded-redis")
@EnableRedisHttpSession

public class SessionConfig  {

    @Autowired
    private Environment env;

    public SessionConfig(Environment env) {
        this.env = env;
    }

    @Bean
    public JedisConnectionFactory connectionFactory() {
        JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory();
        jedisConnectionFactory.setHostName(env.getProperty("REDIS_HOST"));
        System.out.println("connecting to redis host name:"
                            + env.getProperty("REDIS_HOST"));
        return jedisConnectionFactory;
    }
}

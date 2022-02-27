package net.hyuck.web.api;



import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * packageName: net.hyuck.web.api
 * fileName   : Corsconfig
 * author     : HYUCK7
 * date       : 2022/02/27
 * desc       :
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022/02/27         HYUCK7         최초 생성
 */

@Configuration
public class corsConfig implements WebMvcConfigurer {

            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry
                        .addMapping("/**")
                        .allowedMethods(CorsConfiguration.ALL)
                        .allowedHeaders(CorsConfiguration.ALL)
                        .allowedOriginPatterns(CorsConfiguration.ALL);
            }
        };

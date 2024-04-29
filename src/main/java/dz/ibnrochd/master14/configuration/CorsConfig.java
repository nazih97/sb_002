package dz.ibnrochd.master14.configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {
    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        
        // Autorise les requêtes provenant de tous les origines (domaines)
        config.addAllowedOrigin("*");
        
        // Autorise les méthodes HTTP suivantes
        config.addAllowedMethod("GET");
        config.addAllowedMethod("POST");
        config.addAllowedMethod("PUT");
        config.addAllowedMethod("DELETE");
        
        // Autorise les en-têtes HTTP suivants
        config.addAllowedHeader("Content-Type");
        config.addAllowedHeader("Authorization");
        
        // Autorise l'envoi de cookies et d'informations d'identification
        config.setAllowCredentials(true);
        
        source.registerCorsConfiguration("/**", config);
        
        return new CorsFilter(source);
    }
}
package com.shell.siep.gto.properties;

import com.shell.siep.gto.configurations.YamlPropertySourceFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;
import java.util.Map;

@Configuration
@ConfigurationProperties(prefix = "search")
@PropertySource(value = "classpath:searchVariables.yaml", factory = YamlPropertySourceFactory.class)

public class SearchVariableProperties {

    private Map<String, List<SearchVariable>> variables;

    public Map<String, List<SearchVariable>> getVariables() {
        return variables;
    }

    public void setVariables(Map<String, List<SearchVariable>> variables) {
        this.variables = variables;
    }
}


package com.shell.siep.gto.properties;

import com.shell.siep.gto.configurations.YamlPropertySourceFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;
import java.util.Map;

@Configuration
@ConfigurationProperties(prefix = "data")
@PropertySource(value = "classpath:categories.yaml", factory = YamlPropertySourceFactory.class)

public class DataCategoryProperties {

    private Map<String, List<String>> categories;

    public Map<String, List<String>> getCategories() {
        return categories;
    }

    public void setCategories(Map<String, List<String>> categories) {
        this.categories = categories;
    }
}

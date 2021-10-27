package com.shell.siep.gto.pigi.properties;

import com.shell.siep.gto.configurations.YamlPropertySourceFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;
import java.util.Map;

@Configuration
@ConfigurationProperties(prefix = "gto")
@PropertySource(value = "classpath:properties.yaml", factory = YamlPropertySourceFactory.class)
public class PigiProperties {

  private Map<String, List<PigiProperty>> properties;

  public Map<String, List<PigiProperty>> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, List<PigiProperty>> properties) {
    this.properties = properties;
  }
}


package com.shell.siep.gto.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service("geoToolsUtil")
public class ApplicationUtility {

	@Value("${application.salt}")
	private String salt;

	private ObjectMapper mapper = new ObjectMapper();
	private static final Logger logger = LoggerFactory.getLogger(ApplicationUtility.class);

	public String toJSON(Object o) {
		String result = "";
		if (o != null) {
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			try {
				mapper.writeValue(out, o);
			} catch (IOException e) {
				logger.error("IOException marshalling to json", e);
			}
			result = out.toString(StandardCharsets.UTF_8);
		}
		return result;
	}

	public String getConcatenatedString(String username, String hashedPassword){
		StringBuilder sb = new StringBuilder("$2a");
		sb.append(username)
				.append(hashedPassword);
		return sb.toString();
	}

	public String getAuthKey(String stringToHash) {
		return getBcryptHashedString(stringToHash);
	}
	public String getAuthKey(String username, String password) {
		return getBcryptHashedString(getConcatenatedString(username, password));

	}

	public String getBcryptHashedString(String toHashString) {
		return BCrypt.hashpw(toHashString, BCrypt.gensalt(salt, 12));
	}

	public boolean verifyHashString( String originalString, String hashedString) {
		return BCrypt.checkpw(originalString, hashedString);
	}
}

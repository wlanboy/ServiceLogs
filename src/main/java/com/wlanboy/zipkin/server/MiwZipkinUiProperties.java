package com.wlanboy.zipkin.server;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("zip.ui")
public class MiwZipkinUiProperties {
    /**
     * Roles authorized to access the Zipkin UI
     */
//    private String[] authorizedRoles = new String[] { "ADMIN" };
//    
//    public String[] getAuthorizedRoles() {
//        return authorizedRoles;
//    }
//    
//    public void setAuthorizedRoles(String[] authorizedRoles) {
//        this.authorizedRoles = authorizedRoles;
//    }
}

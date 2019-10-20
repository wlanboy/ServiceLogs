package com.wlanboy.zipkin.server;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.security.SecurityProperties;
//import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.annotation.Order;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.web.util.matcher.AnyRequestMatcher;
//import org.springframework.security.web.util.matcher.NegatedRequestMatcher;

import zipkin.server.internal.EnableZipkinServer;
import zipkin.server.internal.RegisterZipkinHealthIndicators;
//import zipkin.server.ZipkinServer;

@EnableZipkinServer
@EnableConfigurationProperties(MiwZipkinUiProperties.class)
@SpringBootApplication
public class ZipkinServiceApplication { // extends ZipkinServer

	public static void main(String[] args) {
		new SpringApplicationBuilder(ZipkinServiceApplication.class).listeners(new RegisterZipkinHealthIndicators())
				.properties("spring.config.name=zipkin-server").run(args);
	}

	// @Configuration
	// public static class ZipkinServiceSecurityConfigurer extends
	// ResourceServerConfigurerAdapter {
	// @Override
	// public void configure(HttpSecurity http) throws Exception {
	// http.requestMatcher(new NegatedRequestMatcher(AnyRequestMatcher.INSTANCE));
	// }
	// }

	// @Configuration
	// @Order(SecurityProperties.ACCESS_OVERRIDE_ORDER - 2)
	// @EnableOAuth2Sso
	// public static class WebSecurityConfiguration extends
	// WebSecurityConfigurerAdapter {
	// @Autowired
	// private MiwZipkinUiProperties properties;
	//
	// @Override
	// protected void configure(HttpSecurity http) throws Exception {
	// http
	// .requestMatchers().antMatchers("/", "/login", "/zipkin/**").and()
	// .headers().frameOptions().sameOrigin().and()
	// .authorizeRequests()
	// .anyRequest().hasAnyAuthority(properties.getAuthorizedRoles());
	// }
	// }
}

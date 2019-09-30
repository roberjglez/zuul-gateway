package com.rjgonzalez.zuul.arquitecture.challenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.rjgonzalez.zuul.arquitecture.challenge.filters.ErrorFilter;
import com.rjgonzalez.zuul.arquitecture.challenge.filters.PostFilter;
import com.rjgonzalez.zuul.arquitecture.challenge.filters.PreFilter;
import com.rjgonzalez.zuul.arquitecture.challenge.filters.RouteFilter;

@SpringBootApplication
@EnableZuulProxy
public class ZuulInsurancesArquitectureChallengeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulInsurancesArquitectureChallengeApplication.class, args);
	}

	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}

	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}

	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}

	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}
}

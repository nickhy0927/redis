package com.redis.home;

import java.util.Locale;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@Controller
@RequestMapping(value = "/portol")
public class HomeController {
	@Resource
	SessionLocaleResolver localeResolver;

	@RequestMapping("/change")
	public String language(HttpServletRequest request, HttpServletResponse response,
			@PathParam("language") String language) {
		language = language.toLowerCase();
		if (language == null || language.equals("")) {
			return "index";
		} else {
			if (language.equals("zh_cn")) {
				localeResolver.setLocale(request, response, Locale.CHINA);
			} else if (language.equals("en_us")) {
				localeResolver.setLocale(request, response, Locale.ENGLISH);
			} else {
				localeResolver.setLocale(request, response, Locale.CHINA);
			}
		}
		return "index";
	}
}

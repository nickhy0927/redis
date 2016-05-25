package com.redis.home;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@Controller
public class HomeController {

	@Resource
	SessionLocaleResolver localeResolver;

	/**
	 * 语言切换
	 */
	@RequestMapping("/change")
	public String language(HttpServletRequest request, HttpServletResponse response, String language) {
//		language = language.toLowerCase();
//		if (language == null || language.equals("")) {
//			return new ModelAndView("index");
//		} else {
//			if (language.equals("zh_cn")) {
//				localeResolver.setLocale(request, response, Locale.CHINA);
//			} else if (language.equals("en_us")) {
//				localeResolver.setLocale(request, response, Locale.ENGLISH);
//			} else {
//				localeResolver.setLocale(request, response, Locale.CHINA);
//			}
//		}

		return "index";
	}
}

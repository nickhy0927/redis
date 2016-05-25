package com.redis.home;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import org.springframework.web.servlet.support.RequestContext;

@Controller
public class HomeController {
	@Resource
	SessionLocaleResolver localeResolver;

	/**
	 * 语言切换
	 */
	@RequestMapping("/change")
	public String language(HttpServletRequest request, HttpServletResponse response, String language,Model model) {
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

		//从后台代码获取国际化信息
        RequestContext requestContext = new RequestContext(request);
		model.addAttribute("username",requestContext.getMessage("platform.user.username"));
		return "index";
	}
}

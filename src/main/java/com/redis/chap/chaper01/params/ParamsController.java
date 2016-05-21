package com.redis.chap.chaper01.params;

import javax.servlet.http.HttpSession;

import org.apache.tools.ant.taskdefs.condition.Http;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

@Controller
public class ParamsController {

	/**
	 * 获取参数的第一中方式
	 * 
	 * @return
	 */
	@RequestMapping(value = "/params/getParams01/{userId}.html")
	public String getParams01(@PathVariable("userId") String userId) {

		return "";
	}

	/**
	 * 获取sessionId
	 * 
	 * @param sessionId
	 * @return
	 */
	@RequestMapping(value = "/params/getCookie.html")
	public String getCookie(@CookieValue("JSESSIONID") String sessionId) {

		return "";
	}
	
	/**
	 * 设置session信息
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/params/servletSession.html")
	public String servletSession(HttpSession session) {
		session.setAttribute("username", "张三");
		return "";
	}
	
	@RequestMapping(value = "/params/servletSession.html")
	public ModelAndView modelAndView() {
		ModelAndView modelAndView = new ModelAndView("模版");
		return modelAndView;
	}
}

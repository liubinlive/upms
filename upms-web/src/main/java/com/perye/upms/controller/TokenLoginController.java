package com.perye.upms.controller;

import com.perye.common.base.BaseController;
import org.springframework.stereotype.Controller;

/**
 * Token鉴权登录
 * @Author: Perye
 * @Date: 2019-03-26
 */
@Controller
public class TokenLoginController extends BaseController {

//	@SuppressWarnings("rawtypes")
//	@Reference
//	private JwtGenerator generator;
//
//	@Reference
//	private CasRestFormClient casRestFormClient;
//
//	@Value("${sso.cas.serviceUrl}")
//	private String serviceUrl;
//
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	@RequestMapping("/user/login")
//	@ResponseBody
//	public Object login(HttpServletRequest request, HttpServletResponse response) {
//		Map<String, Object> model = new HashMap<>();
//		J2EContext context = new J2EContext(request, response);
//		final ProfileManager<CasRestProfile> manager = new ProfileManager(context);
//		final Optional<CasRestProfile> profile = manager.get(true);
//		// 获取ticket
//		TokenCredentials tokenCredentials = casRestFormClient.requestServiceTicket(serviceUrl, profile.get(), context);
//		// 根据ticket获取用户信息
//		final CasProfile casProfile = casRestFormClient.validateServiceTicket(serviceUrl, tokenCredentials, context);
//		// 生成jwt token
//		String token = generator.generate(casProfile);
//		model.put("token", token);
//		return model;
//	}
//
//	@GetMapping("/user/detail")
//	@ResponseBody
//	public Object detail(HttpServletRequest request) {
//		return "users:" + request.getUserPrincipal().getName();
//	}

}

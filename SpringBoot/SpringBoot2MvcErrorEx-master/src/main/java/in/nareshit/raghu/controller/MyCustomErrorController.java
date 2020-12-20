package in.nareshit.raghu.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.autoconfigure.web.servlet.error.AbstractErrorController;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyCustomErrorController extends AbstractErrorController {

	public MyCustomErrorController(ErrorAttributes errorAttributes) {
		super(errorAttributes);
	}

	@RequestMapping(value = "/error")
	public @ResponseBody Map<String, Object> handleError(HttpServletRequest request) {
		@SuppressWarnings("deprecation")
		Map<String, Object> errorAttributes = super.getErrorAttributes(request, true);
		return errorAttributes;
	}

	@Override
	public String getErrorPath() {
		return "/error";
	}
}
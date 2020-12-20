package in.nareshit.raghu.validate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import in.nareshit.raghu.model.CaptchaResponse;

@Component
public class CaptchaValidator {
	
	@Autowired
	private RestTemplate rt;

	public boolean isValid(String captcha) {
		String url="https://www.google.com/recaptcha/api/siteverify";
		String params="?secret=6LcN4dAZAAAAAHg63X23sCWJ2lmCh-xVBEM1eMdU&response="+captcha;    
		CaptchaResponse resp = rt.postForObject(
				url+params, null,CaptchaResponse.class);
		return resp.isSuccess();
	}
}

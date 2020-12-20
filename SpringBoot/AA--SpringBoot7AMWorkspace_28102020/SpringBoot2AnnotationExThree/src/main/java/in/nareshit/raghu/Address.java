package in.nareshit.raghu;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//ctrl+shift+O (imports)
@Component("aob")
public class Address {
	@Value("5-A")
	private String hno;
	@Value("HYD")
	private String loc;
	// > Source > generate toString()
	// alt+shift+S then S then Generate
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", loc=" + loc + "]";
	}
	
}

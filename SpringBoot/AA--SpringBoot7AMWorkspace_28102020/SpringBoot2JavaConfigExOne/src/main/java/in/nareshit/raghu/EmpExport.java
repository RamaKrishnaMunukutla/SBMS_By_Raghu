package in.nareshit.raghu;

public class EmpExport {

	private Integer code;
	private String name;
	
	// > source > Generate getters and setters > select All > Generate 
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	// > source > Generate toString > Generate 
	@Override
	public String toString() {
		return "EmpExport [code=" + code + ", name=" + name + "]";
	}
	
	
}

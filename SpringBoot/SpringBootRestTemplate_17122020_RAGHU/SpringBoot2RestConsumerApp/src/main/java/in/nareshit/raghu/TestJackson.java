package in.nareshit.raghu;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.nareshit.raghu.model.Employee;

public class TestJackson {


	public static void main(String[] args) {
		//JSON to Object

		try {
			//1. Create JSON String
			String json="{\"id\":55,\"name\":\"AA\",\"sal\":33.0}";

			//2. Create ObjectMapper (C) object
			ObjectMapper om = new ObjectMapper();

			//3. call read__() method
			Employee emp = om.readValue(json, Employee.class);

			//4. print object
			System.out.println(emp.toString());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main1(String[] args) {
		//Object to JSON

		try {
			//1. Create Model class Object
			Employee emp = new Employee(55, "AA", 33.0);

			//2. Create ObjectMapper (C) object
			ObjectMapper om = new ObjectMapper();

			//3. call write__() method
			String json = om.writeValueAsString(emp);

			//4. Print JSON
			System.out.println(json);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

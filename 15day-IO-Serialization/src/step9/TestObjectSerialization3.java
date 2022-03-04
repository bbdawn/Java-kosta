package step9;

import java.io.IOException;

public class TestObjectSerialization3 {
	public static void main(String[] args) {
		CarService service=new CarService();
		service.addCar(new Car("k5",2000));
		service.addCar(new Car("SM6",2500));
		service.addCar(new Car("모닝",1000));
		//try
		try {
			service.saveList();
			System.out.println("**자동차 리스트를 직렬화하여 파일에 저장**");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//catch
	}
}

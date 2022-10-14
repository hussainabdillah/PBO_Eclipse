package Conference;

import University.Staff;

public class Outsourcing extends Staff {
	String instansi = "ums";
	
	Outsourcing (String masukan){
		super(masukan);
		System.out.println("Objek outsourcing delegasi berhasil dibuat");
		
	}
	
	public void message() {
		System.out.println("Hi saya outsourcing" + nama);
	}
}

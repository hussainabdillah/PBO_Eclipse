package Conference;

import University.Student;

public class Delegasi extends Student {
	String instansi = "ums";
	
	
	Delegasi(String masukan){
		super(masukan);
		System.out.println("Objek delegasi berhasil dibuat");
		}
	
	Delegasi(){
		System.out.println("Objek mahasiwa berhasil dibuat");
	}
	
	public void pesan() {
		System.out.println("Hi");
	}

	void cetakNama() {
		System.out.println(this.nama);
		
	}
	void cetakAlamat() {
		System.out.println(this.alamat);
		
	}
	
	
}
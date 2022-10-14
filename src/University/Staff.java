package University;

public class Staff {
	protected String nama;
	protected String address;
	double gaji;
	String staffId; 
	String pesan;
	
	public Staff() {
		System.out.println("Objek staff berhasil dibuat");
	}
	
	public Staff(String masukan) {
		this();
		this.nama = masukan;
	}
	
	public Staff(String masukan,double nilai ) {
		this(masukan);
		this.gaji = nilai;
	}
	
	public void message() {
		System.out.println("Hello saya staff");
	}
	
	public void message(String masukan) {
		this.message();
		this.pesan = masukan;
	}
	
}
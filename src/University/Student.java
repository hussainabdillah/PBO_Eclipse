package University;

public class Student {
	public String nama = "student";
	String nim;
	public String alamat = "Sukoharjo" ;
	double ipk;
	static final double maxIPK = 4.00;
	
	
	public Student() {
		System.out.println("Objek mahasiwa berhasil dibuat");
	}
	
	public Student(String masukan){
		this();
		this.nama = masukan;	
	}
	
	public Student(String masukan, double nilai ) {
		this(masukan);
		this.ipk = nilai;
	}
	
	public void pesan() {
		System.out.println("Hello");
	}
	
	void isiKRS() {
		System.out.println("Mahasiswa telah mengisi KRS");
	}
	
	double ambilNilai() {
		return ipk;
	}
	
	void revisiNilai(double ipkBaru) {
		this.ipk = ipkBaru;
	}
	
	
	
}
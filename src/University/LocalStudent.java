package University;

public class LocalStudent extends Student {
	double ambilNilai() {
		super.ambilNilai();
		System.out.println("NIM mahasiswa" + nim );
		return ipk;
	}
}

package University;

import java.util.Scanner;

public class UniversityDemo {
    public static void main(String[] args) {
//        int number = 2021;
//        System.out.println("Hello, Informatics Students");
//        System.out.println(number);
    	
//    	Scanner inp = new Scanner(System.in);
//    	System.out.println("Enter a Name:");
//    	String nameUser = inp.nextLine();
////    	System.out.println("Your name is " + nameUser);
//    	
//    	Student student1 = new Student();
//    	student1.name = nameUser;
//    	System.out.println("The name of the student 1 is " + student1.name);
//    	
//    	Student student2 = new Student();
//    	System.out.println("The name of the student 2 is " + student2.name);
    			
    	Student mhs1 = new Student();
    	mhs1.nama = "Hussain";
    	mhs1.nim = "l200214201";
    	mhs1.alamat ="Solo";
    	mhs1.ipk = 3.5;
//    	Student.maxIPK = 4.00;http://marketplace.eclipse.org/marketplace-client-intro?mpc_install=4240174
    	
    	System.out.println(mhs1.nama);
    	System.out.println(mhs1.nim);
    	System.out.println(mhs1.alamat);
    	System.out.println(mhs1.ipk);
    	System.out.println(Student.maxIPK);
    	
    	mhs1.isiKRS();
    	System.out.println(mhs1.ambilNilai());
    	mhs1.revisiNilai(3.7);
    	System.out.println(mhs1.ambilNilai());
    	
    	
    }
}
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner myObj = new  Scanner(System.in);
		int pilih;
		boolean exit = false;
		boolean loop = false;
		System.out.println("Tugas Pertama, Pandu Dhaulagiri, 124190044");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		Pelamar baru = new Pelamar();
		while(exit == false) {
			System.out.println("Menu");
			System.out.println("1. Android");
			System.out.println("2. Web");
			System.out.println("3. Exit");
			pilih = myObj.nextInt();
			if(pilih == 1) {
				while(loop==false) {
					System.out.println("1. Tampil");
					System.out.println("2. Edit");
					System.out.println("3. Keluar");
					int pilihlagi = myObj.nextInt();myObj.nextLine();
					if(pilihlagi==2) {
						System.out.println("Masukan Nama: ");
						baru.nama = myObj.nextLine();
						System.out.println("Masukan NIK: ");
						baru.NIK = myObj.nextLine();
						System.out.println("Nilai Tulis: ");
						baru.tulis = myObj.nextInt();
						System.out.println("Nilai Wawancara: ");
						baru.wawancara = myObj.nextInt();
						System.out.println("Nilai Coding: ");
						baru.code = myObj.nextInt();
						baru.setAll();
					}
					else if(pilihlagi==1) {
						System.out.println("Masukan Nama: " + baru.nama);
						System.out.println("Masukan NIK: "+ baru.NIK);
						System.out.println("Nilai Tulis: " + baru.tulis);
						System.out.println("Nilai Wawancara: "+ baru.wawancara);
						System.out.println("Nilai Coding: "+baru.code);
						System.out.println("Nilai Total: " + baru.total(0));
						if (baru.total(0)>=85){
							System.out.println("Selamat anda Lolos");
						}
						else {
							System.out.println("Selamat anda belum lolos");
						}

					}
					else if(pilihlagi==3) {
						loop=true;
					}
					
				}
					
			}
			if(pilih==2) {
				while(loop==false) {
				System.out.println("1. Tampil");
				System.out.println("2. Edit");
				System.out.println("3. Keluar");
				int pilihlagi;
				pilihlagi = myObj.nextInt();myObj.nextLine();
				if(pilihlagi==2) {
					
					System.out.println("Masukan Nama: ");
					baru.nama = myObj.nextLine();
					System.out.println("Masukan NIK: ");
					baru.NIK = myObj.nextLine();
					System.out.println("Nilai Tulis: ");
					baru.tulis = myObj.nextInt();
					System.out.println("Nilai Wawancara: ");
					baru.wawancara = myObj.nextInt();
					System.out.println("Nilai Coding: ");
					baru.code = myObj.nextInt();
					baru.setAll();
				}
				else if(pilihlagi==1) {
					System.out.println("Masukan Nama: " + baru.nama);
					System.out.println("Masukan NIK: "+ baru.NIK);
					System.out.println("Nilai Tulis: " + baru.tulis);
					System.out.println("Nilai Wawancara: "+ baru.wawancara);
					System.out.println("Nilai Coding: "+baru.code);
					System.out.println("Nilai Total: " + baru.total(1));
					if(baru.total(1)>=85) {
						System.out.println("Selamat anda Lolos");
					}
					else {
						System.out.println("Selamat anda belum lolos");
					}

				}
				else if(pilihlagi==3) {
					loop=true;
				}
				}
			}
			if(pilih==3) {
				exit=true;
				myObj.close();
			}
			}
		
		}
	}

final class Pelamar extends Tes {
	String nama;
	String NIK;
	double tulis;
	double code;
	double wawancara;
	double total;
	
	void setAll() {
		setTulis(tulis);
		setCoding(code);
		setWawancara(wawancara);
	}
	double total(int n) {
		if(n==0) {
			total=tulis*20/100+code*50/100+wawancara*30/100;
		}
		else if(n==1) {
			total=tulis*40/100+code*35/100+wawancara*25/100;
		}
		return total;
	}
}

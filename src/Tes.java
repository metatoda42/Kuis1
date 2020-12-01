public class Tes implements fish{
	
	private static double tulis;
	private static double coding;
	private static double wawancara;
	private static String nama;
	private static String NIK;

	public void setTulis(double x) {
		Tes.tulis = x;
	}
	public void setCoding(double y) {
		Tes.coding = y;
	}
	public void setWawancara(double z) {
		Tes.wawancara = z;
	}
	public double getTulis() {
		return Tes.tulis;
	}
	public double getCoding() {
		return Tes.coding;
	}
	public double getWawancara() {
		return Tes.wawancara;
	}
	
	public void setNama(String n) {
		Tes.nama = n;
	}
	public void setNIK(String n) {
		Tes.NIK = n;
	}
	
	public String getNama() {
		return Tes.nama;
	}
	public String getNIK() {
		return Tes.NIK;
	}
	
	
}

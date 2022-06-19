package praktikum.modul3.Inda;
public class BiodataTetangga {
	private String Nama_Tetangga;
	private String TTL;
	private String Alamat;
	private String Jenis_Kelamin;
	private String Pekerjaan;
	public BiodataTetangga() {
		}
	public BiodataTetangga(String Nama_Tetangga, String TTL, String Alamat, String Jenis_Kelamin, String Pekerjaan)
		{
		this.Nama_Tetangga=Nama_Tetangga;
		this.TTL=TTL;
		this.Alamat=Alamat;
		this.Jenis_Kelamin=Jenis_Kelamin;
		this.Pekerjaan=Pekerjaan;
		}
		public String getNama_Tetangga() {
			return Nama_Tetangga;
		}
		public String getTTL() {
			return TTL;
		}
		public String getAlamat() {
			return Alamat;
			}
		public String getJenis_Kelamin() {
			return Jenis_Kelamin;
			}
		public String getPekerjaan() {
			return Pekerjaan;
			}
		public void setNama_Tetangga(String Nama_Tetangga) {
			this.Nama_Tetangga=Nama_Tetangga;
		}
		public void setTTL(String TTL) {
			this.TTL=TTL;
		}
		public void setAlamat(String Alamat) {
			this.Alamat=Alamat;
		}
		public void setJenis_Kelamin(String Jenis_Kelamin) {
			this.Jenis_Kelamin=Jenis_Kelamin;
		}
		public void setPekerjaan(String Pekerjaan) {
			this.Pekerjaan=Pekerjaan;
		}
		public String toString() {
			String HV1 = " ";
			HV1 = "\nNama Tetangga : " + getNama_Tetangga()
			+ "\nTTL : " + getTTL() 
			+ "\nAlamat : " + getAlamat() 
			+ "\nJenis Kelamin : " + getJenis_Kelamin() 
			+ "\nPekerjaan : " + getPekerjaan();
			return HV1;
			}
		public String toString1() {
			String HV2 = " ";
			HV2 = "Nama Tetangga : " + getNama_Tetangga()
			+ "TTL : " + getTTL() 
			+ "Alamat : " + getAlamat() 
			+ "Jenis Kelamin : " + getJenis_Kelamin() 
			+ "Pekerjaan : " + getPekerjaan();
			return HV2;
			}
		public String toString2() {
			String HV3 = " ";
			HV3 = "Nama Tetangga : " + getNama_Tetangga()
			+ "TTL : " + getTTL() 
			+ "Alamat : " + getAlamat() 
			+ "Jenis Kelamin : " + getJenis_Kelamin() 
			+ "Pekerjaan : " + getPekerjaan();
			return HV3;
			}
}

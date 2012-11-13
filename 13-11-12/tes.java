import fredy.a;
	public class tes{
	public static void main(String[]args){
			a arema = new a();  //bikin objek a.java, dikasi nama arema
			
			String hasilnama = arema.nama();//jalanin method nama() di a.java nya
			System.out.println(hasilnama);
			
			int hasil= arema.hitung(4,2);//jalanin method hitung() di a.java nya
			System.out.println(hasil);
		}
	}
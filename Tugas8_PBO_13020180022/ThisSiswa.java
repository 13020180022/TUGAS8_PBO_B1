class ThisSiswa{ String nama; 
String nim; 
void isiData ( String nama,String nim) { 
	this.nama=nama; 
	this.nim=nim; 
} 
public static void main ( String [ ] args){ 
	ThisSiswa mahasiswa = new ThisSiswa ( ); 

	mahasiswa.isiData ("Widya Wardani","13020180022"); 

	System.out.println( "Nama : "+ mahasiswa.nama); 
	System.out.println( "Nim : " + mahasiswa.nim); 
} 
}
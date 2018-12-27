import java.util.Scanner;
class Penjadwalan {
	public static void main(String[] args){
		int[][] data;
		int n, total=0, hasil=9999999;
		int[][] nilai = new int[100][100];
		Scanner inputan = new Scanner(System.in);
		String temp = " ";
		String hasiltext = " ";
		System.out.print("\n\nPROGRAM PENJADWALAN MENGGUNAKAN BRUTEFORCE\n\n");
		System.out.print("Masukkan banyak Pekerja  dan Pekerjaan : ");
		n = inputan.nextInt();
		for(int i=0;i<n; i++){
			for(int j=0;j<n; j++){
				System.out.print("Masukkan Nilai data[W"+(i+1)+"][P"+(j+1)+"]: ");
				nilai[i][j] = inputan.nextInt();
			}
		}
		inputan.close();
		Permutasi p = new Permutasi();
		Penjadwalan jadwal = new Penjadwalan();
		jadwal.tampilTabel(nilai, n);
		data = p.permutasi(n);
		System.out.println();
		for(int i = 0; i < p.faktorial(n); i++){
			total= 0;
			temp=" ";
			for(int j = 0; j < n; j++){
				 temp= temp+"\nP"+(j+1)+" ->  W"+(data[i][j]+1)+ " = "+nilai[data[i][j]][j];
				 System.out.print("\tW"+(data[i][j]+1) + " " );
				 total = total+nilai[data[i][j]][j];
			}
			if(total<hasil){
				hasil = total;
				hasiltext = temp;
			}
			System.out.print(" = "+total);
			System.out.println();
		}
		System.out.println("\nData Terkecil adalah:"+hasiltext+" \n     Total= "+hasil);
	}
	
	public void tampilTabel(int[][] nilai, int n){
		System.out.println("\n\n");
		for(int i=-1;i<n; i++){
				if(i==-1){
					System.out.print("__|");
				}else{
					System.out.print("W"+(i+1)+"");
				}
			for(int j=0;j<n; j++){
				if(i==-1){
					System.out.print("\tP"+(j+1));
				}else{
					System.out.print("\t"+nilai[i][j]);
				}
				//System.out.print("Masukkan Nilai data[W"+(i+1)+"][P"+(j+1)+"]: ");
			
			}
			System.out.println();
		}
	}
}
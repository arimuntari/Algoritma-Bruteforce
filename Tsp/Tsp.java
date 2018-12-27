import java.util.Scanner;
class Tsp {
	public static void main(String[] args){
		char[] abjad = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q'};
		int[][] data;
		int n, total=0, hasil=9999999, ind;
		int[][] nilai = new int[100][100];
		char  mulai, start ;
		Scanner inputan = new Scanner(System.in);
		String temp = " ";
		String hasiltext = " ";
		System.out.print("\n\nPROGRAM TSP MENGGUNAKAN BRUTEFORCE\n\n");
		System.out.print("Masukkan banyak Path : ");
		n = inputan.nextInt();
		for(int i=0;i<n; i++){
			for(int j=0;j<n; j++){
				if(i!=j){		
					System.out.print("Masukkan Nilai data["+abjad[i]+"]["+abjad[j]+"]: ");
					nilai[i][j] = inputan.nextInt();
				}
			}
		}
		Permutasi p = new Permutasi();
		Tsp tsp = new Tsp();
		tsp.tampilTabel(nilai, n);
		
		System.out.print("Tentukan Mulai Path : ");
		mulai= inputan.next().charAt(0);;
		
		inputan.close();
		data = p.permutasi(n);
		System.out.println();
		start = mulai;
		Integer tmp= 0;
		for(int i = 0; i < p.faktorial(n); i++){
			total= 0;
			start = mulai;
			tmp = data[i][0];
			if(start==abjad[data[i][0]]){
				for(int j = 0; j < n; j++){
					if(start != abjad[data[i][j]]){
						total = total + nilai[tmp][data[i][j]];
						start = abjad[data[i][j]];
						System.out.print("\t"+(start) + " "+nilai[tmp][data[i][j]]+ " "+data[i][j] );
						tmp = data[i][j];
					}
				}
				if(total<hasil){
					hasil=total;
				}
				System.out.print("\t"+total);
				System.out.println();
			}
		}
		System.out.println("\nJarak Terpendek adalah:" + hasil);
	}
	
	public void tampilTabel(int[][] nilai, int n){
		char[] abjad = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q'};
		System.out.println("\n\n");
		for(int i=-1;i<n; i++){
				if(i==-1){
					System.out.print("__|");
				}else{
					System.out.print(""+abjad[i]+"");
				}
			for(int j=0;j<n; j++){
				if(i==-1){
					System.out.print("\t"+abjad[j]);
				}else{
					if(i!=j){
						System.out.print("\t"+nilai[i][j]);
					}else{
						System.out.print("\t0");
					}
				}
				//System.out.print("Masukkan Nilai data[W"+(i+1)+"][P"+(j+1)+"]: ");
			
			}
			System.out.println();
		}
	}
}
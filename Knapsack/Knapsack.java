import java.util.Scanner;
class Knapsack{
	public static void main(String[] args){
		 combination com = new combination();
		 Scanner input = new Scanner(System.in);
		 Integer nilai[][];
		 int jml = 0, hargatmp, berattmp, beratmaks , total = 0, tothasil=0, totberat=0, tmp=0;
		  System.out.print("Masukkan Jumlah Barang :");
		  jml = input.nextInt();
		 String[] nama = new String[jml];
		 int[] harga = new int[jml];
		 int[] berat = new int[jml];
		 for(int i=0; i < jml ; i++ ){
			nama[i] = input.nextLine();
			System.out.println("");
			System.out.print("Masukkan Nama Barang  "+(i+1)+ " :" );
			nama[i] = input.nextLine();
			System.out.print("Masukkan Harga Barang "+(i+1)+ " :" );
			harga[i] = input.nextInt();
			System.out.print("Masukkan Berat Barang "+(i+1)+ " :" );
			berat[i] = input.nextInt();
		 }
		 
		    nilai = com.combin(jml);
			System.out.print("\nMasukkan Berat Maksimum :");
			beratmaks = input.nextInt();
		 for(int k=1;k<Math.pow(2, jml);k++){	 
			 hargatmp = 0;
			 berattmp = 0;
			for(int l=0;l<jml;l++){
				if(nilai[k][l] != null){
				 hargatmp += harga[nilai[k][l]];
				 berattmp += berat[nilai[k][l]];
				 System.out.println(""+nama[nilai[k][l]]+"\t");
				}
			}
			if(beratmaks >= berattmp && total<=hargatmp){
				tmp = k;
				tothasil = hargatmp;
				totberat = berattmp;
			
			}
				System.out.println("Harga :"+hargatmp+"\nBerat:"+berattmp+"\n\n");	
		}
		System.out.println("Hasilnya Adalah :" );
		for(int i=0; i< nilai[tmp].length;i++){
			if(nilai[tmp][i] != null){
				System.out.println("\nNama Barang : "+nama[nilai[tmp][i]] );
				System.out.println("Harga       : "+harga[nilai[tmp][i]] );
				System.out.println("berat       : "+berat[nilai[tmp][i]] );
			}
		}
		System.out.println("\nTotal Harga : "+tothasil);
		System.out.println("Total Berat : "+totberat);
	}
}
import java.lang.Math; 
import java.lang.String; 
import java.util.*; 
public class combination {
	
	public Integer[][] combin(int test){
		String arr ="";
		for(int i=0;i<test;i++){
			arr += i;
		}
		Integer jml = test;
		char[] data = arr.toCharArray();
		Integer total = (int)Math.pow(2, jml);
		Integer[][] ret = new Integer[total][jml];
		
			char[] out = new char[100];
		for(int i=0; i<total ; i++ ){
			String asd = Integer.toString(i, 2);
			String as = String.format("%0$" + jml + "s", asd).replace(' ', '0');
		//	System.out.println(as);
			char[] biner = as.toCharArray();
				//System.out.println(as);
				Integer bantu = 0;
			for(int j=0; j < jml; j++ ){
			
				if(biner[jml-1-j]=='1'){ret[i][bantu] = Character.getNumericValue(data[j]); bantu++;}
			}
			
			//String text =	String.valueOf(ret[i]);
			//System.out.println(text);
		}
	//	Arrays.sort(ret);
		return ret;
		
	}
	public void tampil(Integer[][] chars){

		for(int k=0;k<chars.length;k++){
			for(int l=0;l<chars[k].length;l++){
				System.out.print(chars[k][l]+"\t");
			}
			System.out.println("");
		}
	}
}
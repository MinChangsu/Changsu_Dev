package day15;

public class qz2 {

	public static void main(String[] args) {
		int [][] odlist = {
				{1,3,5,7},
				{9,11,13,15},
				{17,19,21,23}
		};
	for(int i=0;i<odlist.length;i++) {
		for(int j=0;j<odlist[i].length;j++) {
			if(odlist[i][j]%3==0)
				System.out.println(odlist[i][j]);
		}
	}
	for(int[] i:odlist) {
		for(int j:i) {
			if(j%3==0)
			System.out.println(j);
		}
	}
	
	
	}

}

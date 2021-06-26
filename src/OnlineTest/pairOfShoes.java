package OnlineTest;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;


public class pairOfShoes {

	static boolean pairOfShes(int[][] shoes) {
		
		List<Integer> left=new ArrayList<Integer>();
		List<Integer> right=new ArrayList<Integer>(); 
		
		
		for(int i=0;i<shoes.length;i++) {
		if(shoes[i][0]==0)
			left.add(shoes[i][1]);
		else
			if(shoes[i][0]==1)
				right.add(shoes[i][1]);

		}
		
		return right.size()==left.size();
	}
	
	
	public static void main(String[] args) {
		
		int[][] shoes= 
			   {{0,20},
				{1,20},
				{1,21},
				{0,21},
				{0,21}
		       };
		System.out.println(shoes[0].length);
		System.out.println("PairOfShoes = "+pairOfShes(shoes));
	}

}

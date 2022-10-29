

@FunctionalInterface
interface Operation {
	boolean test(int a);
}

public class Principale {

	public static void main(String[] args) {
		Operation positif = x -> x>=0;
		Operation negatif = x -> x<0;
		Operation pair = x -> x%2==0;
		
		int[] tab = {1,2,3,4,5,6,7};
		int cp1 = 0, cp2=0;
		for(int a : tab) {
			if(positif.test(a))
				cp1++;
			if(pair.test(a))
				cp2++;
		}
		
		System.out.printf("Le nombre des positifs : %d", cp1);
		System.out.printf("Le nombre des negatifs : %d", tab.length-cp1);
		System.out.printf("Le nombre des pairs : %d", cp2);
		System.out.printf("Le nombre des impairs : %d", tab.length-cp2);
		
	}

}

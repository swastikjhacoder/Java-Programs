package generics;

public class PairUse {

	public static void main(String[] args) {
//		Pair p= new Pair(10,20);
//        System.out.println(p.getFirst()+ " " +p.getSecond());

//        PairString pS= new PairString("aa", "bb");
//        PairDouble pS= new PairDouble(3.1, 7.2);
		
		Pair<String> PS= new Pair<String>("aa","bb");
		System.out.println(PS.getFirst()+" "+PS.getSecond());
		
		Pair<Integer> PI= new Pair<Integer>(2,5);
		System.out.println(PI.getFirst()+" "+PI.getSecond());
		
		Pair<Double> PD= new Pair<Double>(1.5,2.7);
		System.out.println(PD.getFirst()+" "+PD.getSecond());
		
		Pair<Character> PC= new Pair<Character>('a','b');
		System.out.println(PC.getFirst()+" "+PC.getSecond());
	}

}

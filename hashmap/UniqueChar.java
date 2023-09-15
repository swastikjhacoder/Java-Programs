package hashmap;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
public class UniqueChar {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static String takeInput() throws IOException {
        String str = br.readLine(); 
        return str;
    }
    
    public static String uniqueChar(String str){
    	HashMap<Character,Boolean> h=new HashMap<>();
        String s="";
        for(int i=0;i<str.length();i++){
            if(h.containsKey(str.charAt(i)))
                continue;
            s=s+str.charAt(i);
            h.put(str.charAt(i),true);
        }
        return s;
    }

	public static void main(String[] args) throws IOException {
		String str = takeInput();
        System.out.print(uniqueChar(str));
	}

}

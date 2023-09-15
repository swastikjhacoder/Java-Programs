package operator;
import java.util.Scanner;
public class CheckSequence {

	public static void main(String[] args) {
//		Scanner s=new Scanner(System.in);
//		int n=s.nextInt();
//		int arr[]=new int[100];
//		for(int i=0;i<n;i++) {
//			arr[i]=s.nextInt();
//		}
//		
//		boolean isDec=false,isInc=false;
//		int decCount=0,incCount=0;
//		
//		int preDig=arr[0];
//		int curDig=arr[1];
//		
//		if(preDig<curDig) {
//			isInc=true;
//			isDec=false;
//			incCount=incCount+1;
//		}else if(preDig>curDig) {
//			isInc=false;
//			isDec=true;
//			decCount=decCount+1;
//		}else {
//			isInc=false;
//			isDec=false;
//			decCount=incCount=0;
//		}
//		
//		for(int i=2;i<=n-1;i++) {
//			preDig=curDig;
//			curDig=arr[i];
//			if(isInc=true) {
//				if(incCount>=1) {
//					if(preDig<curDig) {
//						incCount=incCount+1;
//					}else if(preDig>curDig) {
//						decCount=decCount+1;
//					}else {
//						decCount=incCount=0;
//					}
//				}
//			}else {
//				if(decCount>=1) {
//					if(preDig>curDig) {
//						decCount=decCount+1;
//					}else if(preDig<curDig) {
//						incCount=incCount+1;
//					}else {
//						decCount=incCount=0;
//					}
//				}
//			}
//			if(incCount>=1 || decCount>=1) {
//				System.out.println("true");
//				return;
//			}else {
//				System.out.println("false");
//				return;
//			}
//		}
		
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int prev=s.nextInt();
        boolean isDec=true;
        int i=2;
    while(i<=n){
         int curr=s.nextInt();
        if(curr==prev){
          System.out.println("false");
            return;
        }
        if(curr < prev){
            if(isDec==false){
               System.out.println("false");
                return;
            }
        }
        else{
            if(isDec==true){
                isDec=false;
            }
        }
        prev=curr;
        i++;
    }
    System.out.println("true");
	}
}

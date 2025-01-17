import java.util.Scanner;
class algorithm{
    public static void main(String[] args) {
        int evenNumbers=0;
        int oddNumbers=0;
        int allnumbers=0;
        int newOdds,newEvens,newAll;
        Scanner userID=new Scanner(System.in);
        System.out.println("Enter ID: ");
        String ID=userID.nextLine();
        
        char charArrayID[]=ID.toCharArray();
        int intArrayID[]=new int[charArrayID.length];

        for(int i=0;i<charArrayID.length;){
            intArrayID[i]=Character.getNumericValue(charArrayID[i]);
            i=i+1;
        }
        for(int j=(intArrayID.length-1);j>=0;j--){
            allnumbers=allnumbers+intArrayID[j];
            if(j%2==1){
                oddNumbers=oddNumbers+intArrayID[j];
            }
            if(j%2==0){
                evenNumbers=evenNumbers+intArrayID[j];
            }    
        }
//        System.out.print("your ID: ");
//        for(int n=0;n>=intArrayID.length;n++){
//            System.out.print(intArrayID[n]);
//        }
//        System.out.println();

        System.out.println("Odd Number Sum="+oddNumbers);
        System.out.println("Even Number Sum="+evenNumbers);
        System.out.println("All Number Sum="+allnumbers);
        newOdds=oddNumbers+1;
        newEvens=evenNumbers+1;
        newAll=allnumbers+1;

        if(newOdds>6){
            int division=newOdds/6;
            newOdds=newOdds-6*division;
            System.out.println("dude was bigger than 6, is now"+newOdds);
        }
    }
} 

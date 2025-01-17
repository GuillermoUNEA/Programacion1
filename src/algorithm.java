import java.util.Scanner;
class algorithm{
    public static void main(String[] args) {
        int evenNumbers=0;
        int oddNumbers=0;
        int allNumbers=0;
        int newOdds,newEvens,newAll;
        Scanner userID=new Scanner(System.in);
        System.out.println("Enter ID: ");
        String ID=userID.nextLine();
        userID.close();
        
        char charArrayID[]=ID.toCharArray();
        int intArrayID[]=new int[charArrayID.length];

        for(int i=0;i<charArrayID.length;){
            intArrayID[i]=Character.getNumericValue(charArrayID[i]);
            i=i+1;
        }
        for(int j=(intArrayID.length-1);j>=0;j--){
            allNumbers=allNumbers+intArrayID[j];
            if(j%2==1){
                oddNumbers=oddNumbers+intArrayID[j];
            }
            if(j%2==0){
                evenNumbers=evenNumbers+intArrayID[j];
            }    
        }

        System.out.println("Even Number Sum="+evenNumbers);
        System.out.println("Odd Number Sum="+oddNumbers);
        System.out.println("All Number Sum="+allNumbers);
        newOdds=oddNumbers+1;
        newEvens=evenNumbers+1;
        newAll=allNumbers+1;
        
        System.out.println("Results:");
        int questionOne=theGenerator(newEvens);
        int questionTwo=theGenerator(newOdds);
        int questionThree=theGenerator(newAll);

        while(questionTwo==questionOne || questionTwo==questionThree || questionThree==questionOne){
            if(questionTwo==questionOne && questionTwo==6){
                questionTwo=1;
            }
            if (questionTwo==questionOne){
                questionTwo++;
            }
            if(questionTwo==questionThree && questionTwo==6){
                questionTwo=1;
            }
            if (questionTwo==questionThree) {
                questionTwo++;
            }
            if(questionThree==questionOne && questionThree==6){
                questionThree=1;
            }
            if (questionThree==questionOne){
                questionThree++;
            }
        } 

        System.out.println("Question One:"+questionOne);
        System.out.println("Question Two:"+questionTwo);
        System.out.println("Question Three:"+questionThree);
    }

        
        static int theGenerator(int theNumber) {
            if(theNumber/6==0){
                return 6;}
            if(theNumber>6){
                int division=theNumber/6;
                theNumber=theNumber-6*division;
                //System.out.println("dude was bigger than 6, is now "+theNumber);
            }
            return theNumber;
        }
} 

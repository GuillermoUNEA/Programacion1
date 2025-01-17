class algorithm{
    public static void main(String[] args) {
        int evenNumbers=0;
        int oddNumbers=0;
        int allnumbers=0;
        //Scanner userID=new Scanner(System.in);
        //String ID=userID.nextLine();
        String ID="1234";
        char charArrayID[]=ID.toCharArray();
        int intArrayID[]=new int[charArrayID.length];

        for(int i=0;i<charArrayID.length;){
            intArrayID[i]=Character.getNumericValue(charArrayID[i]);
            i=i+1;
        }
        for(int j=(intArrayID.length-1);j>=0;j--){
            allnumbers=allnumbers+intArrayID[j];
            System.out.println(j%2);
            // System.out.println(allnumbers);

        }

    }
} 

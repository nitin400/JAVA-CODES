public class mymethodsDemo {
    // concat method
    public static String myConcat(String str1, String str2) {

        return str1 + str2;
    }

    // length method
    public static int mylength(String str) {
        int count = 0;
        for (int x : str.toCharArray()) {
            count++;
        }
        return count;
    }

    // charAt(int index)

    public static char myCharAt(String str, int index) {
        char ch[] = str.toCharArray();

        return ch[index];
    }

    // compareTo

    public static int CompareTo(String str1, String str2) {

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        for (int i = 0; i < ch1.length && i < ch2.length; i++) {

            if (ch1[i] != ch2[i]) {
                return ch1[i] - ch2[i];
            }

        }
        if (ch1.length != ch2.length) {
            return ch1.length - ch2.length;
        }
        return 0;
    }
    // compareToIgnoreCase()

    public static int CompareToIgnoreCase(String str1, String str2) {

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        for (int i = 0; i < ch1.length && i < ch2.length; i++) {

            if (ch1[i] + 32 == ch2[i] || ch1[i] - 32 == ch2[i] || ch1[i] == ch2[i]) {
                continue;
            } else {
                return ch1[i] - ch2[i];
            }

            

        }
        if (ch1.length != ch2.length) {
            return ch1.length - ch2.length;
        }
        return 0;
    }

    //equals method

    public static boolean Equals(String str1,String str2){
        int flag=0;
        char arr1[]=str1.toCharArray();
        char arr2[]=str2.toCharArray();

        for(int i=0;i<arr1.length&&i<arr2.length;i++){
            if(arr1[i]!=arr2[i]){
                flag=1;
            }
        }
        if(flag==0){
            return true;
        }
        else{
        return false;
        }
    }
        

        //equalsIgnoreCase() method 

        public static boolean MyEqualIgnoreCase(String str1, String str2) {

            char[] ch1 = str1.toCharArray();
            char[] ch2 = str2.toCharArray();
    
            for (int i = 0; i < ch1.length && i < ch2.length; i++) {
    
                if (ch1[i] + 32 == ch2[i] || ch1[i] - 32 == ch2[i] || ch1[i] == ch2[i]) {
                    continue;
                } else {
                    return false;
                }
    
                
    
            }
            if (ch1.length != ch2.length) {
                return false;
            }
            return true;
        }


    //startsWith method in java...

    public static boolean StartsWith(String original,String str,int n){

        char arr1[]=str.toCharArray();
        char arr2[]=original.toCharArray();
        

        while(n!=arr1.length){
            
            if(arr1[n]==arr2[n]){
                ++n;
                continue;
            }else{
                return false;
            }
        }
        return true;

      
    }

    //only for one parameter..

    public static boolean StartsWith(String original,String str){

        char arr1[]=str.toCharArray();
        char arr2[]=original.toCharArray();
        int n=0;

        while(n!=arr1.length){
            
            if(arr1[n]==arr2[n]){
                ++n;
                continue;
            }else{
                return false;
            }
        }
        return true;

      
    }

    //endsWith method..

    public static boolean EndsWith(String original,String str){

        char arr1[]=str.toCharArray();
        char arr2[]=original.toCharArray();
        int i=0;
        int n=original.length()-str.length();
        while(n!=arr1.length&& n<arr2.length ){
            
            if(arr1[i]==arr2[n]){
                ++n;
                continue;
            }else{
                return false;
            }
        }
        return true;

      
    }

    //10. IndexIf() method

    public static int IndexOf(String str,char ch,int index){

        char arr[]=str.toCharArray();
        
        for(int i=index;i<arr.length;i++){
            if(arr[i]==ch){
                return i;
                
            }

        }
        return -1;


    }

    //11.LastIndexOf() method implementation.

    public static int LastIndexOf(String str,char ch,int index){

        char arr[]=str.toCharArray();
        
        for(int i=arr.length-1;i>=index;i--){
            if(arr[i]==ch){
                return i;
                
            }

        }
        return -1;


    }

    //12. replace() method in string implementation.

    public static String Replace(String str,char old,char neww){

        char arr[]=str.toCharArray();

        for(int i=0;i<arr.length;i++){

            if(arr[i]==old){
                
                arr[i]=neww;
                continue;

            }
        }
        String str2=arr.toString();
        System.out.println(str2);

        return str2;



    }

    //13. substring() method in string

    public static String Substring(String str,int index){
        char arr[]=str.toCharArray();
        String str1="";
        for(int i=index;i<arr.length;i++){
            str1+=arr[i];
        }
        return str1;
    }

    //14.SubString() method with starting and ending index..

    public static String Substring(String str,int index,int end){
        char arr[]=str.toCharArray();
        String str1="";
        for(int i=index;i<end;i++){
            str1+=arr[i];
        }
        return str1;
    }

    //15. toLowerCase() method in String..

    public static String ToLowerCase(String str){
        char arr[]=str.toCharArray();
        String str1="";
        for(int i=0;i<arr.length;i++){
            arr[i]=(char)(arr[i]+32);
            str1+=arr[i];
        }
        return str1;
    }

    //16. toUpperCase() method implementation..

    public static String ToUpperCase(String str){
        char arr[]=str.toCharArray();
        String str1="";
        for(int i=0;i<arr.length;i++){
            arr[i]=(char)(arr[i]-32);
            str1+=arr[i];
        }
        return str1;
    }

    //17. trim method in string implementation..

    // public static String Trim(String str){
        

        
        
    // }

    //18.split method() implementation..

    public static void main(String[] args) {
        String str1 = " nitin";
        String str2 = new String("nitin");
        
        String str3 = str1.concat(str2);
        System.out.println(str3);

        System.out.println(mylength(str2));

        System.out.println(myCharAt(str1, 1));

        System.out.println(CompareTo(str1, str2));

        System.out.println(CompareToIgnoreCase(str1, str2));

        System.out.println(Equals(str1, str2));

        System.out.println(MyEqualIgnoreCase(str1, str2));
        System.out.println(StartsWith(str1, "i", 1));

        System.out.println(EndsWith(str1, "n"));

        System.out.println(IndexOf(str1, 'i', 0));

        System.out.println(LastIndexOf(str1, 'i', 0));
        
        System.out.println(Replace(str1, 'i', 'a'));

        System.out.println(Substring(str1, 3));

        System.out.println(ToLowerCase(str1));
        
        System.out.println(ToUpperCase(str1));

        



    }
}
public class myCompareFunction{


    public static int myCompare(String str1,String str2){

        char arr1[]=str1.toCharArray();
        char arr2[]=str2.toCharArray();

        for(int i=0;i<arr1.length&&i<arr2.length;i++){

            if(arr1[i]!=arr2[i]){
                return arr1[i]-arr2[i];
            }


        }

        if(arr1.length!=arr2.length){
            return arr1.length-arr2.length;
        }
        return 0;
    }

    public static void main(String[] args){

        String str1="nitin";
        String str2="nitin";
        System.out.println(myCompare(str1,str2));
    }
}
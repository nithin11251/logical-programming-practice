// Searching Elements In Array by LinearSearch
// To search unsorted Array elements Use LinearSearch
package arrays;
public class SearchElement {
    public static int linearSearch(int a[],int target){
        for(int i=0;i<=a.length-1;i++){
            if(a[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int a[]={20,30,40,30};
        int target=40;
        int index=linearSearch(a,target);
        if(index == -1){
            System.out.println("Element not found");

        }
        else{
            System.out.println("Element found at Index : "+ index);
        }
    }
}

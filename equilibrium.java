public class equilibrium {
    public int equil(int arr[]){
        int left=0;
        int right=0;
        for(int i=0;i<arr.length;i++){
            right+=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            right-=arr[i];
            if(left==right){
                return i;
            }
            left+=arr[i];
        }
        return -1;
    }    
public static void main(String[] args) {
    equilibrium obj=new equilibrium();
    int arr1[]={1,2,3,4,5,4,3,2,1};
    int arr2[]={1,2,3,4,5,6};
    System.out.println(obj.equil(arr1));
    System.out.println(obj.equil(arr2));
}}
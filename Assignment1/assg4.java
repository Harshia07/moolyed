public class assg4 {
    public static void main(String[] args) {
        int[] arr={2,3,4,2,3,7};
        int s= arr.length;
        System.out.println("Before:");
        for(int a=0;a<s;a++)
        {
            System.out.println(arr[a]);
        }
        int[] new_arr= new int[s];
        int count;
        for(int i=0;i<s;i++)
        {
            count=0;
            for(int j=i+1;j<s;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                    break;
                }
            }
            if(count==0)
            {
                new_arr[i]=arr[i];
            }
        }
        System.out.println("After:");
        for(int a=0;a<s;a++)
        {
            System.out.println(new_arr[a]);
        }

    }
}

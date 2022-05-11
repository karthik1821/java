class Solution {
    //// from leettcode Q no 4
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double r;
        int l1=0,l2=0,l3=0,i=0,j=0;double sum=0;
        l1=nums1.length;
        l2=nums2.length;
        l3=l1+l2;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] nums=new int[l3];
        for(i=0;i<l3;i++)
        {
            if(i<l1)
                nums[i]=nums1[i];
            else
                nums[i]=nums2[i-l1];
        }
        Arrays.sort(nums);
        if(l3%2==0)    
        {
            int m1,m2;
            double d=Math.round(l3/2);
            int a=(int)d;
            m1=a-1;
            m2=m1+1;
            sum=(double)(nums[m1]+nums[m2])/2;
            return sum;
        }
        else
        {
             double d=Math.round(l3/2);
            int n=(int)d;
            sum=(double)nums[n];
            return sum;
        }
    

        
    }
}

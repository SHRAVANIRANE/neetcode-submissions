class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int l=0 , r=people.length-1 , count=0;
        while(l<=r){
            int sum=people[l]+people[r];
            if(sum<=limit){
                l++;
            }
            r--;
            count++;
        }
        return count;
    }
}
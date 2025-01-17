class Solution {
public:
    bool doesValidArrayExist(vector<int>& dr) {
       int n= dr.size();
       int ans=0;
       for(int i=0; i<n; i++){
        ans^=dr[i];
       }
       return ans==0;
    }
};
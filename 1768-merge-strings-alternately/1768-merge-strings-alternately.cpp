class Solution {
public:
    string mergeAlternately(string word1, string word2) {
        string ans="";
        int len1 = word1.size();
        int len2 = word2.size();
        int smlen = min(len1,len2);
        string remstr = len1>len2?word1:word2;
        int remlen = remstr.size(); 
        for(int i=0;i<smlen;i++){
            ans.push_back(word1[i]);
            ans.push_back(word2[i]);
        }
        for(int i=smlen;i<remlen;i++){
            ans.push_back(remstr[i]);
        }
        return ans;
    }
};
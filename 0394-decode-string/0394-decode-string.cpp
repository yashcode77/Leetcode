class Solution {
public:
    string decodeString(string s) {
        stack<char> stack;
        string ans = "";
        for(int i=0; i<s.size(); i++){
            if(s[i]!=']') stack.push(s[i]);
            else{
                string temp = "";
                while(stack.top()!='['){
                    temp = stack.top() + temp;
                    stack.pop();
                }
                stack.pop();
                
                string k = "";
                while(!stack.empty() && isdigit(stack.top())){
                    k = stack.top() + k;
                    stack.pop();
                }
                string str = "";
                for(int i=0; i<stoi(k); i++){
                    str = temp + str;
                }
                for(auto ch : str){
                    stack.push(ch);
                }
            }
        }
        while(!stack.empty()){
            ans = stack.top() + ans;
            stack.pop();
        }
        return ans;
    }
};
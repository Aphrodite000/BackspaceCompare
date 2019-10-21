import java.util.Stack;

public class Solution {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> stack1=new Stack<>();
        Stack<Character> stack2=new Stack<>();
        for(int i=0;i<=S.length()-1;i++){
            if(S.charAt(i)!='#'){
                stack1.push(S.charAt(i));
            }else if(!stack1.empty()){
                stack1.pop();
            }
        }
        for(int i=0;i<=T.length()-1;i++){
            if(T.charAt(i)!='#'){
                stack2.push(T.charAt(i));
            }else if(!stack2.empty()){
                stack2.pop();
            }
        }
        return stack1.equals(stack2);
    }
}

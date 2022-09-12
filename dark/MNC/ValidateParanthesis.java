package dark.MNC;

import java.util.Stack;

public class ValidateParanthesis {
    public static void main(String[] args) {
        System.out.println(isValid("(]"));
    }
    public static boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char current=s.charAt(i);
                if(current=='('||current=='['||current=='{'){
                    st.push(current);
                }
                else if(st.isEmpty()){
                    return false;
                }
                else if(st.peek()=='('&&current==')'){
                    st.pop();
                }
                else if(st.peek()=='['&&current==']'){
                    st.pop();
                }
                else if(st.peek()=='{'&&current=='}'){
                    st.pop();
                }else{
                    return false;
                }
        }
        return st.isEmpty();
    }
}

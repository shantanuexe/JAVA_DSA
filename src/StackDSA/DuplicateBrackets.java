package StackDSA;

import java.util.Scanner;
import java.util.Stack;

public class DuplicateBrackets {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        String str = sc1.nextLine();
        boolean ans = checkexp(str);
        System.out.println(ans);
        //String input = "(a+b)+(c+d)";
    }

    public static boolean checkexp(String exp) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            if( exp.charAt(i)==')'){
                if(st.peek()=='('){
                    return true;
                }
                else {
                    while (st.peek() != '(') {
                        st.pop();
                    }
                    st.pop();
                }
            }
            else{
                st.push(exp.charAt(i));
            }



        }
        return false;
    }
}
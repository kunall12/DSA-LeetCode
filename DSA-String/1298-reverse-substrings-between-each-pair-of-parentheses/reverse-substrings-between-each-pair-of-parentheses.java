class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stack=new Stack<>();
        StringBuilder result= new StringBuilder();
        for(char ch: s.toCharArray()){
            if(ch=='(' || ch!=')'){
                stack.push(ch);
            }
            else{//closing brackets
                ArrayList<Character> list=new ArrayList<>();
                while(!stack.isEmpty() && stack.peek()!='('){
                    list.add(stack.pop());
                }
                stack.pop();
                for(char c:list){
                    stack.push(c);
                }
            }
            
        }
        while(!stack.isEmpty()){
            result.insert(0,stack.pop());
        }
        return result.toString();
    }
}
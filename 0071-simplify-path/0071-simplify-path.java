class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack= new Stack<>();
        String res ="";
        String[] arr= path.split("/");
        for(String s : arr){
            if(s.equals("")||s.equals(".")) {
                continue;
            }
            else if(s.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else{
                stack.push(s);
            }
        }
        for(String m : stack){
            res+="/"+m;

        }
        if(res.equals("")) {
            return "/";
        }
        return res;
        
    }
}
class Solution {
    public String simplifyPath(String path) {
        String[] s = path.split("/");
        List<String> ans=new ArrayList<>();
        // for(String p:s){
        //     System.out.println(p);
        // }
        for (int i = 0; i<s.length; i++) {
            String inner = s[i];
            switch (inner) {
                case "..":
                    if (ans.isEmpty())
                        inner = "";
                    else {
                        ans.remove(ans.size()-1);
                        inner = "";
                    }
                    break;
                case ".":inner="";
                            break;
                case " ":
                        break;

            }
            if (inner == "")
                continue;
            else {
                ans.add(inner);
            }

        }
        if(ans.isEmpty())
            return "/";
       StringBuilder sb=new StringBuilder();
       for(int i=0;i<ans.size();i++){
            sb.append("/");
            sb.append(ans.get(i));
       }
        return sb.toString();
    }
}

//         //List<String> res=new ArrayList<>();
//         StringBuilder res=new StringBuilder();
//         Stack<String> stack=new Stack<>();
//         String[] paths=path.split("/");

//         //check for all elemnts in paths
//         for(String s:paths){
//             switch(s){
//                 case "" :
//                 case "." :
//                     break;
//                 case ".." :
//                  if(stack.size()>0)
//                     stack.pop();
//                     break;
//                 default:
//                     stack.push(s);
//                     break;
//             }

//         }
//         if(stack.isEmpty())
//             return "/";

//          while(!stack.isEmpty()){
//             res.insert(0,stack.pop());
//             res.insert(0,"/");
//          }

//         return res.toString();

//     }
// }
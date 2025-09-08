public class longestWord {
    class Node{
        Node children[]=new Node[26];
        boolean eow=false;

        Node(){
            for(int i=0;i<26;i++){
                children[i]=null;
            }
        }
    }

    public Node root=new Node();
    public void insert(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }
            curr=curr.children[idx];
        }
        curr.eow=true;
    }

    public String ans="";
    public void helper(Node root,StringBuilder temp){
        if(root==null){
            return;
        }
        for(int i=0;i<26;i++){
            if(root.children[i]!=null && root.children[i].eow==true){
                char ch=(char)(i+'a');
                temp.append(ch);
                if(temp.length() > ans.length()){
                    ans=temp.toString();
                }
                helper(root.children[i],temp);
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }
    public String longestWord(String[] words) {
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        helper(root,new StringBuilder(""));
        return ans;
    }
}

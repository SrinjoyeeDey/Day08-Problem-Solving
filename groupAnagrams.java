import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class groupAnagrams {
    class Node{
        List<String> data;
        Node[] children;
        boolean eow;

        Node(){
            data=new ArrayList<>();
            children=new Node[26];
            eow=false;
        }
    }
    private Node root;
    private List<List<String>> ans;

    public List<List<String>> groupAnagrams(String[] strs) {
        ans=new ArrayList<>();
        root=new Node();

        for(String word:strs){
            insert(word);
        }
        dfs(root);
        return ans;
    }

    public void insert(String s){
        Node temp=root;
        char[] word=s.toCharArray();
        Arrays.sort(word);

        for(char c:word){
            int idx=c-'a';
            if(temp.children[idx]==null){
                temp.children[idx]=new Node();
            }
            temp=temp.children[idx];
        }
        temp.eow=true;
        temp.data.add(s);
    }

    public void dfs(Node node){
        if(node==null){
            return;
        }
        if(node.eow){
            ans.add(new ArrayList<>(node.data));
        }

        for(int i=0;i<26;i++){
            if(node.children[i]!=null){
                dfs(node.children[i]);
            }
        }
    }
}

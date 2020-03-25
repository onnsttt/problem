import javafx.concurrent.Worker;

/*
 * @lc app=leetcode.cn id=208 lang=java
 *
 * [208] 实现 Trie (前缀树)
 */

// @lc code=start

class Trie {

    /** Initialize your data structure here. */
    
    private Node node;


    public Trie() {
        node = new Node();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        Node tmpNode = node;
        for(int i = 0;i<word.length();i++){
            char str = word.charAt(i);
            if(tmpNode.node[str-'a']==null||tmpNode.node[str-'a'].val!=str){
                tmpNode.node[str-'a'] = new Node();
                tmpNode.node[str-'a'].val = str;
                tmpNode = tmpNode.node[str-'a'];
            }else {
                tmpNode = tmpNode.node[str-'a'];
            }
        }
        tmpNode.node[26] = new Node();
        tmpNode.node[26].val = '1';
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Node tmpNode = node;
        for(int i = 0;i < word.length(); i++){
            char str = word.charAt(i);
            if(tmpNode.node!=null&&tmpNode.node[str-'a']!=null&&tmpNode.node[str-'a'].val==str){
                    tmpNode = tmpNode.node[str-'a'];
            }else {
                return false;
            }
        }
        if(tmpNode.node[26]!=null&&tmpNode.node[26].val=='1'){
            return true;
        }
        for(int i = 0;i<26;i++){
            if(tmpNode.node[i]!=null&&tmpNode.node[i].val!=' '){
                return false;
            }
        }
        return true;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Node tmpNode[] = node.node;
        for(int i = 0;i < prefix.length();i++){
            char str = prefix.charAt(i);
            if(tmpNode==null||tmpNode[str-'a']==null||tmpNode[str-'a'].val!=str){
                return false;
            }else {
                tmpNode = tmpNode[str-'a'].node;
            }
        }
        return true;
    }
    
    class Node{
        char val;
        Node node[];
        public Node(){
            val=' ';
            this.node = new Node[27];
        }
    }

}




/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
// @lc code=end


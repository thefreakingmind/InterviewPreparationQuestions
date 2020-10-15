package Tries;

import java.lang.reflect.Array;
import java.util.*;

public class TriesImplementation {

    ArrayDeque<String> arrayDeque = new ArrayDeque<>();
    private ArrayDeque<String> aq = new ArrayDeque<>();
    private static int Alphabets = 26;

    private class Node {
        private char data;
        private Map<Character, Node> children = new HashMap<>();
        private boolean isEndoftheWord;

        public Node(char data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "Data" + data;
        }

        public boolean hasChild(char character){
            return children.containsKey(character);
        }

        public void addChild(char ch){
            children.put(ch, new Node(ch));

        }

        public Node getChild(char ch){
            return children.get(ch);
        }
    }

    private boolean containsWord(String word){
        Node current = root;
        for(Character ch: word.toCharArray()){
            if(!current.hasChild(ch)){
                return false;
            }
            current = current.getChild(ch);
        }
        return current.isEndoftheWord;
    }



    private Node root = new Node(' ');


    public void insert(String word) {
        Node current = root;
        for(Character character: word.toCharArray()){
            if(current.hasChild(character)){
                current.addChild(character);

            }
            current = current.getChild(character);
        }
        current.isEndoftheWord = true;


    }


    public static void main(String[] args) {
        TriesImplementation trie = new TriesImplementation();
        trie.insert("cat");
        trie.insert("can");
        trie.insert("canada");
        System.out.println("Done");
    }
}

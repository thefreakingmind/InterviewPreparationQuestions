package Tries;

import java.util.HashMap;
import java.util.Map;

public class TriesImplementation {

    private static int Alphabets = 26;

    private class Node {
        private char data;
        Map<Character, Node> childer = new HashMap<>();
        private boolean isEndoftheWord;

        public Node(char data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "Data" + data;
        }

        public boolean hasChild(char character){
            return childer.containsKey(character);
        }

        public void addChild(char ch){
            childer.put(ch, new Node(ch));

        }

        public Node getChild(char ch){
            return childer.get(ch);
        }
    }

    private boolean containsWord(String word){
        for(Character ch: word.toCharArray()){


        }
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
        System.out.println("Done");
    }
}

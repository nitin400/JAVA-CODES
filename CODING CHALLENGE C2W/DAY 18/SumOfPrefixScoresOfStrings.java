class TrieNode {
    TrieNode[] children;
    int count;

    TrieNode() {
        children = new TrieNode[26];
        count = 0;
    }
}

class Solution {
    public int[] sumPrefixScores(String[] words) {
        int n = words.length;
        int[] answer = new int[n];
        TrieNode root = new TrieNode();

        for (String word : words) {
            TrieNode node = root;
            for (char c : word.toCharArray()) {
                if (node.children[c - 'a'] == null) {
                    node.children[c - 'a'] = new TrieNode();
                }
                node = node.children[c - 'a'];
                node.count++;
            }
        }

        for (int i = 0; i < n; i++) {
            TrieNode node = root;
            for (char c : words[i].toCharArray()) {
                node = node.children[c - 'a'];
                answer[i] += node.count;
            }
        }

        return answer;
    }
}
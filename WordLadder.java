class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet<>(wordList);
        if (!wordSet.contains(endWord)) return 0;

        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        int level = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String currentWord = queue.poll();
                for (int j = 0; j < currentWord.length(); j++) {
                    char[] wordChars = currentWord.toCharArray();
                    for (char c = 'a'; c <= 'z'; c++) {
                        wordChars[j] = c;
                        String nextWord = new String(wordChars);
                        if (wordSet.contains(nextWord)) {
                            if (nextWord.equals(endWord)) {
                                return level + 1;
                            }
                            queue.offer(nextWord);
                            wordSet.remove(nextWord); 
                        }
                    }
                }
            }
            level++;
        }

        return 0;
        
    }
}

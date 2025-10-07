/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> bottomView(Node root) {
        // Code here
        ArrayList<Integer> ans = new ArrayList<>();
        TreeMap<Integer, int[]> map = new TreeMap<>();
        dfs(root, map, 0, 0);
        for(int key : map.keySet()){
            ans.add(map.get(key)[0]);
        }
        return ans;
    }
    private void dfs(Node root, TreeMap<Integer, int[]> map, int hd, int depth){
        if(root == null) return;
        if(!map.containsKey(hd) || depth>=map.get(hd)[1]){
            map.put(hd, new int[]{root.data, depth});
        }
        dfs(root.left, map, hd-1, depth+1);
        dfs(root.right, map, hd+1, depth+1);
    }
}

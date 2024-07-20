class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for (int a : asteroids) {
            boolean destroyed = false;
            while (!st.isEmpty() && a < 0 && st.peek() > 0) {
                int diff = a + st.peek();
                if (diff < 0) {
                    st.pop();
                } else if (diff > 0) {
                    destroyed = true;
                    break;
                } else {
                    st.pop();
                    destroyed = true;
                    break;
                }
            }
            if (!destroyed) {
                st.push(a);
            }
        }
        int[] ans = new int[st.size()];
        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }
        return ans;
    }
}
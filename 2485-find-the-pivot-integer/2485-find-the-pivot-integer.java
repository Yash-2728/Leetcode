class Solution {
    public int pivotInteger(int n) {
        final int k = (n * n + n) / 2;
    final int x = (int) Math.sqrt(k);
    return x * x == k ? x : -1;
    }
}
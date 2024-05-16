class Solution {
    public String largestNumber(int[] nums) {
        String[] numStrs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numStrs[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(numStrs, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2) {
                String concat1 = s1 + s2;
                String concat2 = s2 + s1;

                return concat2.compareTo(concat1);
            }
        });

        if (numStrs[0].equals("0"))
            return "0";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            sb.append(numStrs[i]);
        }

        return sb.toString();
    }
}
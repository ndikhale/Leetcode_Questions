class Solution {
    public static String longestCommonPrefix(String[] strs) {

        String subStringArray = "";
        boolean flag = true;

        for(int i = 0; i < 1; i++) {
            for(int j = 0; j < strs[i].length(); j++) {
                if(flag) {
                    subStringArray += strs[i].charAt(j);
                }

                for(int k = i + 1; k < strs.length; k++) {
                    if(strs[k].startsWith(subStringArray)) {
                        flag = true;
                    } else {
                        flag = false;
                        subStringArray = subStringArray.substring(0, subStringArray.length() - 1);
                    }
                }
            }
        }

        return subStringArray.length() == 0? "" : strs[0].startsWith(subStringArray) ? subStringArray : "";

    }

    public static void main(String[] args) {
        String[] str = new String[]{"flower", "flow", "flight"};
        String result = Solution.longestCommonPrefix(str);
        System.out.println(result);
    }
}
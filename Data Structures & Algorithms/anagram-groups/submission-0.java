class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashSet<Integer> visited = new HashSet<>();
        for (int i = 0; i < strs.length; i++) {
            if (visited.contains(i)) {
                continue;
            }
            List<String> comp = new ArrayList<>();
            String stemp = strs[i];
            char[] a1 = strs[i].toCharArray();
            Arrays.sort(a1);
            comp.add(stemp);
            visited.add(i);

            for (int j = i + 1; j < strs.length; j++) {
                if (!visited.contains(j)) {
                    String stemp2 = strs[j];
                    char[] a2 = strs[j].toCharArray();
                    Arrays.sort(a2);
                    if (Arrays.equals(a1, a2)) {
                        comp.add(stemp2);

                        visited.add(j);
                    }
                }
            }
            result.add(comp);
        }
        return result;
    }
}

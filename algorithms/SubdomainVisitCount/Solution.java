class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> visitedMap = new HashMap<String, Integer>();
        List<String> res = new ArrayList<String>();
        
        for (String cpdomain : cpdomains) {
            int baseCount = Integer.parseInt(cpdomain.split(" ")[0]);
            String domain = cpdomain.split(" ")[1];
            // . is a special character
            String[] domainSplits = domain.split("[.]");
            
            int start = domainSplits.length - 1;
            while (start >= 0) {
                String subDomain = String.join(".", Arrays.copyOfRange(domainSplits, start, domainSplits.length));
                if (visitedMap.get(subDomain) == null) {
                    visitedMap.put(subDomain, baseCount);
                } else {
                    visitedMap.put(subDomain, baseCount + visitedMap.get(subDomain));
                }
                start--;
            }
        }
        for (String key : visitedMap.keySet()) {
            res.add(visitedMap.get(key) + " " + key);
        }
        return res;
    }
}
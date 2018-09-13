public class CompareTheTriplets {
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        
        int aliceScore = 0;
        int bobScore = 0;
        
        for (int i = 0; i < a.size(); i++) {
            if ( a.get(i) < b.get(i) ) {
                bobScore = bobScore + 1;
            } else if ( a.get(i) > b.get(i)) {
                aliceScore = aliceScore + 1;
            }
             
        }

        List<Integer> list = new ArrayList();
        list.add(aliceScore);
        list.add(bobScore);
        return list;
    }
}
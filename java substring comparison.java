

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        smallest=s.substring(0,k);
        largest=s.substring(0,k);
        for(int i=0;i<=s.length()-k;i++){
            String str=s.substring(i,k+i);
            if(smallest.compareTo(str)>0){
                smallest=str;
            }
            if(largest.compareTo(str)<0) {
                largest=str;
            }
        }
        return smallest + "\n" + largest;
    }


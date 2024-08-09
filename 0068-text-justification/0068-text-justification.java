class Solution {
    static int MAX_WIDTH;

    public static String findLine(int i, int j, String[] words, int eachWordSpace, int extraSpace){
        StringBuilder s = new StringBuilder();
        for(int k=i; k<j; k++){
            s.append(words[k]);

            if(k==j-1){
                continue;
            }

            for(int space=0; space < eachWordSpace; space++){
                s.append(" ");
            }

            if(extraSpace > 0){
                s.append(" ");
                extraSpace--;
            }


        }

        while(s.length() < MAX_WIDTH){
            s.append(" ");
        }

        return s.toString();
    }


    public List<String> fullJustify(String[] words, int maxWidth) {
        ArrayList<String> result = new ArrayList<>();
        int i=0;
        int n = words.length;
        MAX_WIDTH = maxWidth;

        while(i<n){
            int letterCount = words[i].length();
            int j = i+1;
            int spaceSlots =0;

            while(j<n && letterCount+spaceSlots + words[j].length() +1 <= maxWidth){
                letterCount += words[j].length();
                spaceSlots += 1;
                j++;
            }

            int remainingSpace = maxWidth - letterCount;

            int eachWordSpace = spaceSlots==0 ? 0 : remainingSpace / spaceSlots;
            int extraSpace = spaceSlots==0 ? 0 : remainingSpace % spaceSlots;


            if(j==n){
                eachWordSpace = 1;
                extraSpace =0;

            }

            result.add(findLine(i,j, words, eachWordSpace, extraSpace));
            i=j;

            
        }

        return result;
    }
}
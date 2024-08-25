class Solution {
    public String nearestPalindromic(String n) {
        int len = n.length();
        int mid = len/2;
        long firstHalf = Long.parseLong(n.substring(0, len%2==0? mid : mid+1));

        ArrayList<Long> list = new ArrayList<>();
        list.add(function(firstHalf, len%2==0));
        list.add(function(firstHalf+1, len%2==0));
        list.add(function(firstHalf-1, len%2==0));
        list.add((long)Math.pow(10,len)+1);
        list.add((long)Math.pow(10,len-1)-1);

        long originalNum = Long.parseLong(n);
        long result = Integer.MAX_VALUE;
        long diff = Integer.MAX_VALUE;

        for(long num : list){
            if(num == originalNum){
                continue;
            }

            if(Math.abs(num-originalNum)< diff){
                diff = Math.abs(num-originalNum);
                result = num;
            }
            else if(Math.abs(num-originalNum)==diff){
                result  = Math.min(result, num);
            }


        }

        return String.valueOf(result);

    }

    public static long function(long firstHalf, boolean isEven){
        long resultNum = firstHalf;
        if(!isEven){
            firstHalf  = firstHalf/10;
        }

        while(firstHalf > 0 ){
            int digit  = (int)firstHalf % 10;
            resultNum = (resultNum*10)+ digit;
            firstHalf = firstHalf/10;
        }

        return resultNum;
    }
}
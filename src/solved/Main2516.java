package solved;

public class Main2516 {

    public static void main(String[] args) {

        String s1 = "aabaaaacaabc", s2 = "a", s3 = "abc";
        int k1 = 2, k2 = 1, k3 = 1;

        System.out.println(takeCharacters(s1, k1));
        System.out.println(takeCharacters(s2, k2));
        System.out.println(takeCharacters(s3, k3));
    }

    public static int takeCharacters(String s, int k) {
        int[] arr = new int[3];
        char[] c = s.toCharArray();
        int cur,len = c.length;
        for(cur = 0; cur < len; cur++){
            arr[c[cur] - 'a']++;
            if(arr[0] >= k && arr[1] >= k && arr[2] >= k) break;
        }
        if(cur == len) return -1;
        int count = cur + 1,min = count,end = len - 1;
        while(cur >= 0){
            if(arr[c[cur] - 'a'] == k){
                while(c[cur] != c[end]){
                    arr[c[end] - 'a']++;
                    end--;
                    count++;
                }
                end--;
            }else{
                arr[c[cur] - 'a']--;
                count--;
                min = Math.min(count, min);
            }
            cur--;
        }
        return min;
    }
}

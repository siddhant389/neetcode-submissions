
class Solution {
  public class Element{
    int val;
    int freq;

    Element(int val, int freq) {
      this.val = val;
      this.freq = freq;
    }
  }
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Element> pq = new PriorityQueue<>((a,b) -> b.freq - a.freq);

        Map<Integer, Integer> map = new HashMap<>();

        for(int n : nums){
          map.merge(n, 1, Integer::sum);
        }

        map.forEach((key,value) -> {
          pq.offer(new Element(key,value));
        });

        int[] result = new int[k];
        
        for(int i=0; i < k; i++) {
          result[i] = pq.poll().val;
        }
        return result;
    }
}

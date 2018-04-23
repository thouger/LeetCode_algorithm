public class PlusAdd {
	/**
	 * 从个位数开始判断，判断是否为9，如果个位数都不为9的话，那么直接在个位数+1就好了
	 * 然后从后面一直往上走，遇9变0，遇到不是9加1并返回数组
	 * 只有一种情况才会遍历全部数组元素，就是数组全为9，这时候的话创建一个比长一个长度的数组，将第一位改为1就好了
	 */
	    public static int[] plusAdd(int[] digits) {
	        int n = digits.length;
	        for (int i = n - 1; i >= 0; --i) {
	            if (digits[i] == 9) {
	            	digits[i] = 0;
	            }else {
	                ++digits[i];
	                return digits;
	            }
	        }
            int[] new_digits=new int[n+1];
            new_digits[0]=1;
	        return new_digits;
	    }
	    public static void main(String[] args) {
	    	int[] result=plusAdd(new int[] {9,9});
	    	for (int i = 0; i < result.length; i++) {
				System.out.println(result[i]);
			}
		}
}

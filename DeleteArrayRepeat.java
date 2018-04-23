public class DeleteArrayRepeat {
	
	/**
		其實整個算法也就是將index作為計數標點
		遇到不一樣的+1，然後將不相同部分提前到index當前位置，然後index在計算它後面一個
		這個算法之所有會有用，是因為nums是一個已經排序好的數組，這才是最關鍵的
	 */
    public static int removeDuplicates(int[] nums) {
        int index=0;
		for (int i = 0; i < nums.length; i++) {
				if(nums[index]!=nums[i]) {
					index++;
					nums[index]=nums[i];
				}
			}
		    return index;
    }
	
	public static void main(String[] args) {
		int[] nums= {1,1,2};
		int number=removeDuplicates(nums);
		System.out.println(number);
	}
}
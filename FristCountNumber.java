/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
	说明：
	你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 */
package algorithm;
class FirstCountNumber {
	/**
	 * 
	 * 利用异或运算，两个相同的会为0，不相同的为1
	 * 在这里的话就是把两两出现的消掉，不相同（也就是单单出现的那个）会显示出来。
	 */
    public static int singleNumber(int[] nums) {
        int singleDog=nums[0];
        for (int i = 1; i < nums.length; i++) {
        	singleDog^=nums[i];
			}
        return singleDog;
		}
    public static void main(String[] args) {
		int result=singleNumber(new int[] {4,1,2,1,2});
		System.out.println(result);
	}
}
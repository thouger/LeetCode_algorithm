
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

class FirstCountNumber {
	/**
	 * 
	 * ����������㣬������ͬ�Ļ�Ϊ0������ͬ��Ϊ1
	 * ������Ļ����ǰ��������ֵ�����������ͬ��Ҳ���ǵ������ֵ��Ǹ�������ʾ������
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
public class PlusAdd {
	/**
	 * �Ӹ�λ����ʼ�жϣ��ж��Ƿ�Ϊ9�������λ������Ϊ9�Ļ�����ôֱ���ڸ�λ��+1�ͺ���
	 * Ȼ��Ӻ���һֱ�����ߣ���9��0����������9��1����������
	 * ֻ��һ������Ż����ȫ������Ԫ�أ���������ȫΪ9����ʱ��Ļ�����һ���ȳ�һ�����ȵ����飬����һλ��Ϊ1�ͺ���
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

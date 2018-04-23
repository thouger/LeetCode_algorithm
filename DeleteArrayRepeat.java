//给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
//
//不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
//
//示例 1:
//
//给定数组 nums = [1,1,2], 
//
//函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。 
//
//你不需要考虑数组中超出新长度后面的元素。
//示例 2:
//
//给定 nums = [0,0,1,1,1,2,2,3,3,4],
//
//函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
//
//你不需要考虑数组中超出新长度后面的元素。

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
					index+=1;
					nums[index]=nums[i];
				}
			}
		    return index+=1;
    }
	
	public static void main(String[] args) {
		int[] nums= {1,1,2};
		int number=removeDuplicates(nums);
		System.out.println(number);
	}
}
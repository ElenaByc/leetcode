/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNumber = function(nums) {
    nums.sort((a, b) => a - b);
    let flag = true;
    for(let i = 1; i < nums.length; i++) {
        if (flag && nums[i] !== nums[i - 1]) {
            return nums[i - 1];
        }
        if (flag && nums[i] === nums[i - 1]) {
            flag = false;
        } else {
            flag = true;
        }
    }
    if (flag) return nums[nums.length - 1]
};
/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function(nums) {
    let map = new Map();
    for (let i = 0; i < nums.length; i++) {
       if (map.has(nums[i])) {
           map.set(nums[i], true);
       } else {
           map.set(nums[i], false);
       }
    }

    for (let val of map.values()) {
        if (val) return true;
    }
    return false;
};
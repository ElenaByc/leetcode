/**
 * @param {number} numRows
 * @return {number[][]}
 */
var generate = function(numRows) {
    let triangle = [[1]];
    let arr;
    for (let i = 2; i <= numRows; i++) {
        arr = new Array(i);
        arr[0] = 1;
        arr[i - 1] = 1;
        for (let j = 1; j < i - 1; j++) {
            arr[j] = triangle[i - 2][j - 1] +  triangle[i - 2][j]
        }
        triangle.push(arr)
    }
    return triangle;
};
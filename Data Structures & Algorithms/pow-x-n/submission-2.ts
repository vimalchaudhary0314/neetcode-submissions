class Solution {
    /**
     * @param {number} x
     * @param {number} n
     * @return {number}
     */
    myPow(x: number, n: number): number {
        if(x === 0){
            return 0;
        }
        if(n === 0){
            return 1;
        }
        let res : number = 1;
        for(let i : number = 0; i < Math.abs(n); i++){
            res *= x;
        }
        return n >= 0 ? res : 1 / res;
    }
}

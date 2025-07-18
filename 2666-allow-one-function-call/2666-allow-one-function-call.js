/**
 * @param {Function} fn
 * @return {Function}
 */
var once = function(fn) {
    var hello = false;
    
    return function(...args){
        if(hello){
            return undefined;
        }
        hello = true;
        return fn(...args);
    }
};

/**
 * let fn = (a,b,c) => (a + b + c)
 * let onceFn = once(fn)
 *
 * onceFn(1,2,3); // 6
 * onceFn(2,3,6); // returns undefined without calling fn
 */

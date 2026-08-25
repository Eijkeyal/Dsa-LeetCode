/**
 * @param {Function} fn
 * @return {Function}
 */
function memoize(fn) {
    const cache = new Map();

    return function(...args) {
        // Convert the arguments array into a unique string key
        const key = JSON.stringify(args);

        // If the result exists in the cache, return it immediately
        if (cache.has(key)) {
            return cache.get(key);
        }

        // Execute the function, store the result in cache, and return it
        const result = fn(...args);
        cache.set(key, result);
        return result;
    }
}

/** 
 * Example usage:
 * let callCount = 0;
 * const memoizedFn = memoize(function (a, b) {
 *	 callCount += 1;
 *   return a + b;
 * })
 * memoizedFn(2, 2) // returns 4
 * memoizedFn(2, 2) // returns 4
 * console.log(callCount) // 1 
 */
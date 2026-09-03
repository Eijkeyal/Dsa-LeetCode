/**
 * @param {Function} fn
 * @param {Array} args
 * @param {number} t
 * @return {Function}
 */
var cancellable = function(fn, args, t) {
    // Schedule the execution of fn with args after t milliseconds
    const timerId = setTimeout(() => {
        fn(...args);
    }, t);
    
    // Return the cancel function that clears the scheduled timeout
    return function cancelFn() {
        clearTimeout(timerId);
    };
};
/**
 * @param {Function} fn
 * @param {number} t milliseconds
 * @return {Function}
 */
var debounce = function(fn, t) {
    let timer;

    return function(...args) {
        // Clear any existing timer to cancel the previous execution
        clearTimeout(timer);

        // Schedule a new execution after `t` milliseconds
        timer = setTimeout(() => {
            fn(...args);
        }, t);
    };
};
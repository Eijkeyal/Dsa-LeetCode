var TimeLimitedCache = function() {
    this.cache = new Map();
};

/** 
 * @param {number} key
 * @param {number} value
 * @param {number} duration time until expiration in ms
 * @return {boolean} if a non-expired key already existed
 */
TimeLimitedCache.prototype.set = function(key, value, duration) {
    const existing = this.cache.get(key);
    const keyExists = Boolean(existing);

    // Clear existing timer if key was already present
    if (keyExists) {
        clearTimeout(existing.timer);
    }

    // Set auto-deletion timer
    const timer = setTimeout(() => {
        this.cache.delete(key);
    }, duration);

    // Store value alongside timer reference
    this.cache.set(key, { value, timer });

    return keyExists;
};

/** 
 * @param {number} key
 * @return {number} value associated with key or -1
 */
TimeLimitedCache.prototype.get = function(key) {
    if (this.cache.has(key)) {
        return this.cache.get(key).value;
    }
    return -1;
};

/** 
 * @return {number} count of non-expired keys
 */
TimeLimitedCache.prototype.count = function() {
    return this.cache.size;
};
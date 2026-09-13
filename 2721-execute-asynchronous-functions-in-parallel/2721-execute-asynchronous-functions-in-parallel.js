/**
 * @param {Array<Function>} functions
 * @return {Promise<any>}
 */
var promiseAll = function(functions) {
    return new Promise((resolve, reject) => {
        const results = new Array(functions.length);
        let completedCount = 0;

        if (functions.length === 0) {
            resolve([]);
            return;
        }

        functions.forEach((fn, index) => {
            fn()
                .then((val) => {
                    results[index] = val;
                    completedCount++;
                    
                    if (completedCount === functions.length) {
                        resolve(results);
                    }
                })
                .catch((err) => {
                    reject(err);
                });
        });
    });
};